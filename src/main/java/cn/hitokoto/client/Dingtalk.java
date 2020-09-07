package cn.hitokoto.client;

import cn.hitokoto.client.beans.DingtalkResponse;
import cn.hitokoto.client.beans.HitokotoResponse;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Dingtalk
{
    private static final String mirrorLink    = "https://v1.hitokoto.cn";
    private static final String dingTalkToken = "";

    public String ding()
    {
        // 获取一言
        Hitokoto hitokoto = new Hitokoto(mirrorLink);
        try {
            HitokotoResponse contents = hitokoto.getOne();

            // 构建数据
            Dingtalk dingtalk = new Dingtalk();
            String   data     = dingtalk.makeData(contents.getFrom(), contents.getCreator(), contents.getHitokoto());

            // 发送给钉钉
            String           message          = "success";
            DingtalkResponse dingtalkResponse = dingtalk.postWithJson(dingTalkToken, data);
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
        String json = "{\"msgtype\":\"markdown\",\"markdown\":{\"title\":\"一言\",\"text\":\"**%s** > %s「%s」\"}}";
        return String.format(json, hitokoto, creator, from);
    }
}
