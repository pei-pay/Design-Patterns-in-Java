package templateMethod;

public class Main {
  public static void main(String[] args) {
    AbstractDisplay d2 = new StringDisplay("Hello World");
    AbstractDisplay d3 = new StringDisplay("こんにちは。");
    d2.display();
    d3.display();
  }
}
