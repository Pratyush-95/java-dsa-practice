package src.PracticeQuestions.Day02;

public class FindPositiveandNegativeSum {
    public static void main(String[] args) {
        int arr[]={2,-3,-1,4,6,-9};
        int postive=0;
        int negative=0;
        sum(arr, postive, negative);
    }

    public static void sum(int arr[],int position,int negative){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                position = position+arr[i];
            }
            else{
                negative=negative+arr[i];
            }
        }
        System.out.println(position);
        System.out.println(negative);
    }

    
}
