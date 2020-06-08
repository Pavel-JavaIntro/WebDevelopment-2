package by.pavka.module2.task6.validator;

public class DeveloperValidator {
  public boolean validate(String[] args) {
    boolean isValid = false;
    if (args != null && args.length == 2) {
      try {
        Integer.parseInt(args[1]);
        isValid = true;
      }
      catch(NumberFormatException e) {
        e.printStackTrace();
      }
    }
    return isValid;
  }
}