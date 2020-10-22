package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import cn.hitokoto.Token;
import cn.hitokoto.beans.Hitokoto;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserHitokotoHistoryTest
{
    @Test
    void request()
    {
        Client           client  = new Client(Token.use(""));
        UserHitokotoHistory request = new UserHitokotoHistory();
        request.setLimit(10);
        Response response = client.getObjectResponse(request);

        Assertions.assertEquals((int) response.getStatusCode(), 200);

        // 解析数据规模
        JSONObject result = new JSONObject(response.getResponse());
        System.out.println(String.format("数据规模：%d 条", result.getJSONObject("statistics").getInt("total")));
    }
}
