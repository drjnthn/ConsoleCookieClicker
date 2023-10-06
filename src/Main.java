import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean keepRunning = true;

        Cookies cookies = new Cookies();
        Get get = new Get();
        Achievements achievements = new Achievements();

        System.out.println("**************");
        System.out.println("Cookie clicker");
        get.tutoiral();

        while (keepRunning) {
            System.out.println("**************");
            System.out.println("1 - Bake");
            System.out.println("2 - Simulate");
            System.out.println("3 - Purchase");
            System.out.println("4 - Achievements");
            System.out.println("5 - Tutoiral");
            System.out.println("10 - Exit");
            System.out.println("**************");
            get.getBalance(cookies.balance);
            int choice = userInput.nextInt();
            if (choice == 10) {
                keepRunning = false;
            } else if (choice == 1) {
                cookies.Bake();
            } else if (choice == 2) {
                cookies.Simulate();
            } else if (choice == 3) {
                cookies.Purchase();
            } else if (choice == 4) {
                achievements.getAchievements(
                cookies.balance, 
                cookies.purchasedItem, 
                cookies.bakedACookie,
                cookies.timesBakedACookie);
            } else if (choice == 5) {
                get.tutoiral();
            } else if (choice == 797979) {
                //testing purposes
                cookies.balance = userInput.nextDouble();
            }
        }
        userInput.close();
        get.userInput.close();
        cookies.userInput.close();
    }
}