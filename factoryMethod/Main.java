package factoryMethod;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;
import factoryMethod.idcard.IDCardFactory;

public class Main {
  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("Tom Hanks");
    Product card2 = factory.create("Leonard Dicaprio");
    Product card3 = factory.create("Brad Pitt");
    card1.use();
    card2.use();
    card3.use();
  }
}
