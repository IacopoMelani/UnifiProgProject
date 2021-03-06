package javamm;

@SuppressWarnings("all")
public class HarmonicSum {
  /**
   * funzione che calcola le somme armoniche fino a n tali che risultino >= x numero intero
   * la funzione ritorna il numero più piccolo intero n che soddisfa equazione precedente
   */
  public static int harmonicSum(int x) {
    double sum = 0;
    int n = 0;
    while ((sum < x)) {
      {
        n++;
        double _harmonic = HarmonicSum.harmonic(n);
        double _plus = (sum + _harmonic);
        sum = _plus;
      }
    }
    return n;
  }
  
  public static double harmonic(int k) {
    int i = 1;
    double sum = 0;
    while ((i <= k)) {
      {
        sum = (sum + (1.0 / i));
        i++;
      }
    }
    return sum;
  }
  
  public static void main(String[] args) {
    System.out.println(HarmonicSum.harmonicSum(3));
  }
}
