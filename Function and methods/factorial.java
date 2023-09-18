import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println(f);
        return f;
    }

    public static void main(String[] args) {
        // System.out.println((fact(4)));
        System.out.println("Enter No: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fact(n);
        scanner.close();

    }
}
