package cn.hitokoto;

import java.net.http.HttpResponse;

public interface RequestInterface
{
    /**
     * 请求
     * @return
     */
    HttpResponse<String> request();
}
