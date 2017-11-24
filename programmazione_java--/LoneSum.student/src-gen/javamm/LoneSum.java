package javamm;

@SuppressWarnings("all")
public class LoneSum {
  public static int loneSum(int a, int b, int c) {
    int sum = 0;
    if (((a != b) && (a != c))) {
      sum = (sum + a);
    }
    if (((b != a) && (b != c))) {
      sum = (sum + b);
    }
    if (((c != a) && (c != b))) {
      sum = (sum + c);
    }
    return sum;
  }
  
  public static void main(String[] args) {
  }
}
