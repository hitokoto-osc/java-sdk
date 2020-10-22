package cn.hitokoto.sdk;

import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;
import java.util.HashMap;

public class HitokotoClickLike extends cn.hitokoto.Request
{
    private String sentence_uuid = "";

    public HttpResponse<String> request()
    {
        URI uri = new URI("/like");

        HashMap<String, String> data = new HashMap<>();
        data.put("sentence_uuid", sentence_uuid);

        return Request.post(uri, data);
    }

    public void setUuid(String sentence_uuid)
    {
        this.sentence_uuid = sentence_uuid;
    }
}
