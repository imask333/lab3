import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReverseInPlace2(){
    int[] input2 = {1, 2, 3};
    //3, 2, 3
    //3, 2, 3, 
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{3, 2, 1}, input2);
  }
  @Test 
  public void testReverse2(){
    int[] input3 = { 4,5,6};
    assertArrayEquals(new int[]{6, 5, 4}, ArrayExamples.reversed(input3));
  }
  @Test 
  public void testAverageWithoutLowest(){
    double[] input5 = {};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input5), 0.1);
  }
   @Test 
  public void testAverageWithoutLowest2(){
    double[] input6 = {1.0};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input6), 0.1);
  }
   @Test 
  public void testAverageWithoutLowest3(){
    double[] input6 = {1.0, 2.0, 3.0};
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input6), 0.1);
  }
}
