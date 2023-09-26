public class Car extends Vehicle {

    String name = "Car";

    public Car() {
        super(100);
        System.out.println("Car created. " + getMilesToGo() + " miles to go!");
    }

    @Override
    public void drive() {

        if (!hasDriver) {
            System.out.println("Car didn't drive - there's no driver");
        } else {
            System.out.println("Car drove 10 miles - 90 miles to go");
        }
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void setDriver(Driver driver) {
        hasDriver = true;
        if (driver.getAge() >= 18) {
            System.out.println("Driver changed to " + driver.getName());
        } else {
            System.out.println("Driver not changed! " + driver.getName() + " is " + driver.getAge() +
                    ", but must be 18 or older to drive a car.");
        }
    }
    public String getName() {
        return name;
    }


}
