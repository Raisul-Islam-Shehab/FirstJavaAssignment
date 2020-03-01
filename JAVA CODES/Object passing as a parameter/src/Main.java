public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Rover","M420","Red",4);
        Car car2 = new Car("Rover","M420","Black",4);

       int result = car1.comparison(car2);
       if(result==1){
           System.out.println("Same Car");
       }
       else{
           System.out.println("Different Car");
       }
    }
}
