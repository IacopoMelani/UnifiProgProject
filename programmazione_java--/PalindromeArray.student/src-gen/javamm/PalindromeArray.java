package javamm;

@SuppressWarnings("all")
public class PalindromeArray {
  public static boolean palindrome(int[] a) {
    int len = a.length;
    int top = (len - 1);
    for (int down = 0; (down < len); down++) {
      {
        boolean _tripleNotEquals = (a[down] != a[top]);
        if (_tripleNotEquals) {
          return false;
        }
        top--;
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
    int[] a = { 3, 8, 1, 8, 3 };
    System.out.println(PalindromeArray.palindrome(a));
  }
}
