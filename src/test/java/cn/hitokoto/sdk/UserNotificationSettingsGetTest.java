package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import cn.hitokoto.Token;
import cn.hitokoto.beans.UserNotificationSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserNotificationSettingsGetTest
{
    @Test
    void request()
    {
        Client                      client   = new Client(Token.use(""));
        UserNotificationSettingsGet request  = new UserNotificationSettingsGet();
        Response                    response = client.getObjectResponse(request);

        Assertions.assertEquals((int) response.getStatusCode(), 200);
        UserNotificationSettings notificationSettings = response.wrap(UserNotificationSettings.class);
        System.out.println(notificationSettings.getUser_id());
    }
}
