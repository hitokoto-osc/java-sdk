package cn.hitokoto.sdk;

import cn.hitokoto.RequestInterface;
import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;

public class UserInfo extends cn.hitokoto.Request implements RequestInterface
{
    public HttpResponse<String> request()
    {
        URI uri = new URI("/user");
        uri.withToken(this.getToken());

        return Request.get(uri);
    }
}
