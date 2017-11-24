package javamm;

@SuppressWarnings("all")
public class RoundSum {
  public static int roundSum(int a, int b, int c) {
    int _round = RoundSum.round(a);
    int _round_1 = RoundSum.round(b);
    int _plus = (_round + _round_1);
    int _round_2 = RoundSum.round(c);
    int sum = (_plus + _round_2);
    return sum;
  }
  
  public static int round(int n) {
    if (((n % 10) >= 5)) {
      n = (((n / 10) + 1) * 10);
    } else {
      n = ((n / 10) * 10);
    }
    return n;
  }
  
  public static void main(String[] args) {
    System.out.println(RoundSum.roundSum(12, 13, 14));
  }
}
