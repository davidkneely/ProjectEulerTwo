/**
 * Computes Fibonacci sequence on numbers up to 4000000.
 */
public class ProjectEulerTwo {
  /**
   * Computers fibonacci sequence on numbers up to 4000000.
   * @param args Ignored.
   */
  public static void main(String[] args) {

    int sum = 0;
    int MAX_VALUE = 4000000;
    int currentFibNumber;
    int firstPreviousNumber = 1;
    int secondPreviousNumber = 2;

    currentFibNumber = firstPreviousNumber + secondPreviousNumber;

    while(currentFibNumber < MAX_VALUE){
      currentFibNumber = firstPreviousNumber + secondPreviousNumber;
      firstPreviousNumber = secondPreviousNumber;
      secondPreviousNumber = currentFibNumber;
      sum += currentFibNumber;
    }

    System.out.println("The result is: " + sum);
  }
}

