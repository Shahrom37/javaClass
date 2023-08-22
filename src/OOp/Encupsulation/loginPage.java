package OOp.Encupsulation;

public class loginPage {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName.equals("UserOne")) {
            this.userName = userName;
        } else {
            this.userName = "Invalid Username";
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.equals("Password1")) {
            this.password = password;
        } else {
            this.password = "Invalid Password";
        }

    }


}
