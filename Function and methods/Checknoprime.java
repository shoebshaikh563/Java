import java.util.*;

public class Checknoprime {
    // public static boolean Checkp(int n){
    // boolean isPrime = true;
    //     for (int i = 2; i <= n - 1; i++) {
    //         if (n % i == 0) {
    //             isPrime = false;
    //         }
    //     }
    //     if (isPrime == true) {
    //         System.out.println("prime");
    //     } else {
    //         System.out.println("not prime");
    //     }
    //     return isPrime;

    // }
    public static boolean isPrime(int n){
    if(n==2){
        return true;    
    }
     for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
     }
     return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);
        System.out.println(isPrime(n));
    }
}
