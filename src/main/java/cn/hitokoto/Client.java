package cn.hitokoto;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.http.HttpResponse;

public class Client
{
    private Token token;

    public Client(Token profile)
    {
        this.token = profile;
    }

    public Client()
    {
        this.token = Token.empty();
    }

    public Response getObjectResponse(Request request)
    {
        Response response = getListResponse(request);
        if (response.getStatusCode() == 200) {
            JSONArray result = new JSONArray(response.getResponse());
            if (result.length() > 0) {
                response.setResponse(result.get(0).toString());
            }
        }

        return response;
    }

    public Response getListResponse(Request request)
    {
        request.setToken(token);
        HttpResponse<String> requestResponse = request.request();
        JSONObject           result          = new JSONObject(requestResponse.body());

        Response response = new Response();
        response.setBody(requestResponse.body());
        response.setStatusCode(result.getInt("status"));
        response.setMessage(result.getString("message"));
        if (response.getStatusCode() == 200) {
            response.setResponse(result.getJSONArray("data").toString());
        }

        return response;
    }
}
