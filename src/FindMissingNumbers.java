import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumbers {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers3(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(findDisappearedNumbers3(new int[]{1, 1}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numbers = IntStream.range(1, nums.length + 1).boxed().collect(Collectors.toSet());
        for (int i = 0; i < nums.length; i++) {
            numbers.remove(nums[i]);
        }
        return new ArrayList<>(numbers);
    }

    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        int[] ascNumbers = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            ascNumbers[i] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            ascNumbers[nums[i]] = 0;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < ascNumbers.length; i++) {
            if (ascNumbers[i] != 0) {
                result.add(ascNumbers[i]);
            }
        }
        return result;
    }

    public static List<Integer> findDisappearedNumbers3(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int position = Math.abs(nums[i]) - 1;
            if (nums[position] > 0) {
                nums[position] = -nums[position];
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
