package DSA.BinarySearch;

public class BSwithRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2, 6, 5,7, 44, 47, 74};
        int target = 1;
        System.out.println(Search(arr, target, 0, arr.length - 1));
    }

    public static int Search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]) {
            return Search(arr, target, start, mid - 1);
        }
        return Search(arr, target, mid + 1, end);
    }
}
