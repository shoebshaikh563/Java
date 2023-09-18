import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        System.out.println("Enter a no: ");
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int k = mul * i;
            System.out.println(mul + "*" + i + "=" + k);
        }
        sc.close();
    }
}

