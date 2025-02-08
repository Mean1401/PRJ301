/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Hako1
 */
public class UserDTO {
    private String userID;
    private String fullName;
    private String RoleId;
    private String password;

    public UserDTO() {
    }

    public UserDTO(String userID, String fullName, String role, String password) {
        this.userID = userID;
        this.fullName = fullName;
        this.RoleId = RoleId;
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRole() {
        return RoleId;
    }

    public void setRole(String role) {
        this.RoleId = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
