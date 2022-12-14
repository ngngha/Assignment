package Search;

import java.util.Arrays;

//tìm kiếm nội suy, tìm vị trí đầu dò khác nhau tùy theo giá trị khóa cần tìm
// Đầu vào vẫn phải là 1 mảng đã sắp xếp, nếu giá trị khóa gần với phần tử cuối cùng
// hơn thì tìm kiếm nội suy sẽ bắt đầu từ phía cuối mảng.
public class InterpolationSearch {
    public static int interpolationSearch(int arr[], int lo, int hi, int x) {
        int pos;
        Arrays.sort(arr);
        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {
            pos = lo + (hi - lo) * (x - arr[lo]) / (arr[hi] - arr[lo]);
//            System.out.println(pos);
            if (arr[pos] == x)
                return pos;

            if (arr[pos] < x)
                return interpolationSearch(arr, pos + 1, hi, x);

            if (arr[pos] > x)
                return interpolationSearch(arr, lo, pos - 1, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47};
        int n = arr.length;
        int x = 12;
        int index = interpolationSearch(arr, 0, n - 1, x);
        if (index != -1)
            System.out.println("Element found at index "
                    + index);
        else
            System.out.println("Element not found.");
    }
}
