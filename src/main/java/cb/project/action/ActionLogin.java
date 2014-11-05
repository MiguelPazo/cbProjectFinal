/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb.project.action;

import cb.project.dto.DtoUser;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Administrator
 */
public class ActionLogin extends ActionSupport {

    private DtoUser objUser;

    public DtoUser getObjUser() {
        return objUser;
    }

    public void setObjUser(DtoUser objUser) {
        this.objUser = objUser;
    }

    public String login() {
        if (objUser.getUser().equals("miguel")
                && objUser.getPassword().equals("123")) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

}
