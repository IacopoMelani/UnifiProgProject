package javamm;

@SuppressWarnings("all")
public class EvenlySpaced {
  public static boolean evenlySpaced(int a, int b, int c) {
    int _max = EvenlySpaced.max(a, b, c);
    int _mid = EvenlySpaced.mid(a, b, c);
    int _minus = (_max - _mid);
    int _mid_1 = EvenlySpaced.mid(a, b, c);
    int _min = EvenlySpaced.min(a, b, c);
    int _minus_1 = (_mid_1 - _min);
    boolean _tripleEquals = (_minus == _minus_1);
    if (_tripleEquals) {
      return true;
    }
    return false;
  }
  
  public static int max(int a, int b, int c) {
    if (((a >= b) && (a >= c))) {
      return a;
    }
    if (((b >= a) && (b >= c))) {
      return b;
    }
    if (((c >= a) && (c >= b))) {
      return c;
    }
    return 0;
  }
  
  public static int mid(int a, int b, int c) {
    if ((((a <= b) && (a >= c)) || ((a <= c) && (a >= b)))) {
      return a;
    }
    if ((((b <= a) && (b >= c)) || ((b <= c) && (b >= a)))) {
      return b;
    }
    if ((((c <= a) && (c >= b)) || ((c <= b) && (c >= a)))) {
      return c;
    }
    return 0;
  }
  
  public static int min(int a, int b, int c) {
    if (((a <= b) && (a <= c))) {
      return a;
    }
    if (((b <= a) && (b <= c))) {
      return b;
    }
    if (((c <= a) && (c <= b))) {
      return c;
    }
    return 0;
  }
  
  public static void main(String[] args) {
    System.out.println(EvenlySpaced.evenlySpaced(5, 7, 3));
  }
}
