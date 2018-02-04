package javamm;

@SuppressWarnings("all")
public class Fusione {
  /**
   * Dati 2 intervalli chiusi [a,b] e [c,d] che
   * si sovrappongono (ovvero tali che a<=c<=b),
   * la loro fusione consiste dell'intervallo [a,max(b,d)].
   * Dati n intervalli chiusi, specificati dai due estremi
   * sinistro e destro e ordinati in modo non decrescente
   * rispetto agli estremi sinistri, la fusione di questi
   * intervalli consiste nel fondere tutti gli intervalli
   * che si sovrappongono. Ad esempio, la fusione degli
   * intervalli [1, 3],[2, 6],[8, 10] e [15, 18] restituisce
   * gli intervalli [1,6],[8,10] e [15,18] , la fusione degli
   * intervalli [1, 3],[2, 4],[5, 7] e [6, 8] restituisce gli
   * intervalli [1,4] e [5,8], e la fusione degli intervalli
   * [3, 6],[5, 7],[6, 12],[10, 12],[11, 16] restituisce
   * l'intervallo [3,16]. Scrivere un metodo, chiamato fondi,
   * che data un input una matrice di interi positivi di
   * dimensione nx2, rappresentante n intervalli chiusi ordinati
   * in modo non decrescente rispetto alla prima colonna,
   * restituisca la matrice degli intervalli ottenuti dalla
   * fusione degli n intervalli. Ad esempio, con input la matrice
   * {{1, 3}, {2, 6}, {8, 10}, {15, 18}}, il metodo deve
   * restituire la matrice {{1, 6}, {8, 10}, {15, 18}}, con input
   * la matrice {{1, 3}, {2, 4}, {5, 7}, {6, 8}}, il metodo deve
   * restituire la matrice {{1, 4}, {5, 8}}, e con input la matrice
   * {{3, 6}, {5, 7}, {6, 12}, {10, 12}, {11, 16}} il metodo deve
   * restituire la matrice {{3, 16}}.
   */
  public static int[][] compact(int[][] m, int n) {
    int[][] r = new int[n][2];
    for (int i = 0; (i < n); i++) {
      r[i] = m[i];
    }
    return r;
  }
  
  public static boolean merge(int[] a, int[] b) {
    boolean rst = false;
    boolean _lessEqualsThan = (b[0] <= a[1]);
    if (_lessEqualsThan) {
      boolean _greaterThan = (b[1] > a[1]);
      if (_greaterThan) {
        a[1] = b[1];
      }
      rst = true;
    }
    return rst;
  }
  
  public static int[][] fondi(int[][] m) {
    int[][] r = new int[m.length][2];
    int currIndex = 0;
    int[] curr = m[0];
    int j = 1;
    while ((j < m.length)) {
      {
        boolean _merge = Fusione.merge(curr, m[j]);
        boolean _not = (!_merge);
        if (_not) {
          r[currIndex++] = curr;
          curr = m[j];
        }
        j = (j + 1);
      }
    }
    r[currIndex] = curr;
    return Fusione.compact(r, (currIndex + 1));
  }
  
  public static void main(String[] args) {
  }
}
