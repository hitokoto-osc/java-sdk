package cn.hitokoto.sdk;

import org.junit.jupiter.api.Test;

class DingtalkTest
{
    @Test
    void request()
    {
        Dingtalk request = new Dingtalk();
        request.setDingTalkToken("");
        if (request.request().statusCode() == 200) {
            System.out.println("success");
        }
    }
}
