import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int number = rs.nextInt();
        String Result= number>33?"pass":"fail";
 
        System.out.println("Result is: "+Result);
    }
}
