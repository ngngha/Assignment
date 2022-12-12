package Search;

import java.util.Arrays;

public class TernarySearch {
    static int ternarySearch(int l, int r, int key, int arr[]) {
        if (r >= l) {
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

            if (arr[mid1] == key) {
                return mid1;
            }
            if (arr[mid2] == key) {
                return mid2;
            }
            if (key < arr[mid1]) {
                return ternarySearch(l, mid1 - 1, key, arr);
            } else if (key > arr[mid2]) {
                return ternarySearch(mid2 + 1, r, key, arr);
            } else {
                return ternarySearch(mid1 + 1, mid2 - 1, key, arr);
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {1, 5, 3, 4, 2, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int l = 0, r = arr.length - 1;
        int key = 5;
        int result = ternarySearch(l, r, key, arr);
        System.out.println("Index of " + key + " is " + result);
    }
}
