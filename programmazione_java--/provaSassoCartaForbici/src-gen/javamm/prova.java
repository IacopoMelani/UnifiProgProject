package javamm;

@SuppressWarnings("all")
public class prova {
  /**
   * sasso 0
   * forbici 1
   * carta 2
   */
  public static int vincitore(int segno1, int segno2) {
    if ((segno2 == ((segno1 + 1) % 3))) {
      return 1;
    }
    if ((segno1 == ((segno2 + 1) % 3))) {
      return 2;
    }
    return 0;
  }
  
  public static void main(String[] args) {
    System.out.println(prova.vincitore(1, 2));
  }
}
