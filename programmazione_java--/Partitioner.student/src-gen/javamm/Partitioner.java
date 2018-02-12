package javamm;

@SuppressWarnings("all")
public class Partitioner {
  public static boolean partition(int[] a) {
    boolean c = false;
    int[] b = Partitioner.copyArray(a);
    boolean[] ris = { false };
    Partitioner.genBinary(a, b, b.length, ris);
    boolean _tripleEquals = (Boolean.valueOf(ris[0]) == Boolean.valueOf(true));
    if (_tripleEquals) {
      c = true;
    }
    return c;
  }
  
  public static void genBinary(int[] a, int[] cpa, int b, boolean[] aRis) {
    if ((b == 0)) {
      boolean ris = Partitioner.findPartition(a, cpa);
      if ((Boolean.valueOf(ris) == Boolean.valueOf(true))) {
        aRis[0] = true;
      }
    } else {
      a[(b - 1)] = 0;
      Partitioner.genBinary(a, cpa, (b - 1), aRis);
      a[(b - 1)] = 1;
      Partitioner.genBinary(a, cpa, (b - 1), aRis);
    }
  }
  
  public static boolean findPartition(int[] binary, int[] cpa) {
    boolean ris = false;
    int sum = Partitioner.sumArray(cpa);
    int s = 0;
    if (((sum % 2) == 0)) {
      for (int i = 0; (i < cpa.length); i++) {
        boolean _tripleEquals = (binary[i] == 1);
        if (_tripleEquals) {
          int _plus = (cpa[i] + s);
          s = _plus;
        }
      }
      if ((s == (sum / 2))) {
        ris = true;
      }
      return ris;
    } else {
      return ris;
    }
  }
  
  public static int[] copyArray(int[] a) {
    int[] b = new int[a.length];
    for (int i = 0; (i < a.length); i++) {
      b[i] = a[i];
    }
    return b;
  }
  
  public static int sumArray(int[] a) {
    int sum = 0;
    for (int i = 0; (i < a.length); i++) {
      int _plus = (sum + a[i]);
      sum = _plus;
    }
    return sum;
  }
  
  public static void main(String[] args) {
  }
}