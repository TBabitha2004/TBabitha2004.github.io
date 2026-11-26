import java.util.*;

public class BubbleSort {

    public static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        boolean swap = true;
        while (swap)
        {
            swap = false;
            for(int i=0; i<n-1; i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int x = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = x;
                    swap = true;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = in.nextInt();

        int[] arr = new int [n];
        System.out.println("Enter the Array:");
        for(int i=0; i<n; i++)
        {
            arr[i] = in.nextInt(); 
        }

        System.out.println("Original array: " +Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Sorted array: " +Arrays.toString(arr));
    }
}