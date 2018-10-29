package polymorphism;

public class Car{
    protected String producer;
    protected String model;
    protected int year;
    protected boolean engine;
    protected int cylinders;
    protected int wheels;

    public Car(String producer, String model, int year, int cylinders) {
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getProducer() {
        System.out.println("This car is made by " + this.producer);
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        System.out.println("This car is made in " + this.year);
        return year;
    }

    public boolean isEngine() {
        System.out.println("This car has an engine!");
        return engine;
    }

    public int getCylinders() {
        System.out.println("This car has " + this.cylinders + " cylinders");
        return cylinders;
    }

    public int getWheels() {
        System.out.println("This car has " + this.wheels + " wheels");
        return wheels;
    }

    //run implementation
    public void run() {
        System.out.println("This car is running!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", cylinders=" + cylinders +
                ", wheels=" + wheels +
                '}';
    }
}
