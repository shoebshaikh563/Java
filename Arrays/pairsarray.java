package Arrays;

// public class pairsarray {
//     public static void pair(int number[]) {
//         int tp = 0;
//         for (int i = 0; i < number.length; i++) {
//             int current = number[i];
//             for (int j =i+1; j < number.length; j++) {
//                 System.out.print("(" + current + "," + number[j] + ")");
//                 tp++;

//             }

//             System.out.println();
//         }
//         System.out.println(tp);

//     }

//     public static void main(String[] args) {
//         int number[] = { 2, 4, 6, 8 };
//         pair(number);

//     }
// }

public class pairsarray{
    public static void main(String[] args) {
        int num [] = {2,4,6,8,10};
        int tp=0;
        for(int i=0;i<num.length;i++){
            int current=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+current+","+num[j]+")");
                 tp++;
            }
            System.out.println();
           
        }
        System.out.println(tp);
    }
}