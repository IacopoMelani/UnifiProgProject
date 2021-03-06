package javamm;

@SuppressWarnings("all")
public class ToUpperCase {
  public static char[] upperCase(char[] a) {
    int len = a.length;
    for (int i = 0; (i < len); i++) {
      {
        int charToInt = a[i];
        if ((charToInt >= 97)) {
          charToInt = (charToInt - 32);
        }
        a[i] = ((char) charToInt);
      }
    }
    return a;
  }
  
  public static void printArray(char[] array) {
    int n = array.length;
    for (int i = 0; (i < n); i++) {
      String _plus = (Character.valueOf(array[i]) + " ");
      System.out.print(_plus);
    }
  }
  
  public static void main(String[] args) {
    char[] a = { 'c', 'I', 'a', 'o' };
    ToUpperCase.printArray(ToUpperCase.upperCase(a));
  }
}
