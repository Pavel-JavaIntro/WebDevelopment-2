package by.pavka.module2.task5;

import by.pavka.module2.task5.exception.ConversionIntoNumberException;

public class Main {
  public static void main(String[] args) {
    Summator summator = new Summator();
    try {
      System.out.println(summator.sum(args));
    } catch (ConversionIntoNumberException e) {
      e.printStackTrace();
    }
  }
}