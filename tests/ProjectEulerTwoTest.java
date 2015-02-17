import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Project Euler Project Problem 2.
 */
public class ProjectEulerTwoTest {

  /**
   * Checks project euler two problem with test inputs.
   * @throws Exception Ignored.
   */
  @Test
  public void testGetFibonacciSum() throws Exception {
    assertEquals("test fibonacci sum for 10 as max value", 29, 10);
    assertEquals("test fibonacci sum for 10 as max value", 138, 50);
  }
}