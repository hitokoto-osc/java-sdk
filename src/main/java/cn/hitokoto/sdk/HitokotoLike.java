package cn.hitokoto.sdk;

import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;

public class HitokotoLike extends cn.hitokoto.Request
{
    private String sentence_uuid = "";

    public HttpResponse<String> request()
    {
        URI uri = new URI("/like");
        uri.addParam("sentence_uuid", sentence_uuid);

        return Request.get(uri);
    }

    public void setUuid(String sentence_uuid)
    {
        this.sentence_uuid = sentence_uuid;
    }
}
