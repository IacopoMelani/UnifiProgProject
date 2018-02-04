package javamm;

@SuppressWarnings("all")
public class SelectionSort {
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
          boolean _lessThan = (a[j] < min);
          if (_lessThan) {
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
  
  public static void stampaArray(int[] a) {
    int len = a.length;
    for (int i = 0; (i < len); i++) {
      String _plus = (Integer.valueOf(a[i]) + " ");
      System.out.println(_plus);
    }
  }
  
  public static void main(String[] args) {
    int[] a = { 56, 43, 2, 78, 3, 11, 89, 4, 1, 101, 100 };
  }
}
