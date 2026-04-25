package src.twodArrays;

public class twodArrayDemo2 {
    public static void main(String[] args) {
        
        int arr[][]={
                      {1,2},
                      {2,3,4,5},
                      {3,4,4,5,6,7},
                      {4}
        };

        int rowLength=arr.length;
        
        for(int row=0; row<=rowLength-1; row++){
            // jaise hi main kisi new row me aaya
            // same point par maine uss row ka collength find out karlia
            //current row > arr[row]
            // isme kitne colums -> arr[row].length

            int colLength = arr[row].length;
            for(int col=0; col<=colLength-1;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }


    }
}
