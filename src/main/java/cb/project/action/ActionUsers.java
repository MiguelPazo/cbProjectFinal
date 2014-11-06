/**
 *
 * Free License
 */
package cb.project.action;

import cb.project.model.ModelUser;
import cb.project.service.ServiceUser;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public class ActionUsers extends ActionSupport {

    @Autowired
    @Qualifier("impl1")
    private ServiceUser oService;

    private List<ModelUser> lstUser;

    public List<ModelUser> getLstUser() {
        return lstUser;
    }

    public void setLstUser(List<ModelUser> lstUser) {
        this.lstUser = lstUser;
    }

    @Override
    public String execute() throws Exception {
        try {
            lstUser = oService.fetchAll();
            return SUCCESS;
        } catch (Exception e) {
            return ERROR;
        }
    }

}
