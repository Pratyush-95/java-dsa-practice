package src.PracticeQuestions.Day03;

import java.util.HashMap;

public class HighestFrequencyElement {
    public static void main(String[] args) {
        int arr[]={5,2,3,2,3,1,2,9};
        modeofArray(arr);
        System.out.println(modeofArray(arr));
    }
    public static int modeofArray(int arr[]){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num:arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        // use to find every element count in array
        // for(int i:freq.keySet()){
        //     System.out.println(i +" -> " + freq.get(i));
        // }

        int maxFreq=-1;
        int maxFreqKey=-1;

        for(int key : freq.keySet()){
            int currentKey=key;
            int currentKeyFreq = freq.get(key);
            if(currentKeyFreq > maxFreq){
                maxFreq = currentKeyFreq;
                maxFreqKey = currentKey;
            }
        }
        return maxFreqKey;
    }
}
