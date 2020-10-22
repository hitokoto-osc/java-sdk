package cn.hitokoto.sdk;

import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;

public class UserHitokotoHistory extends cn.hitokoto.Request
{
    private Integer offset = 0;
    private Integer limit  = 15;

    public HttpResponse<String> request()
    {
        URI uri = new URI("/user/hitokoto/history");
        uri.withToken(this.getToken());

        return Request.get(uri);
    }

    public void setOffset(Integer offset)
    {
        this.offset = offset;
    }

    public void setLimit(Integer limit)
    {
        this.limit = limit;
    }
}
