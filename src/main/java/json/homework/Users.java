package json.homework;

public class Users {

    public Users(String userTitle, String role, Long accessRight) {
        this.userTitle = userTitle;
        this.role = role;
        this.accessRight = accessRight;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getAccessRight() {
        return accessRight;
    }

    public void setAccessRight(Long accessRight) {
        this.accessRight = accessRight;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userTitle='" + userTitle + '\'' +
                ", role='" + role + '\'' +
                ", accessRight=" + accessRight +
                '}';
    }

    private String userTitle;
    private String role;
    private Long accessRight;
}
