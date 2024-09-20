import static org.junit.Assert.*;
import org.junit.Test;
import thirthy_task.Solution;

public class SolutionTest3 {

    @Test
    public void testBasicCase() {
        Solution solution = new Solution();
        String s = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(3, result);
    }

    @Test
    public void testRepeatingCharacters() {
        Solution solution = new Solution();
        String s = "bbbbb";
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(1, result);
    }

    @Test
    public void testMixedCharacters() {
        Solution solution = new Solution();
        String s = "pwwkew";
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(3, result);
    }

    @Test
    public void testEmptyString() {
        Solution solution = new Solution();
        String s = "";
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(0, result);
    }

    @Test
    public void testSingleCharacterString() {
        Solution solution = new Solution();
        String s = "a";
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(1, result);
    }

    @Test
    public void testAllUniqueCharacters() {
        Solution solution = new Solution();
        String s = "abcdef";
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(6, result);
    }

    @Test
    public void testLongStringWithRepeatingBlocks() {
        Solution solution = new Solution();
        String s = "abcabcabcabcabcabc";
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(3, result);
    }
}