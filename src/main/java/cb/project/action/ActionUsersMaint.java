/**
 *
 * Free License
 */
package cb.project.action;

import cb.project.dto.DtoUserProfile;
import cb.project.model.ModelUser;
import cb.project.service.ServiceUser;
import com.opensymphony.xwork2.ActionSupport;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
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
    private List<DtoUserProfile> lstUserProfile;

    public List<DtoUserProfile> getLstUserProfile() {
        return lstUserProfile;
    }

    public void setLstUserProfile(List<DtoUserProfile> lstUserProfile) {
        this.lstUserProfile = lstUserProfile;
    }

    public ModelUser getObjUser() {
        return objUser;
    }

    public void setObjUser(ModelUser objUser) {
        this.objUser = objUser;
    }

    @Override
    public String execute() throws Exception {
        lstUserProfile = new ArrayList<DtoUserProfile>();
        lstUserProfile.add(new DtoUserProfile(1, "Administrador"));
        lstUserProfile.add(new DtoUserProfile(2, "Asistente"));
        lstUserProfile.add(new DtoUserProfile(3, "Cliente"));

        HttpServletRequest request = ServletActionContext.getRequest();
        String idUser = request.getParameter("id");

        if (idUser != null) {
            objUser = oService.getById(Integer.valueOf(idUser));
        } else {
            objUser = new ModelUser();
        }

        return SUCCESS;
    }

    public String save() {
        if (oService.save(objUser)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String delete() {
        HttpServletRequest request = ServletActionContext.getRequest();
        Integer idUser = Integer.valueOf(request.getParameter("id"));

        if (oService.delete(idUser)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
