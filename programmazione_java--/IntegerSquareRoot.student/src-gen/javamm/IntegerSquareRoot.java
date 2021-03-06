package javamm;

@SuppressWarnings("all")
public class IntegerSquareRoot {
  public static int integerSquareRoot(int n) {
    int x = n;
    do {
      x--;
    } while((x > (n / x)));
    return x;
  }
  
  public static void main(String[] args) {
    System.out.println(IntegerSquareRoot.integerSquareRoot(2));
  }
}
