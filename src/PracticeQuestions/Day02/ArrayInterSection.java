package src.PracticeQuestions.Day02;

public class ArrayInterSection {
    public static void main(String[] args) {
        int arr1[]={2,4,2,5};
        int arr2[]={2,4,8};
         InterSection(arr1,arr2);
    }

    public static void InterSection(int arr1[],int arr2[]){

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if((arr1[i]==arr2[j]) && (i==0 || arr1[i]!= arr1[i-1])){
                    System.out.println(arr1[i]);
                    break;
                  
                }
            }
        }
    }
}
