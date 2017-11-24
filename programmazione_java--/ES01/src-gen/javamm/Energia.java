package javamm;

@SuppressWarnings("all")
public class Energia {
  public static void main(String[] args) {
    double water = 10;
    double tempIniziale = 20;
    double tempFinale = 50;
    double energia = ((4184 * water) * (tempFinale - tempIniziale));
    System.out.println(("energia: " + Double.valueOf(energia)));
  }
}
