package models;

public class User {
    private static long userCount = 0;
    private long userId;
    private String userName;
    private String email;
    private Role role;
    private String mobileNumber;
    private String password;

    public User(String userName, String email, String mobileNumber, String password) {
        this.userId = ++userCount;
        this.userName = userName;
        this.email = email;
        this.role = Role.USER;
        this.mobileNumber = mobileNumber;
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public long getUserCount() {
        return userCount;
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }

}
