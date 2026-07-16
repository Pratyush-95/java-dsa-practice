
package src.PracticeQuestions.Day02;

public class SwapAlternateElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        swap(arr);
        for(int p=0;p<arr.length;p++){
            System.out.print(arr[p]+" ");
        }
    }

    public static void swap(int arr[]){
        int i=0;
        int j=arr.length-5;
        while(j<arr.length) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i=i+2;
            j=j+2;
        }
    }    
}