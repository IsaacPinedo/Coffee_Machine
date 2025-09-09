public class Espresso extends Coffee {
    // ESPRESSO SUBCLASS
    // Its inheriting state, behavior and the constructor of the superclass.

    // Specific attributes (member variables) for this subclass.
    int numberOfShots;

    // Creating a parameterized constructor inheriting superclass constructor.
    public Espresso (String name, String roast, double price, int numberOfShots) {
        super(name, roast, price);
        this.numberOfShots = numberOfShots;
    }

    // Creating a method that will print Espresso details.
    public void printEspressoDetails () {
        System.out.println("You asked for " + this.numberOfShots + " servings! Every serving of Espresso costs " + super.price +
                "$. Your total bill is "+ (this.numberOfShots * super.price) + "$");
    }
}