package dto;


public class UserDTO {

    private String userID;
    private String fullName;
    private String roleId;
    private String password;

    public UserDTO() {
    }

    public UserDTO(String userID, String fullName, String roleId, String password) {
        this.userID = userID;
        this.fullName = fullName;
        this.roleId = roleId;
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

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO{" + "userID=" + userID + ", fullName=" + fullName + ", roleId=" + roleId + ", password=" + password + '}';
    }

}