import org.pair.finance.MajorityElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MajorityElementTest {

    @Test
    public void testMajorityElementExample1() {
        int[] nums = {4, 2, 4};
        int expectedResult = 4;
        int actualResult = MajorityElement.getMajorityElement(nums);
        Assert.assertEquals(actualResult, expectedResult, "Example 1 failed");
    }

    @Test
    public void testMajorityElementExample2() {
        int[] nums = {3, 3, 1, 1, 1, 3, 3};
        int expectedResult = 3;
        int actualResult = MajorityElement.getMajorityElement(nums);
        Assert.assertEquals(actualResult, expectedResult, "Example 2 failed");
    }

    @Test
    public void testMajorityElementExample3() {
        int[] nums = {2, 1, 2, 2, 1, 3, 3};
        int expectedResult = 2;
        int actualResult = MajorityElement.getMajorityElement(nums);
        Assert.assertEquals(actualResult, expectedResult, "Example 3 failed");
    }

    @Test
    public void testAllSameElement() {
        int[] nums = {5, 5, 5, 5, 5};
        int expectedResult = 5;
        int actualResult = MajorityElement.getMajorityElement(nums);
        Assert.assertEquals(actualResult, expectedResult, "All same element failed");
    }

    @Test
    public void testMajorityAtBeginning() {
        int[] nums = {4, 4, 4, 1, 2, 4, 4, 3};
        int expectedResult = 4;
        int actualResult = MajorityElement.getMajorityElement(nums);
        Assert.assertEquals(actualResult, expectedResult, "Majority at the beginning failed");
    }

    @Test
    public void testMajorityAtEnd() {
        int[] nums = {1, 2, 3, 4, 5, 6, 6, 6};
        int expectedResult = 6;
        int actualResult = MajorityElement.getMajorityElement(nums);
        Assert.assertEquals(actualResult, expectedResult, "Majority at the end failed");
    }

    @Test
    public void testTwoMajorityElements() {
        int[] nums = {2, 2, 2, 3, 3, 3};
        int expectedResult = 2;
        int actualResult = MajorityElement.getMajorityElement(nums);
        System.out.println(actualResult);
        Assert.assertTrue(actualResult == 2 || actualResult == 3, "Two majority elements failed");
    }

}
