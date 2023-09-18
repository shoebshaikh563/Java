import java.util.*;

class java {
    public static void main(String[] args) {
        System.out.println("Enter a No: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if(isPrime==true){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        sc.close();
    }
}
