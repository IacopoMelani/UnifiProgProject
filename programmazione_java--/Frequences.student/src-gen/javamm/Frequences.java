package javamm;

@SuppressWarnings("all")
public class Frequences {
  /**
   * Scrivere un metodo, detto frequences, che, dato
   * in input un array a di numeri interi non vuoto,
   * restituisca l'array delle frequenze degli
   * elementi distinti di a, in ordine crescente
   * dei valori degli elementi. Ad esempio, con
   * input il vettore {1,6,5,8,6,6,8,5,3,1,6,8},
   * il metodo deve restituire l'array {2,1,2,4,3},
   * in quanto il valore 1 appare due volte, il 3
   * una volta, il 5 due volte, il 6 quattro volte
   * e l'8 tre volte. L'array in input non deve essere
   * modificato dall'esecuzione del metodo.
   * 
   * ESEMPI
   * Input: {1,6,5,8,6,6,8,5,3,1,6,8}
   * Output: {2,1,2,4,3}
   * 
   * Input: {6,6,6,6}
   * Output: {4}
   * 
   * Input: {3,5,6,2}
   * Output: {1,1,1,1}
   */
  public static int[] frequences(int[] a) {
    int[] b = Frequences.copyArray(a);
    int[] f = Frequences.createFrequences(b);
    int[] nf = Frequences.reWriteFrequences(f);
    return nf;
  }
  
  public static int[] copyArray(int[] a) {
    int[] b = new int[a.length];
    for (int i = 0; (i < a.length); i++) {
      b[i] = a[i];
    }
    return b;
  }
  
  public static int[] createFrequences(int[] a) {
    int[] f = new int[(Frequences.max(a) + 1)];
    for (int i = 0; (i < a.length); i++) {
      int _plus = (f[a[i]] + 1);
      f[a[i]] = _plus;
    }
    return f;
  }
  
  public static int contZero(int[] a) {
    int cont = 0;
    for (int i = 0; (i < a.length); i++) {
      boolean _tripleEquals = (a[i] == 0);
      if (_tripleEquals) {
        cont = (cont + 1);
      }
    }
    return cont;
  }
  
  public static int[] reWriteFrequences(int[] f) {
    int zero = Frequences.contZero(f);
    int[] nF = new int[(f.length - zero)];
    int i = 0;
    int k = 0;
    while ((i < f.length)) {
      {
        boolean _tripleNotEquals = (f[i] != 0);
        if (_tripleNotEquals) {
          nF[k] = f[i];
          k = (k + 1);
        }
        i = (i + 1);
      }
    }
    return nF;
  }
  
  public static int max(int[] a) {
    int max = 0;
    for (int i = 0; (i < a.length); i++) {
      boolean _greaterThan = (a[i] > max);
      if (_greaterThan) {
        max = a[i];
      }
    }
    return max;
  }
  
  public static void printArray(int[] a) {
    for (int i = 0; (i < a.length); i++) {
      System.out.println(a[i]);
    }
  }
  
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6 };
    int[] b = Frequences.copyArray(a);
    Frequences.printArray(b);
  }
}
