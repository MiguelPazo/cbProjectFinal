/**
 *
 * Free License
 */
package cb.project.action;

import cb.project.model.ModelProgram;
import cb.project.service.ServiceProgram;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public class ActionPrograms extends ActionSupport {

    @Autowired
    private ServiceProgram oService;

    private List<ModelProgram> lstProgram;

    public List<ModelProgram> getLstProgram() {
        return lstProgram;
    }

    public void setLstProgram(List<ModelProgram> lstProgram) {
        this.lstProgram = lstProgram;
    }

    @Override
    public String execute() {
        try {
            lstProgram = oService.fetchAll();
        } catch (Exception e) {
            return ERROR;
        }
        return SUCCESS;
    }
}
