//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Bank Leo = new Bank(1000.00);
       Leo.setName("leonardo tricano costa");
       Leo.setAccountNumber("1232343");
       Leo.setEmail("leo@leo.com");
       Leo.deposit(2000.00);
       Leo.withdraw(200.00);
       Leo.setPhoneNumber("(23) 4562-2789");

       Leo.describeAccount();






    }
}