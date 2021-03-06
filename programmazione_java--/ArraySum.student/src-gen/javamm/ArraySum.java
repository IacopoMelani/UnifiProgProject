package javamm;

@SuppressWarnings("all")
public class ArraySum {
  public static int[] arraySum(int[] a, int[] b) {
    int n = a.length;
    int[] c = new int[n];
    for (int i = 0; (i < n); i++) {
      int _plus = (a[i] + b[i]);
      c[i] = _plus;
    }
    return c;
  }
  
  public static void printArray(int[] array) {
    int n = array.length;
    for (int i = 0; (i < n); i++) {
      String _plus = (Integer.valueOf(array[i]) + " ");
      System.out.print(_plus);
    }
  }
  
  public static void main(String[] args) {
    int[] a = { 3, 4, -2 };
    int[] b = { -1, 5, 3 };
    ArraySum.printArray(ArraySum.arraySum(a, b));
  }
}
