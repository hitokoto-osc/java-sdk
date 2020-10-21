package cn.hitokoto;

import com.google.gson.Gson;

public class Response
{
    private Integer statusCode;
    private String  response = "";
    private String  message  = "";
    private String  body     = "";

    public <T> T wrap(Class<T> classOfT)
    {
        Gson gson = new Gson();
        return gson.fromJson(getResponse(), classOfT);
    }

    public Integer getStatusCode()
    {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode)
    {
        this.statusCode = statusCode;
    }

    public String getResponse()
    {
        return response;
    }

    public void setResponse(String response)
    {
        this.response = response;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getBody()
    {
        return body;
    }

    public void setBody(String body)
    {
        this.body = body;
    }
}
