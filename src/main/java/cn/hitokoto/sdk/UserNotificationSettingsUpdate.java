package cn.hitokoto.sdk;

import cn.hitokoto.tools.Request;
import cn.hitokoto.tools.URI;

import java.net.http.HttpResponse;
import java.util.HashMap;

public class UserNotificationSettingsUpdate extends cn.hitokoto.Request
{
    private Boolean global            = true;
    private Boolean hitokoto_appended = true;
    private Boolean hitokoto_reviewed = true;
    private Boolean poll_created      = true;
    private Boolean poll_result       = true;
    private Boolean poll_report_daily = true;

    public HttpResponse<String> request()
    {
        URI uri = new URI("/user/notification/settings");
        uri.withToken(this.getToken());

        HashMap<String, Object> data = new HashMap<>();
        data.put("email_global", global);
        data.put("email_hitokoto_appended", hitokoto_appended);
        data.put("email_hitokoto_reviewed", hitokoto_reviewed);
        data.put("email_poll_created", poll_created);
        data.put("email_poll_result", poll_result);
        data.put("email_poll_report_daily", poll_report_daily);

        return Request.put(uri, data);
    }

    public void setGlobal(Boolean global)
    {
        this.global = global;
    }

    public void setHitokoto_appended(Boolean hitokoto_appended)
    {
        this.hitokoto_appended = hitokoto_appended;
    }

    public void setHitokoto_reviewed(Boolean hitokoto_reviewed)
    {
        this.hitokoto_reviewed = hitokoto_reviewed;
    }

    public void setPoll_created(Boolean poll_created)
    {
        this.poll_created = poll_created;
    }

    public void setPoll_result(Boolean poll_result)
    {
        this.poll_result = poll_result;
    }

    public void setPoll_report_daily(Boolean poll_report_daily)
    {
        this.poll_report_daily = poll_report_daily;
    }
}
