package OOp.Encupsulation;

public class MainClass {
    public static void main(String[] args) {
        BankAccount johnAccount = new BankAccount () ;
        johnAccount. setAccountNumber ("65478986755" );
        johnAccount. setAccountBalance(100);
        johnAccount. setCustomerName (" John W");
        johnAccount.setCustomerEmailAddress("John23@gmail.com");
        johnAccount. setCustomerPhoneNumber ( "5234678544567") ;

                System.out.println("Account #" + johnAccount. getAccountNumber ( ));
                System.out.println("AccountBalance #" + johnAccount. getAccountBalance()) ;
                System.out.println("CustomerEmailAddress #" + johnAccount.getCustomerEmailAddress()) ;
                System.out .println("CustomerPhoneNumber #" + johnAccount. getCustomerPhoneNumber ( )) ;




    }
}
