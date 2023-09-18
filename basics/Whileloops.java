import java.util.*;

public class Whileloops {
    public static void main(String[] args) {
        System.out.println("Enter num: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Value is:" + sum);
        sc.close();
    }

}