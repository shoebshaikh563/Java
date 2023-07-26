import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        System.out.println("Enter year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year%100)!=0;
        boolean z = (year%400)==0;
        if(x&&(y || z)){
            System.out.println("Leap Year");
            
        }
        else{
            System.out.println("not leap");
        }

    }
}
