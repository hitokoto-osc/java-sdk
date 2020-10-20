package cn.hitokoto.sdk;

import cn.hitokoto.beans.DingtalkResponse;
import cn.hitokoto.beans.HitokotoResponse;
import cn.hitokoto.tools.Env;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Dingtalk
{
    private String mirrorLink    = "https://v1.hitokoto.cn";
    private String dingTalkToken = "";

    {
        this.getEnv();
    }

    public void getEnv()
    {
        if (Env.exists("HITOKOTO_MIRROR")) {
            mirrorLink = Env.get("HITOKOTO_MIRROR");
        }

        if (Env.exists("DINGTALK_TOKEN")) {
            dingTalkToken = Env.get("DINGTALK_TOKEN");
        }
    }

    public String ding()
    {
        // 获取一言
        Hitokoto hitokoto = new Hitokoto(mirrorLink);
        try {
            HitokotoResponse contents = hitokoto.getOne();

            // 构建数据
            String data = this.makeData(contents.getFrom(), contents.getCreator(), contents.getHitokoto());

            // 发送给钉钉
            String           message          = "success";
            DingtalkResponse dingtalkResponse = this.postWithJson(dingTalkToken, data);
            if (dingtalkResponse.getErrcode() != 0) {
                message = dingtalkResponse.getErrmsg();
            }

            return message;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    public DingtalkResponse postWithJson(String accessToken, String data) throws IOException, InterruptedException
    {
        URI        uri     = URI.create("https://oapi.dingtalk.com/robot/send?access_token=" + accessToken);
        HttpClient builder = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(uri)
                                         .header("Content-Type", "application/json")
                                         .POST(HttpRequest.BodyPublishers.ofString(data))
                                         .build();

        String body = builder.send(request, HttpResponse.BodyHandlers.ofString()).body();

        Gson gson = new Gson();
        return gson.fromJson(body, DingtalkResponse.class);
    }

    public String makeData(String from, String creator, String hitokoto)
    {
        String json = "{\"msgtype\":\"markdown\",\"markdown\":{\"title\":\"一言\",\"text\":\"**%s** \n> %s「%s」\"}}";
        return String.format(json, hitokoto, creator, from);
    }
}
