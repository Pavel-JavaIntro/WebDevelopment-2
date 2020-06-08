package by.pavka.module2.task7;

import by.pavka.module2.task7.exception.BirthdayException;

import java.util.Calendar;

public class Congratulator {
  public static void main(String[] args) {
    Birthday birthday = new Birthday();
    try {
      birthday.printBirthdayData(args);
    } catch (BirthdayException e) {
      e.printStackTrace();
    }
  }
}