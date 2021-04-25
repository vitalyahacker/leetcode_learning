import java.util.Arrays;

public class SortByParityTask {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 2, 2, 3, 4, 5, 6, 7, 13};

        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    public static int[] sortArrayByParity(int[] A) {
        int forwardIndex = 0;
        int backwardIndex = A.length - 1;
        while (forwardIndex < backwardIndex) {
            if (A[forwardIndex] % 2 != 0) {
                if (A[backwardIndex] % 2 == 0) {
                    A[backwardIndex] += A[forwardIndex];
                    A[forwardIndex] = A[backwardIndex] - A[forwardIndex];
                    A[backwardIndex] -= A[forwardIndex];
                } else {
                    backwardIndex--;
                }
            } else {
                forwardIndex++;
            }
        }
        return A;
    }
}
