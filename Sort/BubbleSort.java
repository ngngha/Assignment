package Sort;

import java.util.Arrays;

// sắp xếp bong bóng
public class BubbleSort {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void bubbleSort1(int arr[], int n) {
        if (n == 1)
            return;

        int count = 0;
        for (int i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count = count + 1;
            }

        if (count == 0)
            return;

        bubbleSort1(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 54};
        bubbleSort1(arr, arr.length);
        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(arr));

        BubbleSort ob = new BubbleSort();
        int arr1[] = {5, 1, 4, 8, 2};
        ob.bubbleSort(arr1);
        System.out.println("Sorted array");
        ob.printArray(arr1);
    }

}
