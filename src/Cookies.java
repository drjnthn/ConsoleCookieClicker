import java.util.Scanner;
public class Cookies {
    
    public Scanner userInput = new Scanner(System.in);
    public Get get = new Get();

    public boolean purchasedItem = false;
    public boolean bakedACookie = false;
    public int timesBakedACookie = 0;

    double profitsPerSecond = 1;
    double balance = 0;
    double workerPrice = 25,
        upgradeWorkerPrice = 100,
        promotionsPrice = 250,
        qualityPrice = 400,
        factoryPrice = 1000,
        grandmaPrice = 2500,
        powerplantPrice = 10000,
        waterdamPrice = 25000,
        speedPrice = 35000,
        statePrice = 50000,
        countryPrice = 100000,
        continentPrice = 250000,
        africaPrice = 350000,
        russiaPrice = 400000,
        earthPrice = 1000000;

    public void Purchase() {

        System.out.println("**************");
        System.out.println("Type and enter your choice");
        System.out.println("**************");
        System.out.println("1 - Worker         - $" + workerPrice + " - +$1/s");
        System.out.println("2 - Upgrade worker - $" + upgradeWorkerPrice + " - +$2.5/s");
        System.out.println("3 - Promotions     - $" + promotionsPrice + " - +$5/s");
        System.out.println("4 - Quality        - $" + qualityPrice + " - +$10/s");
        System.out.println("5 - Factory        - $" + factoryPrice + " - x1.05/s");
        System.out.println("6 - Grandma        - $" + grandmaPrice + " - x1.05/s");
        System.out.println("7 - Powerplant     - $" + powerplantPrice + " - x1.1/s");
        System.out.println("8 - Water Dam      - $" + waterdamPrice + " - x1.15/s");
        System.out.println("9 - Speed          - $" + speedPrice + " - x1.175/s");
        System.out.println("10 - State         - $" + statePrice + " - x1.2/s");
        System.out.println("11 - Country       - $" + countryPrice + " - x1.25/s");
        System.out.println("12 - Continent     - $" + continentPrice + " - x1.25/s");
        System.out.println("13 - Africa        - $" + africaPrice + " - x1.275/s");
        System.out.println("14 - Russia        - $" + russiaPrice + " - x1.29/s");
        System.out.println("15 - Earth         - $" + earthPrice + " - x1.3/s");
        System.out.println("**************");
        get.getBalance(balance);
        
        int choice = 0;
        try {
            choice = userInput.nextInt();
        } catch (NumberFormatException e) {
            get.wrongOption("number");
        }

        
        System.out.println("**************");
        if (choice == 1) {

            if (balance >= workerPrice) {
                profitsPerSecond += 1;
                balance -= workerPrice;
                workerPrice = Math.round(workerPrice * 1.25);
                get.getBalance(balance);
                purchasedItem = true;
            } else {
                get.lowBalance(balance, "Worker", workerPrice);
            }

        } else if (choice == 2) {

            if (balance >= upgradeWorkerPrice) {
                profitsPerSecond += 2.5;
                balance -= upgradeWorkerPrice;
                upgradeWorkerPrice = Math.round(upgradeWorkerPrice * 1.25);
                get.getBalance(balance);
                purchasedItem = true;
            } else {
                get.lowBalance(balance, "Upgrade worker", upgradeWorkerPrice);
            }

        } else if (choice == 3) {

            if (balance >= promotionsPrice) {
                profitsPerSecond += 5;
                balance -= promotionsPrice;
                promotionsPrice = Math.round(promotionsPrice * 1.25);
                get.getBalance(balance);
                purchasedItem = true;
            } else {
                get.lowBalance(balance, "Promotions", promotionsPrice);
            }

        } else if (choice == 4) {

            if (balance >= qualityPrice) {
                profitsPerSecond += 10;
                balance -= qualityPrice;
                qualityPrice = Math.round(qualityPrice * 1.25);
                get.getBalance(balance);
                purchasedItem = true;
            } else {
                get.lowBalance(balance, "Quality", qualityPrice);
            }

        } else if (choice == 5) {

            if (balance >= factoryPrice) {
                profitsPerSecond = Math.round(profitsPerSecond * 1.05);
                balance -= factoryPrice;
                factoryPrice = Math.round(factoryPrice * 1.25);
                get.getBalance(balance);
                purchasedItem = true;
            } else {
                get.lowBalance(balance, "Factory", factoryPrice);
            }

        } else if (choice == 6) {

            if (balance >= grandmaPrice) {
                profitsPerSecond = Math.round(profitsPerSecond * 1.05);
                balance -= grandmaPrice;
                grandmaPrice = Math.round(grandmaPrice * 1.25);
                get.getBalance(balance);
                purchasedItem = true;
            } else {
                get.lowBalance(balance, "Grandma", grandmaPrice);
            }

        } else if (choice == 7) {
            
            if (balance >= powerplantPrice) {
                profitsPerSecond = Math.round(profitsPerSecond * 1.1);
                balance -= powerplantPrice;
                powerplantPrice = Math.round(powerplantPrice * 1.25);
                get.getBalance(balance);
                purchasedItem = true;
            } else {
                get.lowBalance(balance, "Powerplant", powerplantPrice);
            }

        } else if (choice == 8) {

            if (balance >= waterdamPrice) {
                profitsPerSecond = Math.round(profitsPerSecond * 1.15);
                balance -= waterdamPrice;
                waterdamPrice = Math.round(waterdamPrice * 1.25);
                get.getBalance(balance);
                purchasedItem = true;
            } else {
                get.lowBalance(balance, "Water dam", waterdamPrice);
            }

        } else if (choice == 9) {

            if (balance >= speedPrice) {
                profitsPerSecond = Math.round(profitsPerSecond * 1.175);
                balance -= speedPrice;
                speedPrice = Math.round(speedPrice * 1.25);
                get.getBalance(balance);
                purchasedItem = true;
            } else {
                get.lowBalance(balance, "Speed", speedPrice);
            }

        } else if (choice == 10) {

            if (balance >= statePrice) {
                profitsPerSecond = Math.round(profitsPerSecond * 1.2);
                balance -= statePrice;
                statePrice = Math.round(statePrice * 1.25);
                get.getBalance(balance);
                purchasedItem = true;
            } else {
                get.lowBalance(balance, "State", statePrice);
            }

        } else if (choice == 11) {

            if (balance >= countryPrice) {
                profitsPerSecond = Math.round(profitsPerSecond * 1.25);
                balance -= countryPrice;
                countryPrice = Math.round(countryPrice * 1.25);
                get.getBalance(balance);
                purchasedItem = true;
            } else {
                get.lowBalance(balance, "Country", countryPrice);
            }

        } else if (choice == 12) {
            
            if (balance >= continentPrice) {
                profitsPerSecond = Math.round(profitsPerSecond * 1.25);
                balance -= continentPrice;
                continentPrice = Math.round(continentPrice * 1.25);
                get.getBalance(balance);
                purchasedItem = true;
            } else {
                get.lowBalance(balance, "Continent", continentPrice);
            }

        } else if (choice == 13) {

            if (balance >= africaPrice) {
                profitsPerSecond = Math.round(profitsPerSecond * 1.275);
                balance -= africaPrice;
                africaPrice = Math.round(africaPrice * 1.25);
                get.getBalance(balance);
                purchasedItem = true;
            } else {
                get.lowBalance(balance, "Africa", africaPrice);
            }

        } else if (choice == 14) {

            if (balance >= russiaPrice) {
                profitsPerSecond = Math.round(profitsPerSecond * 1.29);
                balance -= russiaPrice;
                russiaPrice = Math.round(russiaPrice * 1.25);
                get.getBalance(balance);
                purchasedItem = true;
            } else {
                get.lowBalance(balance, "Russia", russiaPrice);
            }

        } else if (choice == 15) {

            if (balance >= earthPrice) {
                profitsPerSecond = Math.round(profitsPerSecond * 1.3);
                balance -= earthPrice;
                earthPrice = Math.round(earthPrice * 1.25);
                get.getBalance(balance);
                purchasedItem = true;
            } else {
                get.lowBalance(balance, "Earth", earthPrice);
            }

        } else {
            get.wrongOption("Not an option");
        }

        System.out.println("**************");
        System.out.println("You make $" + profitsPerSecond + "/second");

    }

