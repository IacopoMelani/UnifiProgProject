package javamm;

@SuppressWarnings("all")
public class SopraMedia {
  /**
   * Scrivere un metodo, detto sopraMedia, che
   * dato in input un vettore di interi
   * restituisca il vettore di tutti gli elementi
   * di a maggiori della media degli elementi di a,
   * nello stesso ordine con cui appaiono in a.
   * Ad esempio, con input il vettore {1,6,5,8,6},
   * il metodo deve restituire il vettore {6,8,6},
   * che sono gli elementi di a maggiori di 5.2
   * (che e' la media degli elementi di a).
   */
  public static double media(int[] a) {
    double avg = 0.0;
    for (int i = 0; (i < a.length); i++) {
      double _plus = (avg + a[i]);
      avg = _plus;
    }
    int _length = a.length;
    double _divide = (avg / _length);
    avg = _divide;
    return avg;
  }
  
  public static int sopraValore(int[] a, double v) {
    int nd = 0;
    for (int i = 0; (i < a.length); i++) {
      boolean _greaterThan = (a[i] > v);
      if (_greaterThan) {
        nd = (nd + 1);
      }
    }
    return nd;
  }
  
  public static int[] sopraMedia(int[] a) {
    double avg = SopraMedia.media(a);
    int nd = SopraMedia.sopraValore(a, avg);
    int[] b = new int[nd];
    int i = 0;
    int p = 0;
    while ((i < a.length)) {
      {
        boolean _greaterThan = (a[i] > avg);
        if (_greaterThan) {
          b[p] = a[i];
          p = (p + 1);
        }
        i = (i + 1);
      }
    }
    return b;
  }
  
  public static void main(String[] args) {
    int[] a = { 1, 6, 8, 5, 6 };
    SopraMedia.sopraMedia(a);
  }
}
