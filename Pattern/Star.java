package Pattern;

import java.util.*;

public class Star {
    public static void main(String[] args) {
        int n = 4;
        int e;
        for (int line = 1; line <= n; line++) {
            for (int row = 1; row <= line; row++) {
                System.out.print(row);
            }
            System.out.println();
        }
        
    }
}
