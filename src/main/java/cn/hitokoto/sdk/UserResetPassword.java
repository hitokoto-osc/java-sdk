package cn.hitokoto.sdk;

import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;
import java.util.HashMap;

public class UserResetPassword extends cn.hitokoto.Request
{
    private String password;
    private String newPassword;

    public HttpResponse<String> request()
    {
        HashMap<String, Object> data = new HashMap<>();
        data.put("password", password);
        data.put("new_password", newPassword);

        URI uri = URI.create("/user/password");
        uri.withToken(this.getToken());
        return Request.put(uri, data);
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setNewPassword(String newPassword)
    {
        this.newPassword = newPassword;
    }
}
