package javamm;

@SuppressWarnings("all")
public class OverAverage {
  public static int[] overAverage(int[] a) {
    int av = OverAverage.average(a);
    int[] b = new int[a.length];
    int k = OverAverage.copyOverAverage(a, b, av);
    int[] array = OverAverage.reWriteOverAverageArray(b, k);
    return array;
  }
  
  public static int average(int[] a) {
    int ris = 0;
    for (int i = 0; (i < a.length); i++) {
      int _plus = (a[i] + ris);
      ris = _plus;
    }
    int _length = a.length;
    return (ris / _length);
  }
  
  public static int copyOverAverage(int[] a, int[] b, int av) {
    int k = 0;
    for (int i = 0; (i < a.length); i++) {
      boolean _greaterThan = (a[i] > av);
      if (_greaterThan) {
        b[k] = a[i];
        k = (k + 1);
      }
    }
    return k;
  }
  
  public static int[] reWriteOverAverageArray(int[] a, int k) {
    int[] b = new int[k];
    for (int i = 0; (i < k); i++) {
      b[i] = a[i];
    }
    return b;
  }
  
  public static void printArray(int[] a) {
    for (int i = 0; (i < a.length); i++) {
      System.out.println(a[i]);
    }
  }
  
  public static void main(String[] args) {
    int[] a = { 1, 6, 5, 8, 6 };
    int[] b = OverAverage.overAverage(a);
    OverAverage.printArray(b);
  }
}
