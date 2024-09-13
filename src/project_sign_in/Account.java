
package project_sign_in;

import java.io.Serializable;

public class Account implements Serializable{
    private String username;
    private String Password;
    private String phone_number;
    private String name;

    public Account(String username, String Password, String phone_number, String name) {
        this.username = username;
        this.Password = Password;
        this.phone_number = phone_number;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" + "username=" + username + ", Password=" + Password +'}';
    }
    
    
}
