public class Car extends Vehicle {

    public Car() {
        super(100);
        System.out.println("Car created. " + getMilesToGo() + " miles to go!");
    }

    @Override
    public void drive() {

        if (!hasDriver) {
            System.out.println("Car didn't drive - there's no driver");
        } else {
            milesToGo -= 10;
            System.out.println("Car drove 10 miles - " + milesToGo + " miles to go");
        }
    }

    @Override
    public void setDriver(Driver driver) {
        if (driver.getAge() >= 18) {
            super.setDriver(driver);
            System.out.println("Driver changed to " + driver.getName());
        } else {
            System.out.println("Driver not changed! " + driver.getName() + " is " + driver.getAge() +
                    ", but must be 18 or older to drive a car.");
        }
    }
}
