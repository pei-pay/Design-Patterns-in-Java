package facade;

import facade.pageMaker.PageMaker;

public class Main {
  public static void main(String[] args) {
    PageMaker.makeWelcomePage("mario@test.com", "welcome.html");
  }
}
