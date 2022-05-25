import java.lang.reflect.Array;
import java.util.Arrays;

class App {

  static double scores[] = { 72, 95, 91, 85, 87, 51, 65, 72, 75, 89
  };

  public static double total() {
    double total = 0;
    for (int i = 0; i < scores.length; i++) {
      total = total + scores[i];
    }
    return total;
  }

  public static double median() {
    total();
    double median = total() / 10;
    return median;
  }

  public static double high() {
    Arrays.sort(scores);
    double highest = scores[9];
    return highest;
  }

  public static double low() {
    Arrays.sort(scores);
    double lowest = scores[0];
    return lowest;
  }

  public static double mean() {
    double total = total();
    double mean = total / scores.length;
    return mean;
  }

  public static void main(String args[]) {
    System.out.println("\nMean: " + mean());

    System.out.println("\nMedian: " + median());

    System.out.println("\nHighest score: " + high());

    System.out.println("\nLowest score: " + low());
  }
}
