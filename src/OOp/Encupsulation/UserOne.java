package OOp.Encupsulation;

public class UserOne {
    public static void main(String[] args) {
        loginPage login = new loginPage();

        login.setUserName("UserOne");
        login.setPassword("Password1");
        System.out.println(login. getUserName() + " " + login. getPassword()) ;



    }
}