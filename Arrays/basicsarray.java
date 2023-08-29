package Arrays;

import java.util.Scanner;

public class basicsarray {
    public static void main(String[] args) {
        // System.out.println("Enter Size Of array: ");
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        int[] array = new int[5];
        System.out.println("Eneter Element of Array");
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
            array[i] += 3;
        }
        System.out.println("Elements of Array is: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]+" ");
        }

    }
}