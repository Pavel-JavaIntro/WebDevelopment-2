package by.pavka.module2.task4;

public class PasswordVerification {
  private static final String PASSWORD = "tHg6t_99b";

  public void verify(String psw) {
    if (PASSWORD.equals(psw)) {
      System.out.println("Welcom");
    } else {
      System.out.println("Access denied");
    }
  }
}