package javamm;

@SuppressWarnings("all")
public class Unique {
  /**
   * Scrivere un metodo, chiamato unique,
   * che dato in input un array a di numeri
   * interi positivi (eventualmente vuoto),
   * restituisca l'array (eventualmente vuoto)
   * contenente gli elementi di a che appaiono
   * una sola volta in a stesso, nello stesso ordine
   * con cui essi appaiono in a.
   * 
   * ESEMPI
   * Input: {32,23,12,23,15,32}
   * Output: {12,15}
   * 
   * Input: {127,34,45,56,34,127,23,45,12,56,23}
   * Output: {12}
   * 
   * Input: {20,11,15,41,23}
   * Output: {20,11,15,41,23}
   * 
   * Input: {127,34,45,56,34,127,23,45,12,56,23,12}
   * Output: {}
   * 
   * Input: {}
   * Output: {}
   */
  public static int[] unique(int[] a) {
    int[] unique = new int[a.length];
    int posUnique = 0;
    for (int i = 0; (i < a.length); i++) {
      {
        int n = Unique.findUnique(a, i);
        if ((n != -1)) {
          unique[posUnique] = n;
          posUnique = (posUnique + 1);
        }
      }
    }
    unique = Unique.reWriteArray(unique, posUnique);
    return unique;
  }
  
  public static int findUnique(int[] a, int initialPos) {
    int toFind = a[initialPos];
    int i = 0;
    while ((i < a.length)) {
      {
        if (((a[i] == toFind) && (i != initialPos))) {
          return -1;
        }
        i = (i + 1);
      }
    }
    return toFind;
  }
  
  public static int[] reWriteArray(int[] a, int len) {
    int[] array = new int[len];
    for (int i = 0; (i < len); i++) {
      array[i] = a[i];
    }
    return array;
  }
  
  public static void printArray(int[] a) {
    for (int i = 0; (i < a.length); i++) {
      String _plus = (Integer.valueOf(a[i]) + " ");
      System.out.println(_plus);
    }
  }
  
  public static void main(String[] args) {
    int[] a = { 1, 1, 3, 4, 5, 6 };
    int[] unique = Unique.unique(a);
    Unique.printArray(unique);
  }
}
