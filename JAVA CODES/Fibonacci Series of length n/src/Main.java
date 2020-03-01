import java.util.Scanner;

class Main{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of length ");
        int number = scanner.nextInt();
        for(int i=1;i<=number;i++){
            System.out.print(getFibonacci(i)+" ");
        }
    }

    private static int getFibonacci(int number){
        if(number==1){
            return 0;
        }
        else if(number==2){
            return 1;
        }
        else{
               return getFibonacci(number - 1) + getFibonacci(number -2);
            }

    }
}