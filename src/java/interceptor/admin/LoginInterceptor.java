/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interceptor.admin;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 *
 * @author Nguyen Ngoc Son
 */
public class LoginInterceptor implements Interceptor {
    
    public LoginInterceptor() {
    }
    
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void init() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        String result = actionInvocation.invoke();
       
       return result;
    }
    
}
