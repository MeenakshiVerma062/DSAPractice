import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int size = sc.nextInt();
  int arr[] = new int[size];
        System.out.println("Enter the element ");
        int n = sc.nextInt();
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element in array");
        for(int i=0; i<=n-1; i++){
            for(int j =0; j<=n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array\n");
        for(int i = 0; i<n; i++){
            System.out.println("\n"+arr[i]);
        }

    }
}