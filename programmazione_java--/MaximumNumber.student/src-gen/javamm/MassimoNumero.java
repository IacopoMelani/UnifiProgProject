package javamm;

@SuppressWarnings("all")
public class MassimoNumero {
  /**
   * Definire un metodo, chiamato massimoNumero, che,
   * dato in input un array a di n cifre decimali positive
   * e un numero k positivo minore o uguale di n, restituisca
   * il massimo numero intero di k cifre prese dall'array a
   * nell'ordine in cui esse appaiono in a. Ad esempio,
   * se a = {7, 4, 2, 9, 3, 5, 8, 1, 7, 5}, allora il metodo
   * deve restituire i seguenti valori a seconda del valore
   * di k.
   * 
   * - k=1: 9
   * - k=2: 98
   * - k=3: 987
   * - k=4: 9875
   * - k=5: 98175
   * - k=6: 958175
   * - k=7: 9358175
   * - k=8: 79358175
   * - k=9: 749358175
   * - k=10: 7429358175
   */
  public static int cerca(int[] a, int s, int d) {
    int _length = a.length;
    int _minus = (_length - 1);
    int e = (_minus - d);
    int m = a[s];
    int im = s;
    for (int i = (s + 1); (i <= e); i++) {
      boolean _greaterThan = (a[i] > m);
      if (_greaterThan) {
        m = a[i];
        im = i;
      }
    }
    return im;
  }
  
  public static long massimoNumero(int[] a, int k) {
    long r = 0;
    int p = 0;
    for (int i = 1; (i <= k); i++) {
      {
        int _cerca = MassimoNumero.cerca(a, p, (k - i));
        p = _cerca;
        long _plus = ((r * 10) + a[p++]);
        r = _plus;
      }
    }
    return r;
  }
  
  public static void main(String[] args) {
    int[] a = { 7, 4, 2, 9, 3, 5, 8, 1, 7, 5 };
    int k = 8;
    long _massimoNumero = MassimoNumero.massimoNumero(a, k);
    System.out.println(_massimoNumero);
  }
}
