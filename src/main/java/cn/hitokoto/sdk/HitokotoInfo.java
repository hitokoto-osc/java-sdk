package cn.hitokoto.sdk;

import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;

public class HitokotoInfo extends cn.hitokoto.Request
{
    private String uuid = "";

    public HttpResponse<String> request()
    {
        URI uri = new URI("/hitokoto/" + uuid);
        uri.withToken(this.getToken());

        return Request.get(uri);
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }
}
