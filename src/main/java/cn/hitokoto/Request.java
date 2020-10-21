package cn.hitokoto;

public abstract class Request implements RequestInterface
{
    private   Token    token;
    protected Response response = new Response();

    public void setToken(Token token)
    {
        this.token = token;
    }

    public Token getToken()
    {
        return token;
    }
}
