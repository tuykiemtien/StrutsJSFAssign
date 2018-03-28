/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entites;

/**
 *
 * @author Nguyen Ngoc Son
 */
public class Users {
    private int usersID;
    private String usersName;
    private String usersPhone;
    private String usersMail;
    private String usersCV;

    public int getUsersID() {
        return usersID;
    }

    public void setUsersID(int usersID) {
        this.usersID = usersID;
    }

    public Users(int usersID, String usersName, String usersPhone, String usersMail, String usersCV) {
        this.usersID = usersID;
        this.usersName = usersName;
        this.usersPhone = usersPhone;
        this.usersMail = usersMail;
        this.usersCV = usersCV;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public String getUsersPhone() {
        return usersPhone;
    }

    public void setUsersPhone(String usersPhone) {
        this.usersPhone = usersPhone;
    }

    public String getUsersMail() {
        return usersMail;
    }

    public void setUsersMail(String usersMail) {
        this.usersMail = usersMail;
    }

    public String getUsersCV() {
        return usersCV;
    }

    public void setUsersCV(String usersCV) {
        this.usersCV = usersCV;
    }

    public Users() {
    }
    
}
