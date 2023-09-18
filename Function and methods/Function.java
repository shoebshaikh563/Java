import java.util.Scanner;

public class Function {
    public static int calculateSum(int num1,int num2){    //prameters or formal parameters//recive no from main function
        int sum = num1+ num2;
        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);  //arguments or actual parameters//send number from here to function
        


        // int cal = calculateSum(a, b);
        System.out.println(sum);
        sc.close();

 }
}
