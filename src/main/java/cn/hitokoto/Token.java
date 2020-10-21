package cn.hitokoto;

import cn.hitokoto.beans.UserInfo;
import cn.hitokoto.sdk.UserLogin;

public class Token
{
    private String token       = "";
    private int    tokenLength = 40;

    public static Token use(String token)
    {
        Token profile = new Token();
        profile.token = token;
        return profile;
    }

    public static Token empty()
    {
        return use("");
    }

    public static Token autoFetch(String email, String password)
    {
        Client    client    = new Client(Token.empty());
        UserLogin userLogin = new UserLogin();
        userLogin.setEmail(email);
        userLogin.setPassword(password);
        Response response = client.getObjectResponse(userLogin);
        if (response.getStatusCode() != 200) {
            throw new RuntimeException(response.getMessage());
        }

        return use(response.wrap(UserInfo.class).getToken());
    }

    public String getToken()
    {
        return token;
    }

    public boolean isEmpty()
    {
        return this.token.length() != this.tokenLength;
    }

    public String getQueryString()
    {
        return String.format("?token=%s", this.token);
    }
}
