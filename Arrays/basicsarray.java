package Arrays;

public class basicsarray {
    public static int update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 2;
            System.out.println(marks[i]);
        }
        return 0;

    }

    public static void main(String[] args) {
        int marks[] = { 12, 23, 34 };
        System.out.println(marks);
       update(marks);
       for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);
       }

    }
}