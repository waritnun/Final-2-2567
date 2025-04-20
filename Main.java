import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(n + "! : " + fact(n));
    }
    public static int fact(int n ){
        if (n == 0){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }

}
