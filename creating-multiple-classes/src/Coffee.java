public class Coffee {
    // COFFEE SUPERCLASS

    // Attributes (member variables) to store information about the coffee.
    String name;                // for example, "Espresso", "Latte", "Mocha"
    String roast;               // for example, "light", "medium", "dark"
    int caffeineLevelInMg;      // calculated based on the roast
    double price;               // in dollars, for example, 2.50

    // Constructor to create a new coffee object with the given information.
    public Coffee(String name, String roast, double price) {
        this.name = name;
        this.roast = roast;
        this.price = price;

        // The constructor calls the method to set the caffeine level based on the roast
        setCaffeineLevel();
    }

    // Method to set the caffeine level of the coffee based on the roast
    public void setCaffeineLevel() {
        if (roast.equals("light")) {
            caffeineLevelInMg = 50;
        } else if (roast.equals("medium")) {
            caffeineLevelInMg = 100;
        } else if (roast.equals("dark")) {
            caffeineLevelInMg = 150;
        } else {
            caffeineLevelInMg = 0;
        }
    }

    // Methods to simulate coffee preparation
    public void grindBeans() {
        System.out.println("\nGrinding beans for " + this.name + "...");
    }

    public void brewCoffee() {
        System.out.println("\nBrewing your favorite " + this.name + "...");
    }

    // Method to print the information about the coffee
    public void printInfo() {
        System.out.println("\nYou ordered a " + this.name + " with a " + this.roast + " roast.");
        System.out.println("The caffeine level in your coffee is " + this.caffeineLevelInMg + " mg.");
    }
}
