package cn.hitokoto.tools;

import cn.hitokoto.Token;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

final public class URI
{
    private String              prefix = "https://hitokoto.cn/api/restful/v1";
    private StringBuilder       url    = new StringBuilder();
    private String              path;
    private String              anchor;
    private Map<String, String> params = new HashMap<>();

    URI(String path)
    {
        if (path.startsWith("https://") || path.startsWith("http://")) {
            this.prefix = path;
        } else {
            this.path = path;
        }
    }

    public void addParam(String key, String value)
    {
        params.put(key, value);
    }

    public java.net.URI build()
    {
        ArrayList<String> queryParams = new ArrayList<>();
        for (String key : params.keySet()) {
            queryParams.add(String.format("%s=%s", key, params.get(key)));
        }

        this.url.append(prefix);
        this.url.append(path);
        if (!queryParams.isEmpty()) {
            this.url.append("?");
            this.url.append(String.join("&", queryParams));
        }

        if (anchor != null) {
            this.url.append("#");
            this.url.append(anchor);
        }

        return java.net.URI.create(url.toString());
    }

    public static URI create(String path)
    {
        return new URI(path);
    }

    public URI withToken(Token token)
    {
        addParam("token", token.getToken());
        return this;
    }

    public URI withAnchor(String anchor)
    {
        this.anchor = anchor;
        return this;
    }
}
