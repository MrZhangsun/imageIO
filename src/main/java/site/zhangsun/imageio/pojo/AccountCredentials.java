package site.zhangsun.imageio.pojo;

/**
 * @program: {Project_name}
 * @description:
 * @author: {}
 */
public class AccountCredentials {

    private String password;

    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "AccountCredentials{" +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
