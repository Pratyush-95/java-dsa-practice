package src.PracticeQuestions.Day02;

public class CountNoOfZeroAndOnes {
    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,1,1};
        count(arr);
    }

    public static void count(int arr[]){
        int countZero=0;
        int countOnes=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }
            else{
                countOnes++;
            }
        }
        System.out.println(countZero);
        System.out.println(countOnes);
    }
}
