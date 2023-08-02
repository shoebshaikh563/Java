import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        int start= 1;
        Scanner sc = new Scanner(System.in);
        int end =sc.nextInt();
        do{
            System.out.print(start+" ");
            start++;
        }
        while(start<=end);
       
    }
}
