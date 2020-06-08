package by.pavka.module2.task5.exception;

public class ConversionIntoNumberException extends Exception {
  private static final String MESSAGE = "No arguments, or some are not integer numbers: ";

  public ConversionIntoNumberException(String s) {
    super(MESSAGE + s);
  }
}