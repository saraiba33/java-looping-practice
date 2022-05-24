class App {
  public static void main(String args[]) {
    App.forLoop();
    App.whileLoop();
    App.doWhileLoop();
  }

  private static void forLoop() {
    String message = "Launch!";
    for (int i = 10; i >= 1; i--) {
      System.out.println(i);
    }
    System.out.println(message);
  }

  private static void whileLoop() {
    int index = 0;
    while (index < 5) {
      System.out.println("I love Java");
      index++;
    }
  }

  private static void doWhileLoop() {
    int index = 0;
    do {
      System.out.println("I love Java");
      index++;
    } while (index < 5);
  }
}
