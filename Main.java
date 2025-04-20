import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Fibonacci number of " + n + " : " + fibo(n));
    }
    public static int fibo(int n ){
        if (n >=3){
            return fibo(n-1) + fibo(n-2);
        }
        else{
            return 1;
        }
    }

}