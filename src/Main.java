import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2,5, 6}, 3)
                )
        );

        System.out.println(
                Arrays.toString(
                        merge(new int[]{2, 0}, 1, new int[]{1}, 1)
                )
        );
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length ==0) return nums1;

        int newSize = m + n;
        int[] result = new int[newSize];

        int nums1Index = 0;
        int nums2Index = 0;

        for (int i = 0; i < newSize; i++) {
            if (nums1Index == m){
                result[i] = nums2[nums2Index++];
            } else if (nums2Index == n){
                result[i] = nums1[nums1Index++];
            } else if (nums1[nums1Index] < nums2[nums2Index]) {
                result[i] = nums1[nums1Index++];
            } else {
                result[i] = nums2[nums2Index++];
            }
        }

        for (int i = 0; i < newSize; i++) {
            nums1[i] = result[i];
        }
        return nums1;
    }
}
