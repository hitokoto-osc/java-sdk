package cn.hitokoto.sdk;

import cn.hitokoto.beans.HitokotoResponse;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Hitokoto
{
    private final String mirrorLink;

    public Hitokoto(String mirrorLink)
    {
        this.mirrorLink = mirrorLink;
    }

    public HitokotoResponse getOne() throws IOException, InterruptedException
    {
        HttpClient  client  = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(this.mirrorLink)).build();

        HttpResponse.BodyHandler<String> responseBodyHandler = HttpResponse.BodyHandlers.ofString();
        HttpResponse<String>             response;
        response = client.send(request, responseBodyHandler);
        Gson gson = new Gson();

        return gson.fromJson(response.body(), HitokotoResponse.class);
    }
}
