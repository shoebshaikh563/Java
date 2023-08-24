import java.util.Scanner;

public class Reverseofno {
    public static void main(String[] args) {
        int rev = 0;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int lastDig = n % 10;
            n /= 10;
            rev = (rev * 10) + lastDig;

        }
        System.out.print(rev);

    }
}
