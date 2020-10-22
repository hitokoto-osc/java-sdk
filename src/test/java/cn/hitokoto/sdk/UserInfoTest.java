package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import cn.hitokoto.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserInfoTest
{
    @Test
    void request()
    {
        Client                     client   = new Client(Token.use(""));
        UserInfo                   request  = new UserInfo();
        Response                   response = client.getObjectResponse(request);
        cn.hitokoto.beans.UserInfo user     = response.wrap(cn.hitokoto.beans.UserInfo.class);

        Assertions.assertEquals((int) response.getStatusCode(), 200);
        System.out.println("name: " + user.getName());
        System.out.println("email: " + user.getEmail());
    }
}
