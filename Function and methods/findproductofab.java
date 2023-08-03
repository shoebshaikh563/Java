import java.util.Scanner;

public class findproductofab {
    public static int Multiplication(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int product = Multiplication(a, b);
        System.out.println(product);
        product = Multiplication(10, 33);
        System.out.println(product);

        scanner.close();
    }

}