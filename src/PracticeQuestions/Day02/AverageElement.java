package src.PracticeQuestions.Day02;

public class AverageElement {
    public static void main(String[] args) {
        int arr[]={2,4,3,2};
        System.out.println(average(arr));
    }
    public static double average(int arr[]){
        double sum=0;
       int size=arr.length;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum/size;
       
    }
  
    
}
