package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegisterTest
{
    @Test
    void request()
    {
        Client       client   = new Client();
        UserRegister register = new UserRegister();
        register.setName("Alex");
        register.setEmail("im@println.org");
        register.setPassword("123456");
        Response response = client.getListResponse(register);

        Assertions.assertEquals((int) response.getStatusCode(), -1);
        System.out.println("success");
    }
}
