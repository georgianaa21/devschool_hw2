package polymorphism;

public class Opel extends Car {
    public Opel(String model, int year, int cylinders) {
        super("Opel", model, year, cylinders);
    }

    @Override
    public String getProducer() {
        System.out.println("This is an Opel!");
        return this.producer;
    }

    @Override
    public String getModel() {
        System.out.println("This is an Opel " + this.model);
        return this.model;
    }

    @Override
    public int getYear() {
        System.out.println("This is an Opel made in " + this.year);
        return this.year;
    }

    @Override
    public boolean isEngine() {
        System.out.println("This Opel has an engine!");
        return this.engine;
    }

    @Override
    public int getCylinders() {
        System.out.println("This Opel has " + this.cylinders + " cylinders");
        return this.cylinders;
    }

    @Override
    public int getWheels() {
        System.out.println("This Opel has " + this.wheels + " wheels");
        return this.wheels;
    }

    @Override
    public void run() {
        System.out.println("This Opel is running!");
    }

    @Override
    public String toString() {
        return "Opel{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", cylinders=" + cylinders +
                ", wheels=" + wheels +
                '}';
    }
}
