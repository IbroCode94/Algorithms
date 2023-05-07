package org.example;
public class BubbleSort {
    void bubble(int arr[]){
        //for bubble sort we can just compare each index of i and j and which is less than
        //n get the length of the arr/ which is 6, {2,3,4,5,6,7}
        int n = arr.length;
        for(int i =0; i < n; i++){
       //     loop through the array that compares
            for(int j = 0;  j < n-i-1; j++){
                //the inner loops does the swapping,n-i-1 for first itera, 6-0-1 which means , it stops at 7;
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    void printArray (int arr[]){
        int n = arr.length;
        for(int i= 0; i< n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
