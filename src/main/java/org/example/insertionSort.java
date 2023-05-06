package org.example;

public class insertionSort {

    static void insertionSort(int [] arr){
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i;
            while(j > 0 && arr[j- 1] > temp){
                j--;
            }
            arr[j] = temp;
        }
    }
}
