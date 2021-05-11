public class ThirdMaximum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 4, 5, 6};
        int[] arr3 = new int[]{3, 2, 1};
        int[] arr4 = new int[]{2, 2, 3, 1};
        int[] arr5 = new int[]{1, 2, -2147483648};

        System.out.println(thirdMax(arr));
        System.out.println(thirdMax(arr2));
        System.out.println(thirdMax(arr3));
        System.out.println(thirdMax(arr4));
        System.out.println(thirdMax(arr5));
    }

    public static int thirdMax(int[] nums) {
        Integer[] results = new Integer[3];

        for (int i = 0; i < nums.length; i++) {
            if (results[0] == null || results[0] <= nums[i]) {
                if (results[0] != null && results[0] == nums[i]) continue;
                results[2] = results[1];
                results[1] = results[0];
                results[0] = nums[i];
                continue;
            }

            if (results[1] == null || results[1] <= nums[i]) {
                if (results[1] != null && results[1] == nums[i]) continue;
                results[2] = results[1];
                results[1] = nums[i];
                continue;
            }
            if (results[2] == null || results[2] < nums[i]) {
                results[2] = nums[i];
            }
        }
        return results[2] != null ? results[2] : results[0];
    }
}
