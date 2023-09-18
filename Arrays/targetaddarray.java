import java.util.Scanner;

public class targetaddarray {
    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5 };
        boolean result = true;

        System.out.println("Eter two targets");
        Scanner sc = new Scanner(System.in);
        int tar1 = sc.nextInt();
        sc.close();
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] + number[j] == tar1) {
                    result = false;
                    break;
                }

            }

        }
        if(result==false){
            System.out.println("yes");

        }
        else{
            System.out.println("no");
        }

    }
}
