/**
 *
 * Free License
 */
package cb.project.action;

import cb.project.model.ModelUser;
import cb.project.service.ServiceUser;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public class ActionLogin extends ActionSupport {

    private ModelUser objUser;

    @Autowired
    @Qualifier("impl1")
    private ServiceUser oService;

    public ModelUser getObjUser() {
        return objUser;
    }

    public void setObjUser(ModelUser objUser) {
        this.objUser = objUser;
    }

    public String login() {
        if (oService.login(objUser)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

}
