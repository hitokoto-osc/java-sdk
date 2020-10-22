package cn.hitokoto.sdk;

import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;
import java.util.HashMap;

public class HitokotoAppend extends cn.hitokoto.Request
{
    private String from     = "";
    private String from_who = "";
    private String hitokoto = "";
    private String type     = "";

    public HttpResponse<String> request()
    {
        URI uri = new URI("/hitokoto/append");
        uri.withToken(this.getToken());

        HashMap<String, String> data = new HashMap<>();
        data.put("type", type);
        data.put("hitokoto", hitokoto);
        data.put("from_who", from_who);
        data.put("from", from);

        return Request.post(uri, data);
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    public void setFrom_who(String from_who)
    {
        this.from_who = from_who;
    }

    public void setHitokoto(String hitokoto)
    {
        this.hitokoto = hitokoto;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
