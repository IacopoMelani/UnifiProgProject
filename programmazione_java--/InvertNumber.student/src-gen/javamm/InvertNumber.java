package javamm;

@SuppressWarnings("all")
public class InvertNumber {
  public static int invertNumber(int n) {
    int x = 0;
    while ((n != 0)) {
      {
        x = (x + (n % 10));
        n = (n / 10);
        x = (x * 10);
      }
    }
    return (x / 10);
  }
  
  public static void main(String[] args) {
    System.out.println(InvertNumber.invertNumber(3423));
  }
}
