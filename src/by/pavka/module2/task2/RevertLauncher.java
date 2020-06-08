package by.pavka.module2.task2;

public class RevertLauncher {
  public static void main(String[] args) {
    Reverter reverter = new Reverter();
    String[] revert = reverter.revertStringArray(args);
    for (String s : revert) {
      System.out.println(s);
    }
  }
}