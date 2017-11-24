package javamm;

@SuppressWarnings("all")
public class NoTeenSum {
  public static int noTeenSum(int a, int b, int c) {
    int sum = 0;
    int _fixTeen = NoTeenSum.fixTeen(a);
    int _plus = (sum + _fixTeen);
    int _fixTeen_1 = NoTeenSum.fixTeen(b);
    int _plus_1 = (_plus + _fixTeen_1);
    int _fixTeen_2 = NoTeenSum.fixTeen(c);
    int _plus_2 = (_plus_1 + _fixTeen_2);
    sum = _plus_2;
    return sum;
  }
  
  public static int fixTeen(int n) {
    if (((((n >= 13) && (n <= 19)) && (n != 15)) && (n != 16))) {
      return 0;
    }
    return n;
  }
  
  public static void main(String[] args) {
    System.out.println(NoTeenSum.noTeenSum(2, 1, 15));
  }
}
