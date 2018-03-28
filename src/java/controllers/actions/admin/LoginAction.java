/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.actions.admin;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Nguyen Ngoc Son
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    private String message;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getSessionMap() {
        return sessionMap;
    }

    public void setSessionMap(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }
     private Map<String,Object> sessionMap;
    public LoginAction() {
    }
    
    public String execute() throws Exception {
        if(username != null && username.equals("admin") && password != null && password.equals("admin")){
            message = "Login success1";
            sessionMap = ActionContext.getContext().getSession();
            sessionMap.put("isLogged", true);
            sessionMap.put("username", username);
            sessionMap.put("loggedTime", new Date());
            return Action.SUCCESS;
        }
        else{
            message = "Error";
            return Action.ERROR;
        }
    }

    @Override
    public void validate() {
       if(username == null || username.trim().isEmpty()){
          addFieldError("username", "Username is required");
      }
       if(password == null || password.trim().isEmpty()){
          addFieldError("password", "Password is required");
      }
    }
    
}
