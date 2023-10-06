public class Achievements {
    Cookies cookies = new Cookies();
    int achievedAchievements = 0, totalAchievements = 7;
    boolean firstOneHundred = false, 
    firstThousand = false,
    firstTenThousand = false,
    fiftyCookiesBaked = false,
    oneHundredCookiesBaked = false;

    public void getAchievements(Double balance, 
    Boolean purchasedItem, 
    Boolean bakedACookie,
    int CookiesBaked) {

        achievedAchievements = 0;
        System.out.println("**************");
        System.out.println("Achievements");
        System.out.println("**************");

        bakedACookie(bakedACookie);
        fiftyCookiesBaked(CookiesBaked);
        oneHundredCookiesBaked(CookiesBaked);
        purchasedItem(purchasedItem);
        firstOneHundred(balance);
        firstThousand(balance);
        firstTenThousand(balance);

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

    public void fiftyCookiesBaked(int CookiesBaked) {

        if (fiftyCookiesBaked == false) {
            if (CookiesBaked == 50) {
                fiftyCookiesBaked = true;
            }
        }

        if (fiftyCookiesBaked == true) {
            System.out.println("- Baked 50 cookies");
            achievedAchievements += 1;
        } else {
            System.out.println("__________");
        }

    }

    public void oneHundredCookiesBaked(int CookiesBaked) {

        if (oneHundredCookiesBaked == false) {
            if (CookiesBaked == 100) {
                oneHundredCookiesBaked = true;
            }
        }

        if (oneHundredCookiesBaked == true) {
            System.out.println("- Baked 100 cookies");
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

    public void firstTenThousand(Double balance) {

        if (firstTenThousand == false) {
            if (balance >= 10000) {
                firstTenThousand = true;
            }
        }

        if (firstTenThousand == true) {
            System.out.println("- First $10k");
            achievedAchievements += 1;
        } else {
            System.out.println("__________");
        }

    }
}