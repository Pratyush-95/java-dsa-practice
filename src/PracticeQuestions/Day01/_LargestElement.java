package src.PracticeQuestions.Day01;

public class _LargestElement {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        System.out.println(maxElement(arr));
    }
    public static int maxElement(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
       

     
    }
}