    public void Bake() {

        double spam = 0;
        boolean bakeIsTrue = true;

        System.out.println("1 - Bake Cookies");
        System.out.println("2 - Exit Bakery");
        System.out.println("**************");

        while (bakeIsTrue) {
            
            try {
                spam = userInput.nextDouble();
                if (spam != 1) {
                    bakeIsTrue = false;
                } else {
                    balance += spam;
                    get.getBalance(balance);
                    bakedACookie = true;
                    timesBakedACookie += 1;
                }
            } catch (NumberFormatException e) {
                get.wrongOption("number");
            }
        }
        System.out.println("You exited the bakery");
    }

    public void Simulate() {

        System.out.println("**************");
        System.out.println("How many seconds do you want to simulate?");

        long timeToSimulate = 0;
        try {
            timeToSimulate = userInput.nextInt();
        } catch (NumberFormatException e) {
            get.wrongOption("number");
            Simulate();
        }

        System.out.println("**************");
        if (timeToSimulate == 46) {
            System.out.println("You cannot go over 45 seconds");
            System.out.println("Sorry for the inconvenience");
            Simulate();
        }

        long targetTime = System.currentTimeMillis() + (timeToSimulate * 1000);

        while (System.currentTimeMillis() < targetTime) {
            balance += profitsPerSecond;
            get.getBalance(balance);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
                System.out.println("There was an error");
            }
        }
    }
}