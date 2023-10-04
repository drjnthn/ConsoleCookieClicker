public class Get {

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
}