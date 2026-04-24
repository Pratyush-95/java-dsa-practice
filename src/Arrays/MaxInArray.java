package src.Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int arr[] = {4,2,-5,21,15};
        System.err.println(findMax(arr));
    }

    public static int findMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
