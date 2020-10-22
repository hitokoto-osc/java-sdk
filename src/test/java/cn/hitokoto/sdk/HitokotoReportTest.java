package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import cn.hitokoto.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HitokotoReportTest
{
    @Test
    void request()
    {
        Client         client  = new Client(Token.use(""));
        HitokotoReport request = new HitokotoReport();
        request.setComment("开发 sdk 测试，100101001010100101010");
        request.setUuid("4d1afffd-dc42-41f6-94d4-7c023b37df7e");
        Response response = client.getObjectResponse(request);

        System.out.println(response.getBody());
        Assertions.assertEquals((int) response.getStatusCode(), 200);
        System.out.println(response.getResponse());
    }
}
