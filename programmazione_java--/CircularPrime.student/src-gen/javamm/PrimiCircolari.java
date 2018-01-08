package javamm;

@SuppressWarnings("all")
public class PrimiCircolari {
  /**
   * Un numero primo e' circolare se ogni sua permutazione circolare
   * e' anche un numero primo. Ad esempio, 113 e' un numero primo
   * circolare in quanto anche 131 e 311 sono numeri primi. Al contrario,
   * 29 non e' circolare in quanto 92 non e' primo. Scrivere un metodo,
   * chiamato circolari, che dato in input un numero intero n, restituisca
   * il numero di numeri primi circolari minori o uguali a n. Ad esempio,
   * con input il numero 100, il metodo deve restituire 13, in quanto
   * i numeri primi circolari minori o uguali a 100 sono 2, 3, 5, 7, 11,
   * 13, 17, 31, 37, 71, 73, 79 e 97. Per definire il metodo si suggerisce
   * di fare uso del metodo del crivello di Eratostene, cosi' definito.
   * Si considerano tutti i numeri interi a partire da 2 fino a n. Poi si
   * "cancellano" tutti i multipli di 2 (escluso 2 stesso). Si prende poi
   * il primo numero non cancellato maggiore di 2 e si ripete l'operazione
   * con i suoi multipli (escluso lui stesso), proseguendo in questo modo
   * fino a che non si applica l'operazione all'ultimo numero non cancellato.
   * I numeri che non sono stati cancellati sono i numeri primi minori o
   * uguali a n.
   */
  public static boolean[] eratostene(int n) {
    boolean[] isPrime = new boolean[(n + 1)];
    for (int i = 2; (i <= n); i++) {
      isPrime[i] = true;
    }
    for (int i = 2; ((i * i) <= n); i++) {
      if (isPrime[i]) {
        for (int j = i; ((i * j) <= n); j++) {
          isPrime[(i * j)] = false;
        }
      }
    }
    return isPrime;
  }
  
  public static int cifre(int n) {
    int r = 0;
    while ((n > 0)) {
      {
        r = (r + 1);
        n = (n / 10);
      }
    }
    return r;
  }
  
  public static int potenza(int e) {
    int r = 1;
    while ((e > 0)) {
      {
        r = (r * 10);
        e = (e - 1);
      }
    }
    return r;
  }
  
  public static int scorri(int n, int d) {
    int q = PrimiCircolari.potenza((d - 1));
    return (((n % q) * 10) + (n / q));
  }
  
  public static boolean verifica(int p, boolean[] e) {
    int d = PrimiCircolari.cifre(p);
    boolean r = e[p];
    int t = PrimiCircolari.scorri(p, d);
    while ((r && (t != p))) {
      {
        r = e[t];
        int _scorri = PrimiCircolari.scorri(t, d);
        t = _scorri;
      }
    }
    return r;
  }
  
  public static int circolari(int n) {
    int _cifre = PrimiCircolari.cifre(n);
    int _plus = (_cifre + 1);
    int _potenza = PrimiCircolari.potenza(_plus);
    boolean[] e = PrimiCircolari.eratostene(_potenza);
    int r = 0;
    for (int i = 2; (i <= n); i++) {
      boolean _verifica = PrimiCircolari.verifica(i, e);
      if (_verifica) {
        r = (r + 1);
      }
    }
    return r;
  }
  
  public static void main(String[] args) {
  }
}
