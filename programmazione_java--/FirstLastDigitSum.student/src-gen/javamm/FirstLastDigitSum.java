package javamm;

@SuppressWarnings("all")
public class FirstLastDigitSum {
  public static int firstLastDigitSum(int n) {
    int lastDigit = (n % 10);
    int firstDigit = 0;
    while ((n != 0)) {
      {
        firstDigit = n;
        n = (n / 10);
      }
    }
    return (firstDigit + lastDigit);
  }
  
  public static void main(String[] args) {
  }
}
