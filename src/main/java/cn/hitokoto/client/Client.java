package cn.hitokoto.client;

public class Client
{
    public static void main(String[] args)
    {
        Dingtalk dingtalk = new Dingtalk();
        String   result   = dingtalk.ding();

        System.out.printf("\033[32m %s \033[0m", result);
    }
}
