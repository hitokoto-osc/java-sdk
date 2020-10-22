package cn.hitokoto.sdk;

import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;

public class UserToken extends cn.hitokoto.Request
{
    public HttpResponse<String> request()
    {
        URI uri = new URI("/user/token");
        uri.withToken(this.getToken());

        return Request.get(uri);
    }
}
