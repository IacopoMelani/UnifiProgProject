package javamm;

@SuppressWarnings("all")
public class StrangePartitioner {
  public static boolean strangePartition(int[] a) {
    boolean ris = false;
    int[] b = StrangePartitioner.copyArray(a);
    boolean[] c = { false };
    StrangePartitioner.genBinary(a, b, a.length, c);
    ris = c[0];
    return ris;
  }
  
  public static void genBinary(int[] a, int[] cpA, int b, boolean[] c) {
    if ((b == 0)) {
      if ((StrangePartitioner.multipleOfTen(StrangePartitioner.sumArray(cpA, a, 1)) && StrangePartitioner.odd(StrangePartitioner.sumArray(cpA, a, 0)))) {
        c[0] = true;
      }
    } else {
      a[(b - 1)] = 0;
      StrangePartitioner.genBinary(a, cpA, (b - 1), c);
      a[(b - 1)] = 1;
      StrangePartitioner.genBinary(a, cpA, (b - 1), c);
    }
  }
  
  public static boolean odd(int n) {
    boolean ris = false;
    ris = ((n % 2) != 0);
    return ris;
  }
  
  public static boolean multipleOfTen(int n) {
    boolean ris = false;
    ris = ((n % 10) == 0);
    return ris;
  }
  
  public static int sumArray(int[] a, int[] binary, int c) {
    int sum = 0;
    for (int i = 0; (i < a.length); i++) {
      boolean _tripleEquals = (binary[i] == c);
      if (_tripleEquals) {
        int _plus = (sum + a[i]);
        sum = _plus;
      }
    }
    return sum;
  }
  
  public static int[] copyArray(int[] a) {
    int[] b = new int[a.length];
    for (int i = 0; (i < a.length); i++) {
      b[i] = a[i];
    }
    return b;
  }
  
  public static void main(String[] args) {
  }
}
