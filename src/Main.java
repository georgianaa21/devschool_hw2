import burgers.*;
import composition.*;
import polymorphism.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------- COMPOSITION ------------------\n");

        //composition - create address, room and some pieces of furniture
        Address a1 = new Address("Bvd. Dacia", 3, "Bucuresti", "Sector 1", "Romania");

        Room r1 = new Room(45.2f, 2.5f, 3, a1);

        Furniture f1 = new Furniture("chair", "IKEA", 120f);
        Furniture f2 = new Furniture("table", "IKEA", 249.9f);
        Furniture f3 = new Furniture("bed", "IKEA", 780f);
        Furniture f4 = new Furniture("drawer", "Mobexpert", 1800f);

        r1.addFurniture(f1);
        r1.addFurniture(f2);
        r1.addFurniture(f3);
        r1.addFurniture(f4);

        System.out.println(r1.toString());

        //accessing a furniture object from a room using an index
        System.out.println(r1.getPiece(2).toString());
        //System.out.println(r1.getPiece(-1).toString());

        //accessing a piece of furniture's name from a room
        System.out.println("This piece of furniture is a " + r1.getPieceName(3).toString());
        //accessing street name from an address aggregated in a room
        System.out.println("The room is situated in " + r1.getCity());

        System.out.println("\n---------------------- POLYMORPHISM ---------------------\n");

        Car c1 = new Car("Dacia", "Logan", 2001, 16);
        //upcasting
        Car c2 = new BMW("X5", 2016, 16);
        Car c3 = new Audi("A3", 2014, 16);
        Car c4 = new Opel("Astra", 2005, 16);

        c1.run();
        c1.getProducer();

        c2.run();
        c2.getModel();

        c3.run();
        c3.getWheels();

        c4.run();
        c4.getYear();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());

        System.out.println("\n------------------ BURGERS -----------------\n");

        Hamburger ham1 = new Hamburger(Roll.CIABATTA, Meat.BEEF, 15.0f);
        Hamburger ham2 = new DeluxeBurger(Roll.BROWNRYE, Meat.PORK, 16.0f);
        Hamburger ham3 = new HealthyBurger(Meat.CHICKEN, 14.5f);

        //hamburger test
        ham1.addIngredient(Ingredient.CHIPS);
        ham1.printPrice();
        ham1.addIngredient(Ingredient.DRINK);
        ham1.printPrice();
        ham1.addIngredient(Ingredient.BACON);
        ham1.addIngredient(Ingredient.LETTUCE);
        ham1.addIngredient(Ingredient.ONIONS);
        System.out.println(ham1.toString() + "\n");

        //deluxeburger test
        ham2.addIngredient(Ingredient.LETTUCE);
        System.out.println(ham2.toString() +"\n");

        //healthyburger test
        ham3.setName("My favorite burger");
        ham3.addIngredient(Ingredient.ONIONS);
        ham3.addIngredient(Ingredient.LETTUCE);
        ham3.addIngredient(Ingredient.BACON);
        ham3.addIngredient(Ingredient.DRINK);
        ham3.printPrice();
        ham3.addIngredient(Ingredient.CHIPS);
        ham3.addIngredient(Ingredient.PROSCIUTTO);
        ham3.addIngredient(Ingredient.FRIES);
        System.out.println(ham3.toString());
    }
}
