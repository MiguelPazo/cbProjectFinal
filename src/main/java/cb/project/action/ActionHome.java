/**
 *
 * Free License
 */
package cb.project.action;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public class ActionHome extends ActionSupport {

    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        String error = request.getParameter("error");

        if (error != null) {
            errorMessage = "Los datos ingresados son incorrectos!";
        }else{
            errorMessage = "";
        }

        return SUCCESS;
    }

}
