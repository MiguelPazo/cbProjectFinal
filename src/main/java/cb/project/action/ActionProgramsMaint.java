/**
 *
 * Free License
 */
package cb.project.action;

import cb.project.model.ModelProgram;
import cb.project.service.ServiceProgram;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.inject.Scope;
import com.opensymphony.xwork2.inject.Scoped;
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

    public ModelProgram getObjProgram() {
        return objProgram;
    }

    public void setObjProgram(ModelProgram objProgram) {
        this.objProgram = objProgram;
    }

    @Override
    public String execute() throws Exception {
        objProgram = new ModelProgram();
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

}
