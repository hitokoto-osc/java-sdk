package cn.hitokoto.tools;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.util.Map;

public class Request
{
    public static HttpResponse<String> get(URI uri)
    {
        HttpClient          client      = HttpClient.newHttpClient();
        HttpRequest         request     = HttpRequest.newBuilder(uri.build()).build();
        BodyHandler<String> bodyHandler = HttpResponse.BodyHandlers.ofString();

        try {
            return client.send(request, bodyHandler);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static HttpResponse<String> post(URI uri, Object body)
    {
        Gson                gson        = new Gson();
        HttpClient          client      = HttpClient.newHttpClient();
        BodyHandler<String> bodyHandler = HttpResponse.BodyHandlers.ofString();
        HttpRequest request = HttpRequest.newBuilder(uri.build())
                                         .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(body)))
                                         .header("Content-Type", "application/json")
                                         .build();

        try {
            return client.send(request, bodyHandler);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static HttpResponse<String> put(URI uri, Map<String, Object> body)
    {
        body.put("_method", "PUT");
        return post(uri, body);
    }
}
