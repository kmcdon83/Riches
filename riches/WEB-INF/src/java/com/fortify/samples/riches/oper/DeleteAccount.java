package com.checkmarx.samples.riches.oper;

import com.checkmarx.samples.riches.AdminSupport;
import com.checkmarx.samples.riches.model.Account;
import com.checkmarx.samples.riches.model.AccountService;
import com.checkmarx.samples.riches.model.Profile;
import com.checkmarx.samples.riches.model.ProfileService;
import java.util.List;
import org.apache.struts2.ServletActionContext;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.checkmarx.samples.riches:
//            AdminSupport

public class DeleteAccount extends AdminSupport
{
    private List profiles;

    public DeleteAccount()
    {
    }

    public String execute() throws Exception
    {
        javax.servlet.http.HttpServletRequest request = ServletActionContext.getRequest();
        profiles = ProfileService.getAllProfiles();
        super.execute();
        return "success";
    }

    public List getProfiles()
    {
        return profiles;
    }

    public void setProfiles(List profiles)
    {
        this.profiles = profiles;
    }
}
