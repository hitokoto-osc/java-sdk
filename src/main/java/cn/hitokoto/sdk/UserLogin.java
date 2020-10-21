package cn.hitokoto.sdk;

import cn.hitokoto.RequestInterface;
import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;
import java.util.HashMap;

public class UserLogin extends cn.hitokoto.Request implements RequestInterface
{
    private String email;
    private String password;

    public HttpResponse<String> request()
    {
        HashMap<String, String> data = new HashMap<>();
        data.put("email", email);
        data.put("password", password);

        return Request.post(URI.create("/auth/login"), data);
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
