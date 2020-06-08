package by.pavka.module2.task7;

import by.pavka.module2.task7.exception.BirthdayException;

import java.util.Calendar;
import java.util.GregorianCalendar;
import by.pavka.module2.task7.entity.Week;

public class Birthday {
  private static final String WRONG_ARGS = "Wrong number of arguments";
  private static final String WRONG_NUMBER = "Wrong number format";
  private static final String WRONG_DATE = "Such a date does not exist";

  private Calendar birthday;

  public void printBirthdayData(String[] args) throws BirthdayException {
    formBirthday(args);
    StringBuilder stringBuilder = new StringBuilder("You were born on ");
    stringBuilder.append(Week.values()[birthday.get(Calendar.DAY_OF_WEEK) - 2]);
    stringBuilder.append('\n');
    stringBuilder.append("You are ");
    stringBuilder.append(calculateAge());
    stringBuilder.append('\n');
    if(isBirthday()) {
      stringBuilder.append("Happy Birthday!");
    }
    System.out.println(stringBuilder.toString());
  }

  private void formBirthday(String[] args) throws BirthdayException {
    if (args != null && args.length == 3) {
      try {
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]) - 1;
        int year = Integer.parseInt(args[2]);
        birthday = new GregorianCalendar();
        birthday.setLenient(false);
        birthday.set(year, month, day);
		return;
      } catch (NumberFormatException e) {
        throw new BirthdayException(WRONG_NUMBER);
      } catch (IllegalArgumentException e) {
        throw new BirthdayException(WRONG_DATE);
      }
    }
    throw new BirthdayException(WRONG_ARGS);
  }

  private int calculateAge() {
    Calendar now = Calendar.getInstance();
    int age = now.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
    if (now.get(Calendar.MONTH) < birthday.get(Calendar.MONTH)) {
      age--;
    } else if (now.get(Calendar.MONTH) == birthday.get(Calendar.MONTH)
        && now.get(Calendar.DAY_OF_MONTH) < birthday.get(Calendar.DAY_OF_MONTH)) {
      age--;
    }
    return age;
  }

  private boolean isBirthday() {
    Calendar now = Calendar.getInstance();
    return now.get(Calendar.MONTH) == birthday.get(Calendar.MONTH)
        && now.get(Calendar.DAY_OF_MONTH) == birthday.get(Calendar.DAY_OF_MONTH);
  }
}
