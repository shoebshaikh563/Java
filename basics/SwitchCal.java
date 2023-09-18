import java.util.Scanner;

public class SwitchCal {
    public static void main(String[] args) {
        System.out.println("Enter Two number");
        Scanner sw = new Scanner(System.in);
        double a = sw.nextDouble();
        double b = sw.nextDouble();
        System.out.println("Enter + - * / %");
        char cal = sw.next().charAt(0);
        switch (cal) {
            case '+':
                System.out.println("Addition is: " + (a + b));
                break;
            case '-':
                System.out.println("Substraction is: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication is: " + (a * b));
                break;
            case '/':
                System.out.println("Division is: " + (a / b));
                break;
            case '%':
                System.out.println("Remender is: " + (a % b));
                break;
            default:
                System.out.println("Wrong Selection");

        }
        sw.close();

    }
}
