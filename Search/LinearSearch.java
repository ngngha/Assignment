package Search;
// tìm kiếm trong mảng bất kì, duyệt từng phần tử cho đến khi trùng key
public class LinearSearch {
    public static int search(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 12, 10, 40};
        int x = 10;

        int result = search(arr, x);
        if (result == -1)
            System.out.print(
                    "Element is not present");
        else
            System.out.print("Element is present at index " + result);
    }
}

//class Test {
//    static int arr[] = {5, 15, 6, 9, 4};
//
//    static int linearsearch(int arr[], int size, int key) {
//        if (size == 0) {
//            return -1;
//        } else if (arr[size - 1] == key) {
//            return size - 1;
//        } else {
//            return linearsearch(arr, size - 1, key);
//        }
//    }
//
//    public static void main(String[] args) {
//        int key = 15;
//        int index = linearsearch(arr, arr.length, key);
//        if (index != -1)
//            System.out.println( key + " is found at " + index);
//        else
//            System.out.println(key + " is not found.");
//    }
//}
