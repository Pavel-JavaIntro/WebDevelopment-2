package by.pavka.module2.task6;

import by.pavka.module2.task5.exception.ConversionIntoNumberException;
import by.pavka.module2.task6.validator.DeveloperValidator;

import java.util.Calendar;

public class Developer {
  private String name;
  private int days;

  public Developer(String[] data) throws ConversionIntoNumberException {
    DeveloperValidator developerValidator = new DeveloperValidator();
    if (developerValidator.validate(data)) {
      name = data[0];
      days = Integer.parseInt(data[1]);
    } else {
      throw new ConversionIntoNumberException("in Developer constructor");
    }
  }

  public String getName() {
    return name;
  }

  public Calendar findReadyDate() {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DAY_OF_MONTH, days);
    return calendar;
  }
}
