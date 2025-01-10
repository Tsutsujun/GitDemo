public class test2 {
  public static void main(String [] args) {
    String msg = "";
    msg += "Hello ";
    msg += "World!";
    System.out.println(msg);

    int odd_sum = 0;
    int even_sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        even_sum += i;
      } else {
        odd_sum += i;
      }
    }
    System.out.println("The sum of odd numbers is " + odd_sum);
    System.out.println("The sum of even numbers is " + even_sum);
  }
}
