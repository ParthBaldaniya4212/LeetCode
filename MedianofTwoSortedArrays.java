import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int nums1[] = { 1, 2 };
        int nums2[] = { 3,4 };
        int a1 = nums1.length;
        int a2 = nums2.length;
        int b1 = a1 + a2;
        int arr[] = new int[b1];
        System.arraycopy(nums1, 0, arr, 0, a1);
        System.arraycopy(nums2, 0, arr, a1, a2);

        Arrays.sort(arr);
        if (arr.length % 2 == 0) {
            int c = arr.length / 2;
            int d = c ;
            double ans = (double)(arr[c-1] + arr[d]) / 2;
            System.out.println(ans);
        }
        else {
            int c = (arr.length+1) / 2;
            double ans = arr[c - 1];
            System.out.println(ans);
        }
        
        
    }
}
