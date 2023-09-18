// import java.util.Scanner;

// public class Breakcontinue {
//     public static void main(String[] args) {
//         System.out.println("Enter number: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             if (i == 5) {
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("I am Out of loop");
//     }
// }

import java.util.Scanner;

public class Breakcontinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        do {
            System.out.println("Enter Number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n);
        } while (true);
    }
}