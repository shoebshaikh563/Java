import java.util.Scanner;

public class Functionoverloading {
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static int add2(int a, int b) {
        int sum1 = add(a, b);
        System.out.println("Addition is:" + sum1);
        return sum1;
    }

    public static void main(String[] args) {
        System.out.println("Enter two no");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        add2(a, b);
        scanner.close();

    }
}
