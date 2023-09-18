package Arrays;

// public class trappedrainwater {
//     public static void main(String[] args) {
//         int height[] = { 4, 2, 0, 6, 3, 2, 5 };
//         int n = height.length;
//         // calculate left max in arary
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for (int i = 1; i < n; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//         }
//         // calculate right max in array
//         int rightmax[] = new int[n];
//         rightmax[n - 1] = height[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightmax[i] = Math.max(height[i], rightmax[n - 1]);
//         }
//         // loop
//         int Trappedwater = 0;
//         for (int i = 0; i < n; i++) {
//             // water level=math.min(leftmax,right max)
//             int waterlevel = Math.min(leftMax[i], rightmax[i]);
//             // trapped water+=water level-hight[i]
//             Trappedwater += waterlevel - height[i];
//         }
//         System.out.println(Trappedwater);

//     }

// }

public class trappedrainwater {
    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int n = height.length;
        // left max
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // right
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        // loop
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            // water level=Math.min(rightmax.leftmax);
            int waterlavel = Math.min(rightmax[i], leftmax[i]);
            // tw=tw+waterlavel-heigh[i]
            trappedwater = trappedwater + waterlavel - height[i];

        }
        System.out.println("total water is " + trappedwater);

    }
}