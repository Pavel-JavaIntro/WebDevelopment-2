package by.pavka.module2.task1;

public class Hello {
  public static void main(String[] args) {
	if (args.length != 0) {
	  ConsolePrinter printer = new ConsolePrinter();
      printer.printHello(args[0]);
	}
  }
}