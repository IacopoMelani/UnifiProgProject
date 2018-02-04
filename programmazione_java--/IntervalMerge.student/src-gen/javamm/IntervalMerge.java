package javamm;

@SuppressWarnings("all")
public class IntervalMerge {
  public static int[][] intervalMerge(int[][] m) {
    int[][] r = new int[m.length][2];
    int k = IntervalMerge.putMerge(m, r);
    int[][] matrix = IntervalMerge.compact(r, k);
    return matrix;
  }
  
  public static int putMerge(int[][] m, int[][] r) {
    int k = 0;
    r[k] = new int[] { m[0][0], m[0][1] };
    for (int i = 1; (i < m.length); i++) {
      boolean _isInterval = IntervalMerge.isInterval(r[k], m[i]);
      if (_isInterval) {
        r[k] = IntervalMerge.merge(r[k], m[i]);
      } else {
        k = (k + 1);
        r[k] = new int[] { m[i][0], m[i][1] };
      }
    }
    return k;
  }
  
  public static boolean isInterval(int[] a, int[] b) {
    boolean ris = false;
    if (((a[0] <= b[0]) && (b[0] <= a[1]))) {
      ris = true;
    }
    return ris;
  }
  
  public static int[] merge(int[] a, int[] b) {
    int[] i = new int[2];
    i[0] = a[0];
    boolean _greaterThan = (b[1] > a[1]);
    if (_greaterThan) {
      i[1] = b[1];
    } else {
      i[1] = a[1];
    }
    return i;
  }
  
  public static int[][] compact(int[][] m, int k) {
    int[][] r = new int[(k + 1)][2];
    for (int i = 0; (i < (k + 1)); i++) {
      {
        r[i][0] = m[i][0];
        r[i][1] = m[i][1];
      }
    }
    return r;
  }
  
  public static void main(String[] args) {
    int[][] m = { new int[] { 3, 8 }, new int[] { 5, 18 }, new int[] { 9, 9 }, new int[] { 15, 19 }, new int[] { 19, 19 } };
    int[][] r = IntervalMerge.intervalMerge(m);
    System.out.println();
  }
}
