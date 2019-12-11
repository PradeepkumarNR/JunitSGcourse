import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testRandomArrays() {

		int[] numbers = {12,4,5,8};
		int[] expected= {4,5,8,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);

}
	@Test(expected=NullPointerException.class)
	public void test_NullPointerException() {
		int [] numbers =null;
		
			Arrays.sort(numbers);
		}
	@Test(timeout=100)
	public void arraySortingPerformanceTest() {
		int[] numbers = {18,23,4,5};
		for (int i = 1; i < 1000000; i++) {
			numbers[0]=i;
			Arrays.sort(numbers);
			
		}
	}
		
		
	
}
