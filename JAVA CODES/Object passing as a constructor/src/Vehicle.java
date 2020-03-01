public class Vehicle {

    private String name;
    private int wheels;
    private Design design;

    public Vehicle(String name, int wheels, Design design) {
        this.name = name;
        this.wheels = wheels;
        this.design = design;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public Design getDesign() {
        return design;
    }
}
