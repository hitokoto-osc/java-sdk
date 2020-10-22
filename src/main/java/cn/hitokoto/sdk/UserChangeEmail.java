package cn.hitokoto.sdk;

import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;
import java.util.HashMap;

public class UserChangeEmail extends cn.hitokoto.Request
{
    private String newEmail;
    private String password;

    public HttpResponse<String> request()
    {
        HashMap<String, Object> data = new HashMap<>();
        data.put("password", password);
        data.put("email", newEmail);

        URI uri = URI.create("/user/email");
        uri.withToken(this.getToken());
        return Request.put(uri, data);
    }

    public void setNewEmail(String newEmail)
    {
        this.newEmail = newEmail;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
