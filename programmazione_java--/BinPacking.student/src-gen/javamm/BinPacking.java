package javamm;

@SuppressWarnings("all")
public class BinPacking {
  public static int ffd(int[] a, int s) {
    int cont = 0;
    BinPacking.selectionSort(a);
    int[] b = BinPacking.createGroup(a);
    BinPacking.putInGroup(a, b, s);
    cont = BinPacking.returnContOfPacking(b);
    return cont;
  }
  
  public static int returnContOfPacking(int[] a) {
    int cont = 0;
    for (int i = 0; (i < a.length); i++) {
      boolean _tripleNotEquals = (a[i] != 0);
      if (_tripleNotEquals) {
        cont = (cont + 1);
      }
    }
    return cont;
  }
  
  public static void putInGroup(int[] a, int[] group, int s) {
    group[0] = a[0];
    a[0] = 0;
    int k = 0;
    for (int i = 0; (i < a.length); i++) {
      for (int j = 0; (j < a.length); j++) {
        int _plus = (group[j] + a[i]);
        boolean _lessEqualsThan = (_plus <= s);
        if (_lessEqualsThan) {
          int _plus_1 = (group[j] + a[i]);
          group[j] = _plus_1;
          a[i] = 0;
          j = a.length;
        }
      }
    }
  }
  
  public static int[] createGroup(int[] a) {
    int[] b = new int[a.length];
    return b;
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
  
  public static void printArray(int[] a) {
    for (int i = 0; (i < a.length); i++) {
      System.out.println(a[i]);
    }
  }
  
  public static void main(String[] args) {
    int[] a = { 4, 1, 2, 5, 3, 2, 3, 6, 3 };
    int s = 6;
    BinPacking.selectionSort(a);
    int[] b = BinPacking.createGroup(a);
    BinPacking.putInGroup(a, b, s);
    System.out.println();
  }
}