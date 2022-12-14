package Search;

import java.util.Arrays;

//tìm kiếm trong mảng đã được sắp xếp, chia mảng làm 2 khoảng và tìm kiếm trong
//từng khoảng đó, chia tiếp cho đến khi tìm thấy
public class BinarySearch {
    int binarySearch(int arr[], int l, int r, int x) {
        Arrays.sort(arr);
        if (r >= l) {
            int mid = l+(r-l) / 2;
//            System.out.println(l);
//            System.out.println(l+r);
//            System.out.println(r-l);
//            System.out.println(l+(r-l));
//            System.out.println("*****");

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {1, 2, 5, 4, -1, 6, 7, 8, 9};
        int n = arr.length;
        int x = 9;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);
    }
}
//class GFG {
//
//    static void binarySearch(int v[], int To_Find)
//    {
//        int lo = 0, hi = v.length - 1;
//        while (hi - lo > 1) {
//            int mid = (hi + lo) / 2;
//            if (v[mid] < To_Find) {
//                lo = mid + 1;
//            }
//            else {
//                hi = mid;
//            }
//        }
//        if (v[lo] == To_Find) {
//            System.out.println("Found At Index " + lo );
//        }
//        else if (v[hi] == To_Find) {
//            System.out.println("Found At Index " + hi );
//        }
//        else {
//            System.out.println("Not Found" );
//        }
//    }
//
//    public static void main (String[] args) {
//        int v[]={2};
//        int To_Find = 1;
//        To_Find = 2;
//        binarySearch(v, To_Find);
//    }
//}
