package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRequestResetPasswordTest
{
    @Test
    void request()
    {
        Client                   client  = new Client();
        UserRequestResetPassword request = new UserRequestResetPassword();
        request.setEmail("im@println.org");
        Response response = client.getListResponse(request);

        Assertions.assertEquals((int) response.getStatusCode(), 200);
    }
}
