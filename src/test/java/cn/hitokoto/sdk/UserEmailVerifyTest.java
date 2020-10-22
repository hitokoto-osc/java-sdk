package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import cn.hitokoto.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserEmailVerifyTest
{
    @Test
    void request()
    {
        Client          client   = new Client(Token.use(""));
        UserEmailVerify request  = new UserEmailVerify();
        Response        response = client.getObjectResponse(request);

        Assertions.assertEquals((int) response.getStatusCode(), -1);
        System.out.println(response.getMessage());
    }
}
