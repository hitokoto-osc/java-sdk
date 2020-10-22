package cn.hitokoto.sdk;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import cn.hitokoto.beans.LikeUser;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HitokotoLikeTest
{
    @Test
    void request()
    {
        Client       client  = new Client();
        HitokotoLike request = new HitokotoLike();
        request.setUuid("33b70aae-a6ad-4909-9c00-dd7f901ee21c");
        Response response = client.getObjectResponse(request);

        Assertions.assertEquals((int) response.getStatusCode(), 200);

        // 解析数据规模
        JSONObject result = new JSONObject(response.getResponse());
        System.out.println(String.format("数据规模：%d 条", result.getInt("total")));

        // 解析列表
        JSONArray  collection = result.getJSONArray("sets");
        Gson       gson       = new Gson();
        LikeUser[] list       = gson.fromJson(collection.toString(), LikeUser[].class);
        for (LikeUser it : list) {
            System.out.println(String.format("uid: %s \t\t 于 %s 点击了 like", it.getUser_id(), it.getCreated_time()));
        }
    }
}
