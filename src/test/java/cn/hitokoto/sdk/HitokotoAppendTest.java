package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import cn.hitokoto.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HitokotoAppendTest
{
    @Test
    void request()
    {
        Client             client  = new Client(Token.use(""));
        HitokotoAppend request = new HitokotoAppend();
        request.setFrom("");
        request.setFrom_who("");
        request.setType("");
        request.setHitokoto("");
        Response response = client.getObjectResponse(request);

        Assertions.assertEquals((int) response.getStatusCode(), 400);
        System.out.println(response.getMessage());
    }
}
