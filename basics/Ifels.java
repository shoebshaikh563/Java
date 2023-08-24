import java.util.Scanner;

public class Ifels {
    public static void main(String[] args) {
        System.out.println("Entere Your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18 && age <= 49) {
            System.out.println("eligible for vote");
        } else if (age >= 50 && age <= 100) {
            System.out.println("Go to hell");
        } else {
            System.out.print("not eligible");
        }
        sc.close();

    }
}
