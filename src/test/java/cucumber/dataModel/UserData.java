package cucumber.dataModel;

public class UserData {
    private final String username;
    private final String password;
    private final String account;

    public UserData(
            String username,
            String password,
            String account) {
        this.username = username;
        this.password = password;
        this.account = account;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getAccount() {
        return account;
    }

}
