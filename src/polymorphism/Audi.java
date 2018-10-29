package polymorphism;

public class Audi extends Car {

    public Audi(String model, int year, int cylinders) {
        super("Audi", model, year, cylinders);
    }

    @Override
    public String getProducer() {
        System.out.println("This is an Audi!");
        return this.producer;
    }

    @Override
    public String getModel() {
        System.out.println("This is an Audi " + this.model);
        return this.model;
    }

    @Override
    public int getYear() {
        System.out.println("This is an Audi made in " + this.year);
        return this.year;
    }

    @Override
    public boolean isEngine() {
        System.out.println("This Audi has an engine!");
        return this.engine;
    }

    @Override
    public int getCylinders() {
        System.out.println("This Audi has " + this.cylinders + " cylinders");
        return this.cylinders;
    }

    @Override
    public int getWheels() {
        System.out.println("This Audi has " + this.wheels + " wheels");
        return this.wheels;
    }

    @Override
    public void run() {
        System.out.println("This Audi is running!");
    }

    @Override
    public String toString() {
        return "Audi{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", cylinders=" + cylinders +
                ", wheels=" + wheels +
                '}';
    }
}
