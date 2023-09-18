package Arrays;
public class printsubarraysumusingprefix {
    public static void maxsubprefix(int number[]){
       
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        // calculate prefix
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }
        // subarray
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (max < currSum) {
                    max = currSum;
                }
            }

        }
        System.out.println("max value is " + max);
    }
    public static void kadans(int number[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<number.length;i++){
            cs=cs+number[i];
            if(cs<0){
                cs=0;
            }
            
            ms=Math.max(cs, ms);

        }
        System.out.println(ms);


    }
    public static void main(String[] args) {
         int number[] = {-2,-3,4,-1,-2,1,5,-3};
        //  maxsubprefix(number);
        kadans(number);
       
    }

}
