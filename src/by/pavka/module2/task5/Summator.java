package by.pavka.module2.task5;

import by.pavka.module2.task5.exception.ConversionIntoNumberException;

public class Summator {
  public int sum(String... numbers) throws ConversionIntoNumberException {
    if(numbers.length == 0) {
      throw new ConversionIntoNumberException("no args");
    }
    int sum = 0;
    for (String s : numbers) {
      try {
        sum += Integer.parseInt(s);
      } catch (NumberFormatException e) {
        throw new ConversionIntoNumberException(s);
      }
    }
    return sum;
  }
}