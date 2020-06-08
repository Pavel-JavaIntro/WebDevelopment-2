package by.pavka.module2.task3;

import java.util.Random;

public class RandomGenerator {
  private Random random = new Random();

  public void printRandom(int number, boolean breakLine) {
    for (int i = 0; i < number; i++) {
      int next = random.nextInt();
      if (breakLine) {
        System.out.println(next);
      } else {
        System.out.print(next + " ");
      }
    }
	System.out.println();
  }
}