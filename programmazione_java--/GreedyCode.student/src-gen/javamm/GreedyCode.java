package javamm;

@SuppressWarnings("all")
public class GreedyCode {
  public static char[] greedyCode(long n) {
    char[] c = new char[10];
    long[][] f = GreedyCode.frequences(n);
    GreedyCode.sortFrequencesMatrix(f);
    GreedyCode.sortIndexFMatrix(f);
    c = GreedyCode.createCodex(f);
    return c;
  }
  
  public static char[] createCodex(long[][] f) {
    char[] c = new char[10];
    char l = 97;
    for (int i = 0; (i < c.length); i++) {
      {
        c[((int) f[0][i])] = l;
        l++;
      }
    }
    return c;
  }
  
  public static long[][] frequences(long a) {
    long[][] f = new long[2][10];
    int r = 0;
    for (int q = 0; (q < 10); q++) {
      f[0][q] = q;
    }
    while ((a != 0)) {
      {
        r = ((int) (a % 10));
        long _plus = (f[1][r] + 1);
        f[1][r] = _plus;
        a = (a / 10);
      }
    }
    return f;
  }
  
  public static void sortFrequencesMatrix(long[][] a) {
    long min = 0;
    long temp0 = 0;
    long temp1 = 0;
    int i = 0;
    int j = 0;
    int indiceProssimoMinimo = 0;
    for (i = 0; (i < (a[1].length - 1)); i++) {
      {
        min = a[1][i];
        indiceProssimoMinimo = i;
        for (j = (i + 1); (j < a[1].length); j++) {
          boolean _greaterEqualsThan = (a[1][j] >= min);
          if (_greaterEqualsThan) {
            min = a[1][j];
            indiceProssimoMinimo = j;
          }
        }
        GreedyCode.swap(a, i, indiceProssimoMinimo);
      }
    }
  }
  
  public static void sortIndexFMatrix(long[][] a) {
    long min = 0;
    long temp0 = 0;
    long temp1 = 0;
    int indiceProssimoMinimo = 0;
    int i = 0;
    int j = 0;
    for (i = 0; (i < (a[1].length - 1)); i++) {
      {
        min = a[0][i];
        indiceProssimoMinimo = i;
        for (j = (i + 1); (j < a[1].length); j++) {
          if (((a[0][j] < min) && (a[1][j] == a[1][indiceProssimoMinimo]))) {
            min = a[0][j];
            indiceProssimoMinimo = j;
          }
        }
        GreedyCode.swap(a, i, indiceProssimoMinimo);
      }
    }
  }
  
  public static void swap(long[][] a, int x, int y) {
    long temp0 = 0;
    long temp1 = 0;
    temp0 = a[0][x];
    temp1 = a[1][x];
    a[0][x] = a[0][y];
    a[1][x] = a[1][y];
    a[0][y] = temp0;
    a[1][y] = temp1;
  }
  
  public static void main(String[] args) {
  }
}
