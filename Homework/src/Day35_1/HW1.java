package Day35_1;


public class HW1 {
    public static void main(String[] args) {
        Bank Pnc = new Bank(1900, "PNC", 1234567, 29);
        System.out.println(Pnc.printOut());
        System.out.println("--------------------------------------");
        Bank bank = new Bank();
        System.out.println(bank.printOut());
        System.out.println("--------------------------------------");
        Bank trustworthiness = new Bank(true);
        System.out.println(trustworthiness.printOut());
        System.out.println("---------------------------------------");
        Bank citi = new Bank(2007,"CITI",8755432,50);
        System.out.println(citi.printOut());
    }
}
