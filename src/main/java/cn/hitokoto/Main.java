package cn.hitokoto;

import cn.hitokoto.sdk.Dingtalk;

public class Main
{
    public static void main(String[] args)
    {
        Dingtalk dingtalk = new Dingtalk();
        String   result   = dingtalk.ding();

        System.out.printf("\033[32m %s \033[0m", result);
    }
}
