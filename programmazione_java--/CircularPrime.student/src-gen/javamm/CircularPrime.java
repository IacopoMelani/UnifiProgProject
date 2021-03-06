package javamm;

@SuppressWarnings("all")
public class CircularPrime {
  /**
   * Un numero positivo n e' primo se e' maggiore di 1 e se e' divisibile
   * solo per 1 e per se stesso. Un numero primo e' circolare se ogni sua
   * permutazione circolare e' anche un numero primo. Ad esempio, 113 e'
   * un numero primo circolare in quanto anche 131 e 311 sono numeri primi.
   * Al contrario, 29 non e' circolare in quanto 92 non e' primo. Osserviamo
   * che un numero primo che contiene lo 0 tra le sue cifre non puo' essere un
   * numero primo circolare: ad esempio, il numero primo 101 ha la permutazione
   * circolare 110 che, chiaramente, non è un numero primo. Scrivere un metodo,
   * chiamato circularPrime, che dato in input un numero intero n positivo,
   * restituisca il numero di numeri primi circolari minori o uguali a n.
   * Per definire il metodo si suggerisce di fare uso del metodo del crivello
   * di Eratostene, cosi' definito. Si considerano tutti i numeri interi a
   * partire da 2 fino a n. Poi si "cancellano" tutti i multipli di 2
   * (escluso 2 stesso). Si prende poi il primo numero non cancellato maggiore
   * di 2 e si ripete l'operazione con i suoi multipli (escluso lui stesso),
   * proseguendo in questo modo fino a che non si applica l'operazione
   * all'ultimo numero non cancellato. I numeri che non sono stati cancellati
   * sono i numeri primi minori o uguali a n.
   * 
   * ESEMPI
   * Input: 100
   * Output: 13
   * 
   * Input: 200
   * Output: 17
   * 
   * Input: 300
   * Output: 17
   * 
   * Input: 400
   * Output: 20
   */
  public static int circularPrime(int n) {
    int[] v = CircularPrime.createVectorNumber(n);
    CircularPrime.deleteZeroFiveEvenDigit(v);
    CircularPrime.deleteMultiples(v);
    CircularPrime.deleteNoCircularPrime(v);
    int cont = 0;
    for (int i = 1; (i < n); i++) {
      boolean _tripleNotEquals = (v[i] != 0);
      if (_tripleNotEquals) {
        cont = (cont + 1);
      }
    }
    System.out.println();
    return (cont - 1);
  }
  
  public static int[] createVectorNumber(int n) {
    int digit = CircularPrime.contDigitNumber(n);
    int[] vectorN = new int[CircularPrime.powOfTen(digit)];
    for (int i = 0; (i < vectorN.length); i++) {
      vectorN[i] = i;
    }
    return vectorN;
  }
  
  public static void deleteZeroFiveEvenDigit(int[] v) {
    boolean zeroFive = false;
    boolean even = false;
    for (int i = 0; (i < v.length); i++) {
      {
        zeroFive = CircularPrime.deleteZeroFiveDigit(v[i]);
        even = CircularPrime.deleteEvenDigit(v[i]);
        if (((Boolean.valueOf(zeroFive) == Boolean.valueOf(true)) || (Boolean.valueOf(even) == Boolean.valueOf(true)))) {
          v[i] = 0;
        }
      }
    }
  }
  
  public static int contDigitNumber(int number) {
    int digit = 0;
    while ((number != 0)) {
      {
        digit = (digit + 1);
        number = (number / 10);
      }
    }
    return digit;
  }
  
  public static int powOfTen(int n) {
    int pow = 1;
    for (int i = 0; (i < n); i++) {
      pow = (pow * 10);
    }
    return pow;
  }
  
  public static boolean deleteEvenDigit(int n) {
    if ((n == 2)) {
      return false;
    }
    int resto = 0;
    while ((n != 0)) {
      {
        resto = (n % 10);
        n = (n / 10);
        if (((resto % 2) == 0)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean deleteZeroFiveDigit(int n) {
    if ((n == 5)) {
      return false;
    }
    int resto = 0;
    while ((n != 0)) {
      {
        resto = (n % 10);
        n = (n / 10);
        if (((resto == 0) || (resto == 5))) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean prime(int n) {
    for (int i = 2; (i < n); i++) {
      if (((n % i) == 0)) {
        return false;
      }
    }
    return true;
  }
  
  public static void deleteMultiples(int[] v) {
    int ris = 0;
    int perm = 0;
    for (int i = 2; (i < v.length); i++) {
      boolean _tripleNotEquals = (v[i] != 0);
      if (_tripleNotEquals) {
        int k = 2;
        while (((v[i] * k) < (v.length - 1))) {
          {
            int _multiply = (v[i] * k);
            ris = _multiply;
            perm = ris;
            int _length = v.length;
            int _minus = (_length - 1);
            boolean _lessThan = (ris < _minus);
            if (_lessThan) {
              v[ris] = 0;
            }
            k = (k + 1);
          }
        }
      }
    }
  }
  
  public static void deleteNoCircularPrime(int[] v) {
    for (int i = 0; (i < v.length); i++) {
      {
        int n = v[i];
        int cont = 0;
        int perm = n;
        do {
          {
            perm = CircularPrime.permutation(perm);
            boolean _prime = CircularPrime.prime(perm);
            boolean _tripleEquals = (Boolean.valueOf(_prime) == Boolean.valueOf(false));
            if (_tripleEquals) {
              v[i] = 0;
            }
            cont = (cont + 1);
          }
        } while((cont < CircularPrime.contDigitNumber(n)));
      }
    }
  }
  
  public static int permutation(int n) {
    int _contDigitNumber = CircularPrime.contDigitNumber(n);
    int digits = (_contDigitNumber - 1);
    int _powOfTen = CircularPrime.powOfTen(digits);
    int _modulo = (n % _powOfTen);
    int _multiply = (_modulo * 10);
    int _powOfTen_1 = CircularPrime.powOfTen(digits);
    int _divide = (n / _powOfTen_1);
    int p = (_multiply + _divide);
    return p;
  }
  
  public static int factorial(int n) {
    int ris = 1;
    for (int i = 1; (i <= n); i++) {
      ris = (ris * i);
    }
    return ris;
  }
  
  public static void printArray(int[] v) {
    for (int i = 0; (i < v.length); i++) {
      String _plus = (Integer.valueOf(v[i]) + " ");
      System.out.println(_plus);
    }
  }
  
  public static void main(String[] args) {
    int[] v = CircularPrime.createVectorNumber(300);
    CircularPrime.deleteZeroFiveEvenDigit(v);
    CircularPrime.deleteMultiples(v);
    CircularPrime.deleteNoCircularPrime(v);
    CircularPrime.printArray(v);
  }
}
