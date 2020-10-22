package cn.hitokoto.beans;

public class UserNotificationSettings
{
    private Integer id;
    private Integer user_id;
    private Integer email_notification_global;
    private Integer email_notification_hitokoto_appended;
    private Integer email_notification_hitokoto_reviewed;
    private Integer email_notification_poll_created;
    private Integer email_notification_poll_result;
    private Integer email_notification_poll_daily_report;
    private String  created_at;
    private String  updated_at;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getUser_id()
    {
        return user_id;
    }

    public void setUser_id(Integer user_id)
    {
        this.user_id = user_id;
    }

    public Integer getEmail_notification_global()
    {
        return email_notification_global;
    }

    public void setEmail_notification_global(Integer email_notification_global)
    {
        this.email_notification_global = email_notification_global;
    }

    public Integer getEmail_notification_hitokoto_appended()
    {
        return email_notification_hitokoto_appended;
    }

    public void setEmail_notification_hitokoto_appended(Integer email_notification_hitokoto_appended)
    {
        this.email_notification_hitokoto_appended = email_notification_hitokoto_appended;
    }

    public Integer getEmail_notification_hitokoto_reviewed()
    {
        return email_notification_hitokoto_reviewed;
    }

    public void setEmail_notification_hitokoto_reviewed(Integer email_notification_hitokoto_reviewed)
    {
        this.email_notification_hitokoto_reviewed = email_notification_hitokoto_reviewed;
    }

    public Integer getEmail_notification_poll_created()
    {
        return email_notification_poll_created;
    }

    public void setEmail_notification_poll_created(Integer email_notification_poll_created)
    {
        this.email_notification_poll_created = email_notification_poll_created;
    }

    public Integer getEmail_notification_poll_result()
    {
        return email_notification_poll_result;
    }

    public void setEmail_notification_poll_result(Integer email_notification_poll_result)
    {
        this.email_notification_poll_result = email_notification_poll_result;
    }

    public Integer getEmail_notification_poll_daily_report()
    {
        return email_notification_poll_daily_report;
    }

    public void setEmail_notification_poll_daily_report(Integer email_notification_poll_daily_report)
    {
        this.email_notification_poll_daily_report = email_notification_poll_daily_report;
    }

    public String getCreated_at()
    {
        return created_at;
    }

    public void setCreated_at(String created_at)
    {
        this.created_at = created_at;
    }

    public String getUpdated_at()
    {
        return updated_at;
    }

    public void setUpdated_at(String updated_at)
    {
        this.updated_at = updated_at;
    }
}
