package by.pavka.module2.task2;

public class Reverter {
  public String[] revertStringArray(String[] array) {
    String[] revert = null;
    if (array != null) {
      revert = new String[array.length];
      int length = array.length;
      for (int i = 0; i < length; i++) {
        revert[length - 1 - i] = array[i];
      }
    }
    return revert;
  }
}