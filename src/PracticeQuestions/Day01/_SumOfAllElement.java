package src.PracticeQuestions.Day01;

public class _SumOfAllElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        sumoOfElement(arr,sum);
    }
    public static void sumoOfElement(int arr[],int sum){
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }

}
