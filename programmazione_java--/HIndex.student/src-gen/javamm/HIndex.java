package javamm;

@SuppressWarnings("all")
public class HIndex {
  /**
   * Dato un array a di n numeri interi non negativi, l'indice H di a
   * e' definito come il massimo valore h, compreso tra 1 ed n, tale
   * l'h-esimo elemento di a in ordine non crescente sia non inferiore
   * ad h. Ad esempio, l'indice H di
   * {2, 0, 3, 5, 6, 5, 4, 3, 2, 0, 1, 7, 0, 9}
   * e' 5, in quanto il quinto elemento in ordine non crescente e' 5
   * (che e' uguale a 5), mentre il sesto elemento in ordine non
   * crescente e' 4 (che e' minore di 6). Analogamente, l'indice H di
   * {23, 1, 3, 14, 6, 15, 4, 13, 2, 10, 1, 17, 20, 19}
   * e' 8, in quanto l'ottavo elemento in ordine non crescente e' 10
   * (che e' maggiore di 8), mentre il nono elemento in ordine non
   * crescente e' 6 (che e' minore di 9). Infine, l'indice H di un
   * array di elementi tutti uguali a 0 e', per convenzione, uguale a 0.
   * Scrivere un metodo, chiamato hIndex, che dato in input un
   * array di numeri interi non negativi, restituisce il suo indice H.
   */
  public static int hIndex(int[] a) {
    int lenA = a.length;
    HIndex.sortArray(a);
    int i = 0;
    int h = 0;
    while (((i < a[i]) && (i < a.length))) {
      i = (i + 1);
    }
    return i;
  }
  
  public static void sortArray(int[] a) {
    int i = 0;
    int j = 0;
    int indexMax = 0;
    int max = 0;
    int temp = 0;
    for (i = 0; (i < (a.length - 1)); i++) {
      {
        max = a[i];
        indexMax = i;
        for (j = (i + 1); (j < a.length); j++) {
          boolean _lessThan = (max < a[j]);
          if (_lessThan) {
            max = a[j];
            indexMax = j;
          }
        }
        temp = a[i];
        a[i] = a[indexMax];
        a[indexMax] = temp;
      }
    }
  }
  
  public static int[] copyArray(int[] a) {
    int lenA = a.length;
    int[] c = new int[lenA];
    for (int i = 0; (i < lenA); i++) {
      c[i] = a[i];
    }
    return c;
  }
  
  public static void printArray(int[] a) {
    int lenA = a.length;
    for (int i = 0; (i < lenA); i++) {
      String _plus = (Integer.valueOf(a[i]) + " ");
      System.out.println(_plus);
    }
  }
  
  public static void main(String[] args) {
    int[] a = { 2, 0, 3, 5, 6, 5, 4, 3, 2, 0, 1, 7, 0, 9 };
    int[] c = HIndex.copyArray(a);
    int h = HIndex.hIndex(c);
    System.out.println(("h-> " + Integer.valueOf(h)));
  }
}
