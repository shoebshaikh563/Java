import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        System.out.println("Enter Your Income: ");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        double tex;
        if (income < 500000) {
            tex = 0;
        } else if (income >= 500000 && income <= 1000000) {
            tex = income/100*20;

        } else {
            tex = income/100*30;
        }
      System.out.println("Your Tex Amount is: "+ tex);
      sc.close();
    }
}
