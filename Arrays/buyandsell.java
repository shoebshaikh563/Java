package Arrays;

public class buyandsell {

    public static int bands(int[] price) {
        int byprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < price.length; i++) {
            if (price[i] > byprice) {
                int profit = price[i] - byprice;
                maxprofit = Math.max(maxprofit, profit);

            }
            else{
                byprice=price[i];
            }
        }
        return maxprofit;

    }

    public static int min(int[] price) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < price.length; i++) {
            if (price[i] < min) {
                min = price[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int parice[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(bands(parice));
        // System.out.println(min(parice));

    }
}