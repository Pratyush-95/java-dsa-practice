// Input:  [10, 20, 30, 40, 50, 60, 70]
// Output: [70, 10, 20, 30, 40, 50, 60]
// Program to rotate an array to the right by one position

package src.PracticeQuestions.Day03;

public class ArrayRightShift {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        // reverse(arr);
        // reverseInRange(arr,k);
        t1(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }    
    // public static void reverse(int arr[]){
    //     int i=0;
    //     int j=arr.length-1;
    //     while(i<j){
    //         int temp=arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=temp;
    //         i++;
    //         j--;
    //     }
    // }

    // public static void reverseInRange(int arr[],int k){
    //     int i=1;
    //     int j=arr.length-1;
    //     while(i<j){
    //         int temp=arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=temp;
    //         i++;
    //         j--;
            

    //     }
    // }

    public static void t1(int arr[]){
        int n=arr.length-1;
        int last_element=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last_element;
    }
    
    

}