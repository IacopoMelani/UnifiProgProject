package javamm;

@SuppressWarnings("all")
public class DuplicateDigit {
  public static long duplicateDigit(int n) {
    int oldNumber = n;
    long newNumber = 0;
    long temp = 0;
    while ((n != 0)) {
      {
        temp = (n % 10);
        n = (n / 10);
        temp = ((temp * 10) + temp);
        newNumber = ((newNumber * 100) + temp);
      }
    }
    return DuplicateDigit.zeroCont(DuplicateDigit.invertNumber(newNumber), oldNumber);
  }
  
  public static long invertNumber(long n) {
    long x = 0;
    while ((n != 0)) {
      {
        x = (x + (n % 10));
        n = (n / 10);
        x = (x * 10);
      }
    }
    return (x / 10);
  }
  
  public static long zeroCont(long newNumber, int n) {
    if (((n % 10) != 0)) {
      return newNumber;
    } else {
      return DuplicateDigit.zeroCont((newNumber * 100), (n / 10));
    }
  }
  
  public static void main(String[] args) {
    System.out.println(DuplicateDigit.duplicateDigit(666007600));
  }
}
