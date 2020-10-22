package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import cn.hitokoto.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserChangeEmailTest
{
    @Test
    @DisplayName("邮件被占用测试")
    void testEmailError()
    {
        Client          client  = new Client(Token.use(""));
        UserChangeEmail request = new UserChangeEmail();
        request.setNewEmail("");
        request.setPassword("");
        Response response = client.getObjectResponse(request);
        Assertions.assertEquals((int) response.getStatusCode(), 403);

        System.out.println(response.getMessage());
    }

    @Test
    @DisplayName("密码错误尝试")
    void testPasswordError()
    {
        Client          client  = new Client(Token.use(""));
        UserChangeEmail request = new UserChangeEmail();
        request.setNewEmail("");
        request.setPassword("");
        Response response = client.getObjectResponse(request);
        Assertions.assertEquals((int) response.getStatusCode(), -2);

        System.out.println(response.getMessage());
    }
}
