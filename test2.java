public class test2 {
  public static void main(String [] args) {
    String msg = "";
    msg += "Hello ";
    msg += "World!";
    System.out.println(msg);

    int even_sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        even_sum += i;
      } else {
        continue;
      }
    }
    System.out.println(even_sum);
  }
}
