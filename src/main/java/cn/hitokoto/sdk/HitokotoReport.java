package cn.hitokoto.sdk;

import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;
import java.util.HashMap;

public class HitokotoReport extends cn.hitokoto.Request
{
    private String uuid    = "";
    private String comment = "";

    public HttpResponse<String> request()
    {
        URI uri = new URI("/hitokoto/" + uuid + "/report");
        uri.withToken(this.getToken());

        HashMap<String, String> data = new HashMap<>();
        data.put("comment", comment);

        return Request.post(uri, data);
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }
}
