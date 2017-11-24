package javamm;

@SuppressWarnings("all")
public class MakeWall {
  public static boolean isWallDoable(int s, int b, int g) {
    int nb = (g / 5);
    if ((nb > b)) {
      nb = b;
    }
    if ((((nb * 5) + s) >= g)) {
      return true;
    }
    return false;
  }
  
  public static void main(String[] args) {
    System.out.println(MakeWall.isWallDoable(9, 0, 8));
  }
}
