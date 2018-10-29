package polymorphism;

public class BMW extends Car {

    public BMW(String model, int year, int cylinders) {
        super("BMW", model, year, cylinders);
    }

    @Override
    public String getProducer() {
        System.out.println("This is a BMW!");
        return this.producer;
    }

    @Override
    public String getModel() {
        System.out.println("This is a BMW " + this.model);
        return this.model;
    }

    @Override
    public int getYear() {
        System.out.println("This is a BMW made in " + this.year);
        return this.year;
    }

    @Override
    public boolean isEngine() {
        System.out.println("This BMW has an engine!");
        return this.engine;
    }

    @Override
    public int getCylinders() {
        System.out.println("This BMW has " + this.cylinders + " cylinders");
        return this.cylinders;
    }

    @Override
    public int getWheels() {
        System.out.println("This BMW has " + this.wheels + " wheels");
        return this.wheels;
    }

    @Override
    public void run() {
        System.out.println("This BMW is running!");
    }

    @Override
    public String toString() {
        return "BMW{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", cylinders=" + cylinders +
                ", wheels=" + wheels +
                '}';
    }
}
