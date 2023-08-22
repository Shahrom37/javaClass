package OOp.PolymorPhism;

public class MainBank {
    public static void main(String[] args) {
        FederalReserveBank bank = new FederalReserveBank();
        int rate = bank.interestRate();
        System.out.println("FederalReserveBank's rate is: " + rate);

        bank = new ChaseBank();
        rate = bank.interestRate();
        System.out.println("Chase's rate is:" + rate);

        bank = new BankOfAmerica();
        rate = bank.interestRate();
        System.out.println("BankOfamerica's " + rate);


        bank = new WellsFargo();
        rate =bank.interestRate();
        System.out.println(rate);

        bank = new CapitalOne();
        rate = bank.interestRate();
        System.out.println(rate);
    }
}
