/**
 *
 * Free License
 */
package cb.project.action;

import cb.project.model.ModelProgram;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public class ActionProgram extends ActionSupport {

    private List<ModelProgram> lstProgram;

    public List<ModelProgram> getLstProgram() {
        return lstProgram;
    }

    public void setLstProgram(List<ModelProgram> lstProgram) {
        this.lstProgram = lstProgram;
    }

    public String index() {
        return SUCCESS;
    }
}
