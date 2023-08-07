import java.util.Scanner;

public class convertdecimaltobinary {
    public static void dectobin(int n) {
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem*(int)Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println(binNum);
    }

    public static void main(String[] args) {
        System.out.println("Enter No: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dectobin(n);
    }
}
