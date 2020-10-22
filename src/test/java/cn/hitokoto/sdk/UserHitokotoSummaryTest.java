package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import cn.hitokoto.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserHitokotoSummaryTest
{
    @Test
    void request()
    {
        Client              client   = new Client(Token.use(""));
        UserHitokotoSummary request  = new UserHitokotoSummary();
        Response            response = client.getObjectResponse(request);
        Assertions.assertEquals((int) response.getStatusCode(), 200);

        System.out.println(response.getBody());
    }
}
