package Arrays;
public class printsubarray {

    public static void psa(int number[]) {
        int Maxsum = Integer.MIN_VALUE;
        // int sum = 0;
        int total = 0;
        for (int row = 0; row <= number.length - 1; row++) {

            for (int col = row; col <= number.length - 1; col++) {
                int sum = 0;
                total++;
                for (int k = row; k <= col; k++) {
                    // System.out.print(number[k]+" ");
                    sum = sum + number[k];
                }
                System.out.println(sum);

                if (Maxsum < sum) {
                    Maxsum = sum;
                }

             }
        }
        System.out.println("Max Valu of sum is :" + Maxsum);
        System.out.println(total);

    }

    public static void main(String[] args) {
        int number[] = {-1,-2,-3,-4};
        psa(number);

    }
}
