package cn.hitokoto.sdk;

import cn.hitokoto.RequestInterface;
import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;
import java.util.HashMap;

public class UserRequestResetPassword extends cn.hitokoto.Request implements RequestInterface
{
    private String email;

    public HttpResponse<String> request()
    {
        HashMap<String, String> data = new HashMap<>();
        data.put("email", email);

        return Request.post(URI.create("/auth/password/reset"), data);
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

}
