package src.PracticeQuestions.Day03;

public class ArrayRightShiftByKPosition {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        rightShift(arr, k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void  rightShift(int arr[],int k){
        int n=arr.length;
        k=k%n;
        //int last_element=arr[n-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        
    }
}
