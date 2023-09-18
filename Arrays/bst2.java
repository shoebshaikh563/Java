package Arrays;
public class bst2 {
    public static void main(String[] args) {

        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 10;
        int start = 0;
        int end = num.length - 1;
        boolean isfound = false;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                System.out.println("value is:" + mid);
                isfound = true;
                break;
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = end - 1;
            }
        }
        if (isfound==false) {
            System.out.println("not found");
        }

    }
}
