package javamm;

@SuppressWarnings("all")
public class ScalarProduct {
  public static int scalarProduct(int[] a, int[] b) {
    int prodotto = 0;
    int n = a.length;
    for (int i = 0; (i < n); i++) {
      int _multiply = (a[i] * b[i]);
      int _plus = (prodotto + _multiply);
      prodotto = _plus;
    }
    return prodotto;
  }
  
  public static void main(String[] args) {
    int[] a = { 3, 4, -2 };
    int[] b = { -1, 5, 3 };
    System.out.println(ScalarProduct.scalarProduct(a, b));
  }
}
