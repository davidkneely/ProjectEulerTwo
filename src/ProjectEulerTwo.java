/**
 * Computes Fibonacci sequence on numbers up to 4000000.
 */
public class ProjectEulerTwo {
  /**
   * Computers fibonacci sequence on numbers up to 4000000.
   * @param args Ignored.
   */
  public static void main(String[] args) {

    int sum = getFibonacciSum(50);

    System.out.println("The result is: " + sum);
  }

  /**
   * Gets sum of fibonacci numbers from inputNumber.
   * @param inputNumber The max number to computer fibonacci sequence to.
   * @return The sum.
   */
  public static int getFibonacciSum(int inputNumber) {
    int sum = 0;
    int currentFibNumber;
    int firstPreviousNumber = 1;
    int secondPreviousNumber = 2;

    currentFibNumber = firstPreviousNumber + secondPreviousNumber;

    while (currentFibNumber < inputNumber) {
      currentFibNumber = firstPreviousNumber + secondPreviousNumber;
      firstPreviousNumber = secondPreviousNumber;
      secondPreviousNumber = currentFibNumber;
      sum += currentFibNumber;
    }
    return sum;
  }
}

