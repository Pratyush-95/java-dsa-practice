package src.PracticeQuestions.Day02;

public class FindUnSortedElement {
    public static void main(String[] args) {
        int arr[]={2,3,9,5,13};
        find(arr);
    }
    public static void find(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
               System.out.println(arr[i+1]);
            }
           
        }
    }
}
