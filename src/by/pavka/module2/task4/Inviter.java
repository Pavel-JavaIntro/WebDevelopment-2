package by.pavka.module2.task4;

public class Inviter {
  public static void main(String[] args) {
    PasswordVerification passwordVerification = new PasswordVerification();
    if (args != null) {
      passwordVerification.verify(args[0]);
    }
  }
}