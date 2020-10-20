package cn.hitokoto.tools;

public class Env
{
    // 获取环境变量
    public static String get(String name)
    {
        return System.getenv(name);
    }

    // 判断环境变量是否存在
    public static boolean exists(String name)
    {
        return get(name) != null;
    }
}
