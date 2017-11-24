package javamm;

@SuppressWarnings("all")
public class GcdEuclidean {
  public static long gcdEuclidean(long a, long b) {
    if ((a > b)) {
      while ((b != 0)) {
        {
          long r = (a % b);
          a = b;
          b = r;
        }
      }
      return a;
    } else {
      while ((a != 0)) {
        {
          long r = (b % a);
          b = a;
          a = r;
        }
      }
      return b;
    }
  }
  
  public static void main(String[] args) {
    long a = 72;
    long b = 108;
    System.out.println(GcdEuclidean.gcdEuclidean(a, b));
  }
}
