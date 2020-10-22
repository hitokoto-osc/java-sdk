package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import cn.hitokoto.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserNotificationSettingsUpdateTest
{
    @Test
    void request()
    {
        Client                         client  = new Client(Token.use(""));
        UserNotificationSettingsUpdate request = new UserNotificationSettingsUpdate();
        request.setHitokoto_reviewed(false);
        request.setPoll_created(false);
        request.setPoll_result(false);

        Response response = client.getObjectResponse(request);
        Assertions.assertEquals((int) response.getStatusCode(), 200);

        System.out.println(response.getMessage());
    }
}
