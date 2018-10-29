package burgers;
import java.util.*;

public class Hamburger {
    private String name;
    private Roll bread;
    private Meat meat;
    private List<Ingredient> ingredients = new ArrayList<Ingredient>();
    private float price;
    private float basePrice;


    public Hamburger(Roll bread, Meat meat, float price) {
        this.bread = bread;
        this.meat = meat;
        this.basePrice = price;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Roll getBread() {
        return bread;
    }

    public Meat getMeat() {
        return meat;
    }


    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient){
        if(this.ingredients.size() < 4) {
            this.ingredients.add(ingredient);
            this.price += ingredient.getPrice();
        }
        else {
            System.out.println("Too many ingredients!");
        }
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public float getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        String out = "Hamburger " + this.name + "\n" + this.printBurger();
        return out;
    }

    public String printBurger() {

        String out = "Roll: ";
        switch (this.bread) {
            case BROWNRYE: out += "Brown rye";
            break;
            case CIABATTA: out += "Ciabatta";
            break;
            case ENGLISH: out += "English";
            break;
            case KAISER: out += "Kaiser";
            break;
            case SESAME: out += "Sesame";
            break;
        }

        out+= "\nMeat: ";
        switch (this.meat) {
            case BEEF: out+= "Beef";
            break;
            case PORK: out+= "Pork";
            break;
            case CHICKEN: out+= "Chicken";
            break;
        }

        out += "\n Ingredients: \n";
        for(Ingredient i : this.ingredients) {
            switch (i) {
                case TOMATO: out+= "Tomato + " + i.getPrice() + " lei\n";
                break;
                case CHEESE: out+= "Cheese + " + i.getPrice() + " lei\n";
                break;
                case ONIONS: out+= "Onions + " + i.getPrice() + " lei\n";
                break;
                case BACON: out += "Bacon + " + i.getPrice() + " lei\n";
                break;
                case PROSCIUTTO: out += "Prosciutto + " + i.getPrice() + " lei\n";
                break;
                case LETTUCE: out += "Lettuce + " + i.getPrice() + " lei\n";
                break;
                case FRIES: out += "Fries + " + i.getPrice() + " lei\n";
                break;
                case CHIPS: out += "Chips + " + i.getPrice() + " lei\n";
                break;
                case DRINK: out += "Drink + " + i.getPrice() + " lei\n";
                break;
            }
        }

        out += "\nBase price: " + this.basePrice + " lei";
        out += "\nTotal: " + this.price+ " lei";
        return out;
    }

    public void printPrice() {
        System.out.println("Price at the moment is : " + this.price + "\n");
    }
}
