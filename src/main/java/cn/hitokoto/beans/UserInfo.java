package cn.hitokoto.beans;

public class UserInfo
{
    private Integer id;
    private String  name;
    private String  email;
    private Integer is_suspended;
    private Integer is_admin;
    private Integer is_reviewer;
    private String  email_verified_at;
    private String  created_from;
    private String  created_at;
    private String  updated_at;
    private String  token;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Integer getIsSuspended()
    {
        return is_suspended;
    }

    public void setIsSuspended(Integer is_suspended)
    {
        this.is_suspended = is_suspended;
    }

    public Integer getIsAdmin()
    {
        return is_admin;
    }

    public void setIsAdmin(Integer is_admin)
    {
        this.is_admin = is_admin;
    }

    public Integer getIsReviewer()
    {
        return is_reviewer;
    }

    public void setIsReviewer(Integer is_reviewer)
    {
        this.is_reviewer = is_reviewer;
    }

    public String getEmailVerifiedAt()
    {
        return email_verified_at;
    }

    public void setEmailVerifiedAt(String email_verified_at)
    {
        this.email_verified_at = email_verified_at;
    }

    public String getCreatedFrom()
    {
        return created_from;
    }

    public void setCreatedFrom(String created_from)
    {
        this.created_from = created_from;
    }

    public String getCreatedAt()
    {
        return created_at;
    }

    public void setCreatedAt(String created_at)
    {
        this.created_at = created_at;
    }

    public String getUpdatedAt()
    {
        return updated_at;
    }

    public void setUpdatedAt(String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }
}
