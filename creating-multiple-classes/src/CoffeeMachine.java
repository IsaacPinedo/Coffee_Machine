import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        // Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Variable to keep CoffeeMachine running.
        boolean isCoffeeMachineRunning = true;

        // CoffeeMachine running.
        System.out.println("\nWelcome to the Coffee Machine!");
        System.out.println("Select a number to continue:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Exit\n");

        while (isCoffeeMachineRunning) {
            // Read user's choice
            try {
                int choice = keyboard.nextInt();

                switch (choice) {
                    case 1:
                        // Selection message.
                        System.out.print("\nGreat!\n");

                        // Declaring and initializing the name of Espresso.
                        String espressoName = "Espresso";

                        // Declaring and initializing the price of Espresso per serving.
                        double espressoPrice = 2.50;

                        // Ask the user for the type of roast and store it in espressoRoast.
                        System.out.print("\nWhat Roast would you like? (light, medium, dark): \n");

                        String espressoRoast = "";
                        while ( !(espressoRoast.equals("light") || espressoRoast.equals("medium") || espressoRoast.equals("dark")) ) {
                            espressoRoast = keyboard.next();
                            espressoRoast = espressoRoast.toLowerCase();
                            if ( !(espressoRoast.equals("light") || espressoRoast.equals("medium") || espressoRoast.equals("dark")) ) {
                                System.out.print("\nInvalid choice. Select one of the mentioned!\n");
                            } else {
                                System.out.print("\nGreat!\n");
                            }
                        }

                        // Ask the user for the number of shots and store it in numberOfShots
                        System.out.print("\nHow many servings would you like?: \n");

                        int numberOfShots = 0;
                        boolean isValidNumberOfShots = true;

                        while (isValidNumberOfShots) {
                            try {
                                numberOfShots = keyboard.nextInt();
                                isValidNumberOfShots = false;
                            } catch (java.util.InputMismatchException error) {
                                System.out.print("\nInvalid choice, select an integer number please!\n");
                                keyboard.next();
                            }
                        }

                        // Creating an object of Espresso class using the parameterized constructor.
                        Espresso espressoServed = new Espresso(espressoName, espressoRoast, espressoPrice, numberOfShots);

                        // Calling the grindBeans() method on the Espresso object.
                        espressoServed.grindBeans();

                        // Calling the brewCoffee() method on the Espresso object.
                        espressoServed.brewCoffee();

                        // Calling the printInfo() method on the Espresso object.
                        espressoServed.printInfo();

                        // Calling the printEspressoDetails method on the Espresso object
                        espressoServed.printEspressoDetails();

                        System.out.println("\nWould you like anything else?\n");
                        System.out.println("1. Espresso");
                        System.out.println("2. Latte");
                        System.out.println("3. Exit\n");

                        break;

                    case 2:
                        // Selection message.
                        System.out.print("\nGreat!\n");

                        // Declaring and initializing the name of Latte.
                        String latteName = "Latte";

                        // Declaring and initializing the price of Latte.
                        double lattePrice = 3.50;

                        // Ask the user for the type of roast and store it in latteRoast.
                        System.out.print("\nWhat Roast would you like? (light, medium, dark): \n");

                        String latteRoast = "";
                        while ( !(latteRoast.equals("light") || latteRoast.equals("medium") || latteRoast.equals("dark")) ) {
                            latteRoast = keyboard.next();
                            latteRoast = latteRoast.toLowerCase();
                            if ( !(latteRoast.equals("light") || latteRoast.equals("medium") || latteRoast.equals("dark")) ) {
                                System.out.print("\nInvalid choice. Select one of the mentioned!\n");
                            } else {
                                System.out.print("\nGreat!\n");
                            }
                        }

                        // Ask the user for the milk type and store it in milkType.
                        System.out.print("\nWhat milk type would you like? (whole, skim, almond, oat): \n");

                        String milkType = "";
                        while ( !(milkType.equals("whole") || milkType.equals("skim") ||
                                milkType.equals("almond") || milkType.equals("oat")) ) {
                            milkType = keyboard.next();
                            milkType = milkType.toLowerCase();
                            if ( !(milkType.equals("whole") || milkType.equals("skim") ||
                                    milkType.equals("almond") || milkType.equals("oat")) ) {
                                System.out.print("\nInvalid choice. Select one of the mentioned!\n");
                            } else {
                                System.out.print("\nGreat!\n");
                            }
                        }

                        // Ask the user if they want syrup or not.
                        System.out.print("\nWould you like syrup? (yes/ no): \n");

                        String syrupWanted = "";
                        String syrupFlavor = "";
                        boolean isValidSyrupWanted = true;
                        while (isValidSyrupWanted) {
                            syrupWanted = keyboard.next();
                            syrupWanted = syrupWanted.toLowerCase();
                            switch (syrupWanted) {
                                case "yes":
                                    System.out.print("\nWhich flavor would you like? (vanilla, caramel, hazelnut): \n");
                                    syrupFlavor = "";
                                    while ( !(syrupFlavor.equals("vanilla") || syrupFlavor.equals("caramel") ||
                                            syrupFlavor.equals("hazelnut")) ) {
                                        syrupFlavor = keyboard.next();
                                        syrupFlavor = syrupFlavor.toLowerCase();
                                        if ( !(syrupFlavor.equals("vanilla") || syrupFlavor.equals("caramel") ||
                                                syrupFlavor.equals("hazelnut")) ) {
                                            System.out.print("\nInvalid choice. Select one of the mentioned!\n");
                                        } else {
                                            System.out.print("\nGreat!\n");
                                        }
                                    }
                                    isValidSyrupWanted = false;
                                    break;
                                case "no":
                                    System.out.print("\nGreat!\n");
                                    isValidSyrupWanted = false;
                                    break;
                                default:
                                    System.out.print("\nInvalid choice. Select one of the mentioned!\n");
                            }
                        }

                        // Creating an object of Latte class using the parameterized constructor.
                        Latte latteServed = new Latte(latteName, latteRoast, lattePrice, milkType, syrupFlavor);

                        // Calling the grindBeans() method on the Latte object.
                        latteServed.grindBeans();

                        // Calling the brewCoffee() method on the Latte object.
                        latteServed.brewCoffee();

                        // Calling the printInfo() method on the Latte object
                        latteServed.printInfo();

                        // Calling the printLatteDetails() method on the Latte object
                        latteServed.printLatteDetails();
                        System.out.println("\nWould you like anything else?\n");
                        System.out.println("1. Espresso");
                        System.out.println("2. Latte");
                        System.out.println("3. Exit\n");

                        break;

                    case 3:
                        System.out.println("Thank you for using the Coffee Machine!");
                        isCoffeeMachineRunning = false;
                        break;

                    default:
                        System.out.println("\nInvalid choice. Please enter 1, 2, or 3.\n");
                }
            } catch (java.util.InputMismatchException error) {
                System.out.println("\nInvalid choice. Please enter 1, 2, or 3.\n");
                // By using this code line invalid input will be cleared from the Scanner to prevent an infinite loop.
                keyboard.next();
            }
        }
    }
}
