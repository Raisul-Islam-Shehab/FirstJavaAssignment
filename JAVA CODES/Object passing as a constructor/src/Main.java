public class Main {

    public static void main(String[] args) {
        Design design = new Design("Red","m420");
        Vehicle first = new Vehicle("Car",4,design);

        System.out.println(first.getDesign().getColor());
        System.out.println(first.getWheels());
        System.out.println(first.getName());
        System.out.println(first.getDesign().getModel());
    }
}
