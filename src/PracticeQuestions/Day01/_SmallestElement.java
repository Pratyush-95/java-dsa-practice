package src.PracticeQuestions.Day01;

public class _SmallestElement {
    public static void main(String[] args) {
        int arr[]={2,5,1,8,3};
        System.out.println(minElement(arr));
    }

    public static int minElement(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;

    }
}
