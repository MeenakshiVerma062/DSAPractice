package sort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element ");
    int size = sc.nextInt();
    int arr[] = new int[size];
        System.out.println("Enter the element in array");
        for(int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<size-1; i++){
        for(int j =0; j<size-i-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
        System.out.println("Sorted array");
        for(int i = 0; i<size; i++){
        System.out.print(" "+arr[i]);
    }
      sc.close();
}
}

