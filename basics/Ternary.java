import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int number = rs.nextInt();
        String Result= number%2==0?"even":"odd";
 
        System.out.println("Result is: "+Result);
        rs.close();
    }
}
