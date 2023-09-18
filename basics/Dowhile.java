import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        System.out.println("Enter a no: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do {
            boolean isPrime = true;
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }

        } while (n <= 0);
        sc.close();
    }
}
