import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }

    public static int[] sortedSquares(int[] nums) {
        int forwardIndex = 0;
        int backwardIndex = nums.length - 1;

        int[] result = new int[nums.length];
        int resultIndex = backwardIndex;

        while (forwardIndex <= backwardIndex) {
            if (Math.abs(nums[forwardIndex]) > Math.abs(nums[backwardIndex])) {
                result[resultIndex--] = nums[forwardIndex] * nums[forwardIndex];
                forwardIndex++;
            } else {
                result[resultIndex--] = nums[backwardIndex] * nums[backwardIndex];
                backwardIndex--;
            }
        }
        return result;
    }
}
