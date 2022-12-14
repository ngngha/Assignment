package Search;

import java.util.Arrays;
//tìm kiếm cấp số nhân, bắt dầu từ vị trí 1 so sánh phần tử đó với x nếu phần tử đó bé hơn hoặc bằng x thì nhân đôi kích thước lên vị trí
// nếu thấy giá trị phần tử ở vị trí đó lớn hơn x thì dùng tìm kiếm nhị phân tìm từ vị trí kích thước cũ với vị trí vừa so sánh
//mảng truyền vào phải được sắp xếp
public class ExponentialSearch {
    static int exponentialSearch(int arr[], int n, int x)
    {
        Arrays.sort(arr);
        if (arr[0] == x)
            return 0;

        int i = 1;
        while (i < n && arr[i] <= x)
            i = i*2;

        return Arrays.binarySearch(arr, i/2, Math.min(i, n-1), x);
    }

    public static void main(String args[])
    {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 3;
        int result = exponentialSearch(arr, arr.length, x);
        if (result < 0)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
