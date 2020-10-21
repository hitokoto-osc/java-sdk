package cn.hitokoto.sdk;

import cn.hitokoto.beans.HitokotoResponse;
import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;
import com.google.gson.Gson;

import java.net.http.HttpResponse;
import java.util.HashMap;

public class Dingtalk extends cn.hitokoto.Request
{
    private String mirrorLink    = "https://v1.hitokoto.cn";
    private String dingTalkToken = "";

    @Override
    public HttpResponse<String> request()
    {
        Gson                 gson     = new Gson();
        HttpResponse<String> response = Request.get(cn.hitokoto.tools.URI.create(this.mirrorLink));
        HitokotoResponse     contents = gson.fromJson(response.body(), HitokotoResponse.class);

        return this.ding(dingTalkToken, contents.getFrom(), contents.getCreator(), contents.getHitokoto());
    }

    private HttpResponse<String> ding(String accessToken, String from, String creator, String hitokoto)
    {
        cn.hitokoto.tools.URI uri = new URI("https://oapi.dingtalk.com/robot/send");
        uri.addParam("access_token", accessToken);

        HashMap<String, String> markdown = new HashMap<>();
        markdown.put("title", "一言");
        markdown.put("text", String.format("**%s**\n> %s「%s」", hitokoto, creator, from));

        HashMap<String, Object> body = new HashMap<>();
        body.put("msgtype", "markdown");
        body.put("markdown", markdown);

        return Request.post(uri, body);
    }

    public void setMirrorLink(String mirrorLink)
    {
        this.mirrorLink = mirrorLink;
    }

    public void setDingTalkToken(String dingTalkToken)
    {
        this.dingTalkToken = dingTalkToken;
    }
}
