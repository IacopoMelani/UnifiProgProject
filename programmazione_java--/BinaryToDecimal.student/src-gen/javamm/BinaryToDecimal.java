package javamm;

@SuppressWarnings("all")
public class BinaryToDecimal {
  public static long decimal(int[] a) {
    int n = a.length;
    long decimal = 0;
    decimal = 0;
    for (int i = (n - 1); (i >= 0); i--) {
      int _potenza = BinaryToDecimal.potenza(a[i], ((n - 1) - i));
      long _plus = (decimal + _potenza);
      decimal = _plus;
    }
    return decimal;
  }
  
  public static int potenza(int num, int i) {
    int base = 1;
    if (((i == 0) && (num == 1))) {
      return 1;
    }
    for (int k = 0; (k < i); k++) {
      base = (base * 2);
    }
    return (base * num);
  }
  
  public static void main(String[] args) {
    int[] a = { 1, 0, 0, 0, 0, 0, 0, 0 };
    System.out.println(BinaryToDecimal.decimal(a));
  }
}
