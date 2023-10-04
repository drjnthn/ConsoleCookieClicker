import java.util.Scanner;
public class Get {

    public Scanner userInput = new Scanner(System.in);

    public void getBalance(double balance) {
        double _balance = balance;
        System.out.println("Balance - $" + _balance);
    }

    public void lowBalance (double balance,String rejected, double price) {
        System.out.println(rejected + " Not enough balance\nBalance - $" + balance + "\nCost $" + price);
    }

    public void wrongOption (String correctOne) {
        System.out.println("Not an option, enter a " + correctOne);
    }

    public void tutoiral() {
        int acknowledge;

        System.out.println("**************");
        System.out.println("Tutorial");

        System.out.println("**************");
        System.out.println("In the menu, you will see different\n"
        + "options for what to do, type and enter the\n"
        + "number of the action you want to do");

        System.out.println("**************");
        System.out.println("If you choose to bake, it\n"
        + "is the same system as the menu");

        System.out.println("**************");
        System.out.println("If you choose to simulate\n"
        + "you decide the amount of seconds to pass by\n"
        + "and you will earn money every second based on\n"
        + "your profits per second");

        System.out.println("**************");
        System.out.println("Do you understand?");
        System.out.println("Yes - 1");

        acknowledge = userInput.nextInt();

        if (acknowledge != 1) {
            tutoiral();
        }
    }
}