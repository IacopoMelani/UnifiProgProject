package javamm;

@SuppressWarnings("all")
public class StrikeBall {
  /**
   * Dati due numeri interi positivi n e m con lo stesso
   * numero di cifre, si ha uno strike tra n e m per
   * ogni coppia di cifre di n e m che sono uguali e
   * nella stessa posizione, mentre si ha un ball
   * tra n e m per ogni coppia di cifre di n e m che sono
   * uguali ma in posizione diversa. Ad esempio, se
   * n=180712 e m=781104, si ha uno strike in corrispondenza
   * dell'8 e quattro ball in corrispondenza dei due 1,
   * dello 0 e del 7.
   * Scrivere un metodo, chiamato strikeBall, che,
   * dati in input due numeri interi positivi n e m
   * con lo stesso numero di cifre, restituisca un array
   * di due elementi uguali al numero di strike e
   * al numero di ball tra n e m, rispettivamente.
   * Per calcolare il numero di strike e' sufficiente
   * calcolare il numero di cifre uguali in n e in m
   * che appaiono nella stessa posizione.
   * Per calcolare il numero di ball puo' invece
   * essere utile usare due array di 10 elementi che
   * indichino le frequenze delle 10 cifre decimali in
   * n e in m (senza pero' contare gli strike): il numero
   * di ball e' la somma, per i che va da 0 a 9, dei
   * minimi tra i due valori contenuti nei due array
   * in posizione i.
   * 
   * ESEMPI
   * Input: 180712, 781104
   * Output: {1, 4}
   * 
   * Input: 180712, 180712
   * Output: {6, 0}
   * 
   * Input: 180712, 211087
   * Output: {0, 6}
   * 
   * Input: 123321, 456654
   * Output: {0, 0}
   */
  public static int[] strikeBall(int n, int m) {
    int[] strikeBall = { 0, 0 };
    int strike = StrikeBall.strike(n, m);
    int ball = StrikeBall.ball(n, m);
    strikeBall[0] = strike;
    strikeBall[1] = ball;
    return strikeBall;
  }
  
  public static int strike(int n, int m) {
    int strike = 0;
    int restoN = 0;
    int restoM = 0;
    do {
      {
        restoN = (n % 10);
        restoM = (m % 10);
        if ((restoM == restoN)) {
          strike = (strike + 1);
        }
        n = (n / 10);
        m = (m / 10);
      }
    } while((n != 0));
    return strike;
  }
  
  public static int ball(int n, int m) {
    int ball = 0;
    int[] frequencyN = StrikeBall.frequencyBall(n, m);
    int[] frequencyM = StrikeBall.frequencyBall(m, n);
    for (int i = 0; (i < frequencyN.length); i++) {
      int _min = StrikeBall.min(frequencyN[i], frequencyM[i]);
      int _plus = (ball + _min);
      ball = _plus;
    }
    return ball;
  }
  
  public static int[] frequencyBall(int n, int m) {
    int[] f = new int[10];
    int restoN = 0;
    int restoM = 0;
    while ((n != 0)) {
      {
        restoN = (n % 10);
        restoM = (m % 10);
        if ((restoN != restoM)) {
          int _plus = (f[restoN] + 1);
          f[restoN] = _plus;
        }
        n = (n / 10);
        m = (m / 10);
      }
    }
    return f;
  }
  
  public static int min(int n, int m) {
    if ((n < m)) {
      return n;
    } else {
      return m;
    }
  }
  
  public static void main(String[] args) {
    int n = 180712;
    int m = 211087;
    int strike = StrikeBall.strike(n, m);
    int ball = StrikeBall.ball(n, m);
    System.out.println(ball);
  }
}
