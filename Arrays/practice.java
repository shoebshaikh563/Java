package Arrays;

public class practice {
    public static void main(String[] args) {
        int number[]={1,1,2,3,};
        boolean isFound = false;
        for(int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                if(number[i]==number[j]){
                    isFound=true;
                }
            }
        }
        if(isFound==true){
            System.out.println("Found");

        }
        else{
            System.out.println("not found");
        }
    }
}
