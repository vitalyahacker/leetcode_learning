import java.util.Arrays;

public class MoveZeroesTask {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,0,0,5,6,0,7};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums){
        int slowIndex = 0;
        int fastIndex = 1;

        while(fastIndex < nums.length){
            if(nums[slowIndex] == 0){
                if(nums[fastIndex] != 0 ){
                    nums[slowIndex++] = nums[fastIndex];
                    nums[fastIndex] = 0;
                }
            } else {
                slowIndex++;
            }
            fastIndex++;
        }

    }
}
