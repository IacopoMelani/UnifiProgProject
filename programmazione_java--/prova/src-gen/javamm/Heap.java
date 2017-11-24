package javamm;

@SuppressWarnings("all")
public class Heap {
  /**
   * funzione per creare una coda di priorità
   */
  public static char[] codaPriorita(char[] vettore) {
    int _length = vettore.length;
    int _divide = (_length / 2);
    int n = (_divide - 1);
    for (int k = 0; (k < ((vettore.length / 2) - 1)); k++) {
      for (int i = n; (i > 0); i--) {
        boolean _lessThan = (vettore[i] < vettore[(i * 2)]);
        if (_lessThan) {
          char t = vettore[i];
          vettore[i] = vettore[(i * 2)];
          vettore[(i * 2)] = t;
          boolean _lessThan_1 = (vettore[i] < vettore[((i * 2) + 1)]);
          if (_lessThan_1) {
            t = vettore[i];
            vettore[i] = vettore[((i * 2) + 1)];
            vettore[((i * 2) + 1)] = t;
          }
        } else {
          boolean _lessThan_2 = (vettore[i] < vettore[((i * 2) + 1)]);
          if (_lessThan_2) {
            char t_1 = vettore[i];
            vettore[i] = vettore[((i * 2) + 1)];
            vettore[((i * 2) + 1)] = t_1;
          }
        }
      }
    }
    return vettore;
  }
  
  public static void stampaCoda(char[] vettore) {
    for (int i = 0; (i < vettore.length); i++) {
      System.out.println(vettore[i]);
    }
  }
  
  public static void main(String[] args) {
    char[] vettore = { '.', 'X', 'T', 'O', 'G', 'S', 'M', 'N', 'A', 'E', 'R', 'A', 'I', 'P' };
    char[] nuovoVettore = Heap.codaPriorita(vettore);
    Heap.stampaCoda(nuovoVettore);
  }
}
