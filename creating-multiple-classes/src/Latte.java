public class Latte extends Coffee {
    // LATTE SUBCLASS

    // Its inheriting state, behavior and the constructor of the superclass.

    // Specific attributes (member variables) for this subclass.
    String milkType;
    String syrupFlavor;

    // Creating a parameterized constructor inheriting superclass constructor.
    public Latte (String name, String roast, double price, String milkType, String syrupFlavor) {
        super(name, roast, price);
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    // Creating a method that will print Latte details.
    public void printLatteDetails() {
        System.out.println("Your " + super.name + " has " + this.milkType + " milk and " + this.syrupFlavor + " flavor. Your total bill is " + super.price + "$");
    }
}