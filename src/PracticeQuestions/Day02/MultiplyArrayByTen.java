package src.PracticeQuestions.Day02;

public class MultiplyArrayByTen {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,12};
        multiply(arr);
    }

    public static void multiply(int arr[]){
        for(int i=0;i<arr.length;i++){
            int mul=10;
            mul=mul*arr[i];
            System.out.println(mul);
        }
        
    }
}
