package src.Arrays;

public class MultiplyAllElements {
    public static void main(String[] args) {
         int arr[]={2,3,10,20};
         System.out.println(calculateProduct(arr));
    }

    public static int calculateProduct(int arr[]){
        int mul=1;
        for(int i=0;i<=arr.length-1;i++){
            mul=mul*arr[i];
        }
        return mul;
    }
   
}

