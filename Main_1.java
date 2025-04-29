import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x and y : ");
        String[] text = input.nextLine().split(" ");
        int b = Integer.parseInt(text[0]);
        int p = Integer.parseInt(text[1]);
        System.out.println(power(b,p));

    }
    public static int power(int b,int p){
        if (p == 0){
            return 1;
        }
        return b * power(b,p-1);
    }
}
