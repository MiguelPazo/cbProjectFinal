/**
 *
 * Free License
 */
package cb.project.action;

import cb.project.dto.DtoProgramStatus;
import cb.project.model.ModelProgram;
import cb.project.service.ServiceProgram;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.inject.Scope;
import com.opensymphony.xwork2.inject.Scoped;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
@Scoped(Scope.REQUEST)
public class ActionProgramsMaint extends ActionSupport {

    @Autowired
    private ServiceProgram oService;

    private ModelProgram objProgram;
    private List<DtoProgramStatus> lstProgramStatus;

    public ServiceProgram getoService() {
        return oService;
    }

    public void setoService(ServiceProgram oService) {
        this.oService = oService;
    }

    public List<DtoProgramStatus> getLstProgramStatus() {
        return lstProgramStatus;
    }

    public void setLstProgramStatus(List<DtoProgramStatus> lstProgramStatus) {
        this.lstProgramStatus = lstProgramStatus;
    }

    public ModelProgram getObjProgram() {
        return objProgram;
    }

    public void setObjProgram(ModelProgram objProgram) {
        this.objProgram = objProgram;
    }

    @Override
    public String execute() throws Exception {
        lstProgramStatus = new ArrayList<DtoProgramStatus>();
        lstProgramStatus.add(new DtoProgramStatus(1, "Activo"));
        lstProgramStatus.add(new DtoProgramStatus(2, "Inactivo"));

        HttpServletRequest request = ServletActionContext.getRequest();
        String idProgram = request.getParameter("id");

        if (idProgram != null) {
            objProgram = oService.getById(Integer.valueOf(idProgram));
        } else {
            objProgram = new ModelProgram();
        }

        return SUCCESS;
    }

//    @Validations(requiredFields = {
//        @RequiredFieldValidator(fieldName = "objProgram.title", message = "El Título es obligatorio."),
//        @RequiredFieldValidator(fieldName = "objProgram.description", message = "La descripcion es obligatorio.")
//    })
    public String save() {
        if (oService.save(objProgram)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String delete() {
        HttpServletRequest request = ServletActionContext.getRequest();
        Integer idProgram = Integer.valueOf(request.getParameter("id"));

        if (oService.delete(idProgram)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

}
