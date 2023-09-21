package Arrays;

import java.util.Scanner;

public class Myclass {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();
    // if ((a + b + c) % 3 == 0) {
    // System.out.println("TRUE");
    // } else {
    // System.out.println("FALSE");
    // }
    // }

    // public static void main(String[] args) {
    // int number[] = { 1, 2, 3, 5, 7 };
    // int sum = 0;
    // for (int i = 0; i < number.length; i++) {
    // if (number[i] % 2 != 0) {
    // sum += number[i];
    // }
    // }
    // if (sum >= 8 && sum <= 50) {
    // System.out.println("Result is: " + sum);
    // } else {
    // System.out.println("NA");
    // }
    // }
    public static int MyClass(int[] numbers, int limit1, int limit2,int sum,int count) {
       
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > limit1 && numbers[i] < limit2) {
                sum += numbers[i];
                count++;

            }
        }
        return sum/count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[5];
        for (int i = 0; i < 5; i++) {
            number[i] = sc.nextInt();
        }
        int limit1 = sc.nextInt();
        int limit2 = sc.nextInt();
        int sum = 0;
        int count = 0;
        int avg = MyClass(number, limit1, limit2,sum,count);
        System.out.println(avg);
        sc.close();

    }
}
