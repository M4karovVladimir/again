import static org.junit.Assert.*;

import first_task.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testTargetFound() {
        Solution solution = new Solution();
        int[] nums = {5,7,7,8,8, 10};
        int target = 8;
        int[] result = solution.findFirstAndLast(nums, target);
        assertTrue(result[0] == 3 && result[1] == 4 || result[0] == 4 && result[1] == 3);
    }
    @Test
    public void testTargetNotFound(){
        Solution solution = new Solution();
        int[] nums = {5,7,7,8,8, 10};
        int target = 6;
        int[] result = solution.findFirstAndLast(nums, target);
        assertArrayEquals(new int[]{-1, -1}, result);
    }
    @Test
    public void testTargetSingleOccurrence() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        int[] result = solution.findFirstAndLast(nums, target);
        assertArrayEquals(new int[]{2, 2}, result);
    }

    @Test
    public void testEmptyArray() {
        Solution solution = new Solution();
        int[] nums = {};
        int target = 1;
        int[] result = solution.findFirstAndLast(nums, target);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    public void testAllElementsAreTarget() {
        Solution solution = new Solution();
        int[] nums = {8, 8, 8, 8};
        int target = 8;
        int[] result = solution.findFirstAndLast(nums, target);
        assertArrayEquals(new int[]{0, 3}, result);
    }

}
