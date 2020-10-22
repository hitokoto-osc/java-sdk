package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import cn.hitokoto.Token;
import cn.hitokoto.beans.Hitokoto;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HitokotoInfoTest
{
    @Test
    void request()
    {
        Client       client  = new Client(Token.use(""));
        HitokotoInfo request = new HitokotoInfo();
        request.setUuid("33b70aae-a6ad-4909-9c00-dd7f901ee21c");
        Response response = client.getObjectResponse(request);

        Assertions.assertEquals((int) response.getStatusCode(), 200);
        Hitokoto hitokoto = response.wrap(Hitokoto.class);

        System.out.println(hitokoto);
    }
}
