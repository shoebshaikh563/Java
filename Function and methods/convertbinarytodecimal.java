import java.util.Scanner;

public class convertbinarytodecimal {
    public static void  binaryTodecimal(int binNum){
        int myNum=binNum;
        int pow=0;
        int dec = 0;
        while(binNum>0){
            int lastdigit=binNum%10;
            dec = dec +(lastdigit*(int)Math.pow(2,pow));
            binNum=binNum/10;
            pow++;

        }
        System.out.println("decimal no is "+myNum+"= "+dec);

    }
    public static void main(String[] args) {
    System.out.println("Enter No: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    binaryTodecimal(n);
    }
}
