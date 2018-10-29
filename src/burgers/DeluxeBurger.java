package burgers;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(Roll bread, Meat meat, float price) {
        super(bread, meat, price);
        super.addIngredient(Ingredient.DRINK);
        super.addIngredient(Ingredient.CHIPS);
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        System.out.println("You can't add other ingredients to the Deluxe Burger!");
    }

    @Override
    public String toString() {
        String out = "Deluxe Burger " + this.getName() + "\n" + this.printBurger();
        return out;
    }
}
