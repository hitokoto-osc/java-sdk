package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import cn.hitokoto.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HitokotoCancelLikeTest
{
    @Test
    void request()
    {
        Client            client  = new Client(Token.use(""));
        HitokotoCancelLike request = new HitokotoCancelLike();
        request.setUuid("33b70aae-a6ad-4909-9c00-dd7f901ee21c");
        Response response = client.getObjectResponse(request);

        Assertions.assertEquals((int) response.getStatusCode(), 200);
        System.out.println(response.getBody());
    }
}
