package Arrays;

// package Arrays;

// public class ps {
//     public static void main(String[] args) {
//         int a = 88988;
//         int r,sum=0,temp;
//         temp=a;
//         while(a!=0){
//             r=a%10;
//             sum=(sum*10)+r;
//             a=a/10;
//         }
//         if(temp==sum){
//             System.out.println("p");
//         }
//         else{
//             System.out.println("n");
//         }

//     }
// }

import java.util.Arrays;
import java.util.Scanner;


public class ps {
    public static void main(String[] args) {
        int[] number = { 93, 90, 12, 45, 57, 13 };
        System.out.println("enter kth element: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Arrays.sort(number);
        System.out.println("this is sorted array");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
        if(n>=1&&n<number.length){
            int kth = number[n-1];
            System.out.println("the "+n+" elemnt is "+kth);
        }
        else{
            System.out.println("n");
        }
        sc.close();

    }
}