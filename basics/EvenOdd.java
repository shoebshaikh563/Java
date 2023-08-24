import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        System.out.println("Eneter number");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        if(number%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
