import java.util.*;

public class primerangen {
    public static boolean isprime(int n) {
        boolean isprime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }
        return isprime = true;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.println("is prime: " + i);

            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeInRange(n);
        sc.close();

    }
}
