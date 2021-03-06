package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HitokotoClickLikeTest
{
    @Test
    void request()
    {
        Client            client  = new Client();
        HitokotoClickLike request = new HitokotoClickLike();
        request.setUuid("33b70aae-a6ad-4909-9c00-dd7f901ee21c");
        Response response = client.getObjectResponse(request);

        Assertions.assertEquals((int) response.getStatusCode(), -1);
        System.out.println(response.getBody());
    }
}
