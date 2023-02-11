package hello;

public class Greeter {

  public String sayHello() {
    foo(Suit.CLUBS);
    return "Errorprone issue reproducer";
  }

  enum Suit {
    HEARTS,
    CLUBS,
    SPADES,
    DIAMONDS
  }

  private void foo(Suit suit) {
    switch (suit) {
      case HEARTS:
        System.out.println("Red hearts");
      case DIAMONDS:
        System.out.println("Red diamonds");
      case SPADES:
        // Fall through
      case CLUBS:
        System.out.println("Black suit");
    }
  }

}
