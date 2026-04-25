package src.twodArrays;

public class maxofAllElement {
    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3},{20,19,21}};
        System.out.print(findMax(arr));
    }

    public static int findMax(int arr[][]){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>=max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
