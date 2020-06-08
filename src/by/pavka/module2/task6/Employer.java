package by.pavka.module2.task6;

import by.pavka.module2.task5.exception.ConversionIntoNumberException;

public class Employer {
  public static void main(String[] args) {
    try {
      Developer developer = new Developer(args);
      System.out.printf("Developer %s will finish the task on %s%n", developer.getName(), 
              developer.findReadyDate().getTime());
    } catch (ConversionIntoNumberException e) {
      e.printStackTrace();
    }
  }
}