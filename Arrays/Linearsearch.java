package Arrays;

public class Linearsearch {
    public static int linearsearch(String[] num, String key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }

        }
        return -1;
        

    }

    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry", "date", "elderberry"};
        String target = "cherry";
        int index = linearsearch(array, target);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println(target+" found at "+index);
        }


    }
}
