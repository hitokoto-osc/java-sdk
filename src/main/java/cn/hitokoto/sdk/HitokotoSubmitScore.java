package cn.hitokoto.sdk;

import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;
import java.util.HashMap;

public class HitokotoSubmitScore extends cn.hitokoto.Request
{
    private String  uuid    = "";
    private Integer score   = 3;
    private String  comment = "";

    public HttpResponse<String> request()
    {
        URI uri = new URI("/hitokoto/" + uuid + "/score");
        uri.withToken(this.getToken());

        HashMap<String, Object> data = new HashMap<>();
        data.put("score", score);
        data.put("comment", comment);

        return Request.post(uri, data);
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }

    public void setScore(Integer score)
    {
        this.score = score;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }
}
