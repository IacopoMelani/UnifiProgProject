package javamm;

@SuppressWarnings("all")
public class Change {
  public static int change(int[] c, int r) {
    int coin = 0;
    Change.selectionSort(c);
    while ((r != 0)) {
      for (int i = 0; (i < c.length); i++) {
        {
          int[] ris = Change.oneCoinChange(r, c[i]);
          r = ris[0];
          int _plus = (coin + ris[1]);
          coin = _plus;
        }
      }
    }
    return coin;
  }
  
  public static int[] oneCoinChange(int n, int c) {
    int coin = 0;
    while ((n >= c)) {
      {
        n = (n - c);
        coin = (coin + 1);
      }
    }
    return new int[] { n, coin };
  }
  
  public static void selectionSort(int[] a) {
    int indiceProssimoMinimo = 0;
    int min = 0;
    int temp = 0;
    int i = 0;
    int j = 0;
    for (i = 0; (i < (a.length - 1)); i++) {
      {
        min = a[i];
        indiceProssimoMinimo = i;
        for (j = (i + 1); (j < a.length); j++) {
          boolean _greaterThan = (a[j] > min);
          if (_greaterThan) {
            min = a[j];
            indiceProssimoMinimo = j;
          }
        }
        temp = a[i];
        a[i] = a[indiceProssimoMinimo];
        a[indiceProssimoMinimo] = temp;
      }
    }
  }
  
  public static void main(String[] args) {
    int[] a = { 1, 2, 4, 8, 16, 32, 64 };
    int c = Change.change(a, 453);
    System.out.println(c);
  }
}
