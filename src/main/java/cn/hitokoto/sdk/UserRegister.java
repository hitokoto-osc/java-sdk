package cn.hitokoto.sdk;

import cn.hitokoto.RequestInterface;
import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;
import java.util.HashMap;

public class UserRegister extends cn.hitokoto.Request implements RequestInterface
{
    private String name;
    private String email;
    private String password;

    public HttpResponse<String> request()
    {
        HashMap<String, String> data = new HashMap<>();
        data.put("name", name);
        data.put("email", email);
        data.put("password", password);

        return Request.post(URI.create("/auth/register"), data);
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
