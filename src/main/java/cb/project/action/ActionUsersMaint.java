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
public class ActionUsersMaint extends ActionSupport {

    @Autowired
    @Qualifier("impl1")
    private ServiceUser oService;

    private ModelUser objUser;

    public ModelUser getObjUser() {
        return objUser;
    }

    public void setObjUser(ModelUser objUser) {
        this.objUser = objUser;
    }

    @Override
    public String execute() throws Exception {
        objUser = new ModelUser();
        return SUCCESS;
    }

    public String save() {
        if (oService.save(objUser)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
