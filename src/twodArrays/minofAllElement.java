package src.twodArrays;

public class minofAllElement {
    public static void main(String[] args) {
        int arr[][] = {{4,2,3},{58,1,92}};
        System.out.print(findMIN(arr));
    }

    public static int findMIN(int arr[][]){
        int min=arr[0][0];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<=min){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }
}
