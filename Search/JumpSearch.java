package Search;

import java.util.Arrays;

//thứ tự hiệu xuất giữa jumpsearch, linearsearch và binarysearch là
// linear < jumpsearch < binary. Đầu vào phải là mảng đã được sắp xếp
//nếu xét trường hợp ptu tìm kiếm là ptu nhỏ nhất hoặc lớn hơn nhỏ nhất
// thì sử dụng binary còn không thì tìm kiếm nhảy có lợi thế hơn khi chỉ duyệt lại 1 lần
//thực hiện bước nhảy tính theo căn bậc(làm tròn xuống) của số phần tử trong mảng
//nhảy cho đến khi thấy chỉ mục chứa giá trị phần tử lớn hơn phần từ cần tìm thì
//lùi lại 1 bước và thực hiện tìm kiếm tuyến tính từ chỉ mục đó.
public class JumpSearch {
    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        Arrays.sort(arr);
        int step = (int) Math.floor(Math.sqrt(n));
        int prev=0;
        while (arr[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }

        for (; prev < n; prev++) {
            if (arr[prev] == x)
                return prev;
        }
        return -1;

//        while (arr[prev] < x) {
//            prev++;
//            if (prev == Math.min(step, n))
//                return -1;
//        }
//        if (arr[prev] == x)
//            return prev;
//        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21,
                55, 34, 89, 144, 233, 377, 610};
        int x = 54;
        int index = jumpSearch(arr, x);
        if (index == -1)
            System.out.println("Element not present");
        else
            System.out.println("Number " + x +
                    " is at index " + index);
    }
}
