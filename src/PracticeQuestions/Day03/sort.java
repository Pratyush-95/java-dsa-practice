package src.PracticeQuestions.Day03;

import java.util.*;

public class sort {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,1};
        t1(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void t1(int arr[]){
        Arrays.sort(arr);
    }
}
