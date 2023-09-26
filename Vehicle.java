import javax.xml.namespace.QName;

public class Vehicle {

    private int milesToGo;
    boolean hasDriver = false;

    public Vehicle() {
        this.milesToGo = 0;
    }
    public Vehicle(int milesToGo) {
        this.milesToGo = milesToGo;
    }
    public void drive() {
        System.out.println("Default method print");
    }
    public void setDriver(Driver driver) {

    }
    public int getMilesToGo() {
        return milesToGo;
    }
    public void setHasDriver(boolean hasDriver) {
        this.hasDriver = hasDriver;
    }
}
