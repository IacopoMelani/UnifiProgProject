package javamm;

@SuppressWarnings("all")
public class HanoiTower {
  public static void hanoiTower(int n, int s, int d) {
    if ((n > 0)) {
      HanoiTower.hanoiTower((n - 1), s, (6 - (d + s)));
      String _plus = (Integer.valueOf(s) + "=>");
      String _plus_1 = (_plus + Integer.valueOf(d));
      System.out.println(_plus_1);
      HanoiTower.hanoiTower((n - 1), (6 - (d + s)), d);
    }
  }
  
  public static void main(String[] args) {
    HanoiTower.hanoiTower(64, 1, 3);
  }
}
