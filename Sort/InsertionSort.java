package Sort;

//sắp xếp chèn

public class InsertionSort {
//    int[] arr = {12, 11, 13, 5, 6};
    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            System.out.println(key+"=key");
            System.out.println(j+"=i-1");
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                System.out.println(j+"= j-1");
            }
            arr[j + 1] = key;
            System.out.println(key+"=j+1");
        }
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);
    }
}
