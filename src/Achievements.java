public class Achievements {
    Cookies cookies = new Cookies();
    public int achievedAchievements = 0, totalAchievements = 4;
    public boolean firstOneHundred = false, 
    firstThousand = false;

    public void getAchievements(Double balance, Boolean purchasedItem, Boolean bakedACookie) {
        achievedAchievements = 0;
        System.out.println("**************");
        System.out.println("Achievements");
        System.out.println("**************");
        bakedACookie(bakedACookie);
        purchasedItem(purchasedItem);
        firstOneHundred(balance);
        firstThousand(balance);
        System.out.println("\nAchieved " + achievedAchievements + "/" + totalAchievements);
    }

    public void bakedACookie(Boolean bakedACookie) {
        if (bakedACookie == true) {
            System.out.println("- Baked a cookie");
            achievedAchievements += 1;
        } else {
            System.out.println("__________");
        }
    }

    public void purchasedItem(Boolean purchasedItem) {
        if (purchasedItem == true) {
            System.out.println("- Purchased an item");
            achievedAchievements += 1;
        } else {
            System.out.println("__________");
        }
    }

    public void firstOneHundred(Double balance) {
        
        if (firstOneHundred == false) {
            if (balance >= 100) {
                firstOneHundred = true;
            }
        }

        if (firstOneHundred == true) {
            System.out.println("- First $100");
            achievedAchievements += 1;
        } else {
            System.out.println("__________");
        }
    }   

    public void firstThousand(Double balance) {
        
        if (firstThousand == false) {
            if (balance >= 1000) {
                firstThousand = true;
            }
        }

        if (firstThousand == true) {
            System.out.println("- First $1k");
            achievedAchievements += 1;
        } else {
            System.out.println("__________");
        }
    }
}