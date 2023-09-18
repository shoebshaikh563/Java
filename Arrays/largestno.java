// package Arrays;

// import java.util.*;

// public class largestno {
//     public static int largest(int number[]) {
//         int largest = Integer.MIN_VALUE;
//         int lowest= Integer.MAX_VALUE;

//         for(int i=0;i<number.length;i++){
//             if(largest<number[i]){
//                 largest=number[i];
//             }
//             else if(lowest>number[i]){
//                 lowest=number[i];
//             }

//         }
//         System.out.println(lowest);
//         return largest;

//     }

//     public static void main(String[] args) {
//         int number[] = {2,6,3,5,1 };
//         System.out.println("value is " + largest(number));
//     }
// }
package Arrays;


public class largestno {
    public static void main(String[] args) {
        int number[] = { 1, 1, 2, 3, 56, 2 };
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (highest < number[i]) {
                highest = number[i];
            }
            if (lowest > number[i]) {
                lowest = number[i];
            }

        }
        System.out.println(highest);
        System.out.println(lowest);
    }
}