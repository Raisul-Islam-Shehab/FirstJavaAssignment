import java.util.Scanner;

public class Main {
    private static int a=0,b=1,sum;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fib = getFibonacci(number);
        System.out.print(fib);
    }

    private static int getFibonacci(int number){

        if(number==1){
            return 0;
        }
        else if(number==2){
            return 1;
        }
        else{
            sum = a+b;
            a = b;
            b = sum;
            return getFibonacci(number-1)+getFibonacci(number-2);
        }
    }
}


