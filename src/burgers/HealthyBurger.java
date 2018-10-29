package burgers;

public class HealthyBurger extends Hamburger {

    public HealthyBurger(Meat meat, float price) {
        super(Roll.BROWNRYE, meat, price);
    }

    public void addIngredient(Ingredient ingredient){
        if(this.getIngredients().size() < 6) {
            this.getIngredients().add(ingredient);
            this.setPrice(this.getPrice() + ingredient.getPrice());
        }
        else {
            System.out.println("Too many ingredients!");
        }
    }

    @Override
    public String toString() {
        String out = "Healthy Burger " + this.getName() + "\n" + this.printBurger();
        return out;
    }
}
