import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        merge(new int[]{1, 2, 3, 4, 0, 0}, 4, new int[]{3, 6}, 2)
                )
        );

        System.out.println(
                Arrays.toString(
                        merge(new int[]{5, 6, 0, 0}, 2, new int[]{1, 2}, 2)
                )
        );
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int newSize = m + n;
        int[] result = new int[newSize];

        return nums1;
    }
}
