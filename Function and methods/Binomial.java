import java.util.*;

public class Binomial {
   
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        System.out.println("Binomial Coeficient is: "+binCoeff);
        return binCoeff;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        System.out.println("Enter value of r");
        int r = sc.nextInt();
        binCoeff(n, r);
        int hj = factorial(r);
        System.out.println(hj);

    }
}
