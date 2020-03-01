public class Car {
    private String name;
    private String model;
    private String color;
    private int wheels;

    public Car(String name, String model, String color, int wheels) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.wheels = wheels;
    }

    public int comparison(Car b){
        if(this.name == b.name && this.model == b.model && this.color == b.color && this.wheels == b.wheels){
            return 1;
        }
        else{
            return 0;
        }
    }
}
