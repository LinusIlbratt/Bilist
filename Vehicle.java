import javax.xml.namespace.QName;

public class Vehicle {

    protected String type;
    private int milesToGo;
    private int distanceDriven;
    private int ageLimit;
    private Driver driver;


    public Vehicle(String type, int milesToGo, int ageLimit, int distanceDriven) {
        this.type = type;
        this.milesToGo = milesToGo;
        this.ageLimit = ageLimit;
        this.distanceDriven = distanceDriven;
        System.out.println(type + " created. " + getMilesToGo() + " miles to go!");
    }

    public Driver getDriver(){
        return driver;
    }

    public int getMilesToGo() {
        return milesToGo;
    }

    public void setDriver(Driver driver) {
        if (driver.getAge() < ageLimit) {
            System.out.println("Driver not changed! " + driver.getName() + " is " + driver.getAge() + ", but must be " + ageLimit + " or older to drive car");
        } else {
            this.driver = driver;
            System.out.println("Driver changed to " + driver.getName());
        }
    }
    public void drive() {
        if (driver != null) {
            milesToGo -= distanceDriven;
            System.out.println(type + " drove " + distanceDriven + " miles - " + milesToGo + " miles to go");
        } else {
            System.out.println(type + " didn't drive - there is no driver!");
        }
    }
}
