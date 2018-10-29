package burgers;

public enum Ingredient {
    TOMATO(2.5f),
    CHEESE(4f),
    ONIONS(2f),
    BACON(3f),
    PROSCIUTTO(5.5f),
    LETTUCE(1.5f),
    FRIES(4.5f),
    CHIPS(4.5f),
    DRINK(5f);

    private final float price;
    Ingredient(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
