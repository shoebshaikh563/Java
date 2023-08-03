import java.util.Scanner;

public class Swappingofno {
    public static void Swap(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eter Value for A");
        int a = scanner.nextInt();
        System.out.println("Eter Value for B");
        int b = scanner.nextInt();
        Swap(a, b);
        System.out.println("Value of A "+a);
        System.out.println("Value of B "+b);
        scanner.close();

    }
}
