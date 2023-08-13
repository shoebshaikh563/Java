package Pattern;

public class hollowrectangle {
    public static void hollow_rectangle(int toRow, int toCol) {
        // outer loop
        for (int i = 1; i <= toRow; i++) {
            // inner loop
            for (int j = 1; j <= toCol; j++) {
                // cel(i,j)
                if (i == 1 || i == toRow || j == 1 || j == toCol) {
                    // boundary cell
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void halfpramid(int n) {
        char counter = 'a';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(counter++);
            }
            System.out.println();
        }

    }

    public static void floid_trangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter++);
            }
            System.out.println();
        }
    }
    public static void invertaedhalf(int n) {
        //outer loop
        for (int i = 1; i <= n; i++) {
            //for spce
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        hollow_rectangle(10, 10);
        halfpramid(5);
        floid_trangle(5);
        invertaedhalf(5);
    }

    

}
