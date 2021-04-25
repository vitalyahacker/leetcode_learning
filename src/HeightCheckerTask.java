import java.util.Arrays;

public class HeightCheckerTask {

    public static void main(String[] args) {
        int[] nonSortedArray = new int[]{5, 1, 2, 3, 4};

        int[] sortedArray = new int[]{1, 2, 3, 4, 5};
        int[] thirdArray = new int[]{1,1,4,2,1,3};

    //    System.out.println(heightChecker(sortedArray));
    //    System.out.println(heightChecker(nonSortedArray));
        System.out.println(heightChecker(thirdArray));
    }

    public static int heightChecker(int[] heights){
        int[] copy = new int[heights.length];
        System.arraycopy(heights, 0, copy, 0, heights.length);

        Arrays.sort(copy);

        int heightMismatchCounter  = 0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != copy[i]) heightMismatchCounter++;
        }
        return heightMismatchCounter;
    }

}
