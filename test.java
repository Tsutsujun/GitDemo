public class test {
  public static void main(String [] args) {
    String msg = "";
    msg += "Hello ";
    msg += "GitHub's ";
    msg += "World!";
    System.out.println(msg);

    int odd_sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 != 0) {
        odd_sum += i;
      } else {
        continue;
      }
    }
    System.out.println(odd_sum);
  }
}
