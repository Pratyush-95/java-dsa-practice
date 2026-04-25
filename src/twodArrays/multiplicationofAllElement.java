package src.twodArrays;

public class multiplicationofAllElement {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{1,2,3}};
        System.out.print(multiply(arr));

    }

    public static int multiply(int arr[][]){
        int mul=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                mul=mul*arr[i][j];
            }
        }
        return mul;
    }
}
