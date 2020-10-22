package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import cn.hitokoto.Token;
import cn.hitokoto.beans.Hitokoto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HitokotoSubmitScoreTest
{
    @Test
    void request()
    {
        Client              client  = new Client(Token.use(""));
        HitokotoSubmitScore request = new HitokotoSubmitScore();
        request.setScore(5);
        request.setComment("我很喜欢");
        request.setUuid("33b70aae-a6ad-4909-9c00-dd7f901ee21c");
        Response response = client.getObjectResponse(request);

        Assertions.assertEquals((int) response.getStatusCode(), -1);
        System.out.println(response.getMessage());
    }
}
