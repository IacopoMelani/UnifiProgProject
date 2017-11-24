package javamm;

@SuppressWarnings("all")
public class CapitaliInteressi {
  public static void main(String[] args) {
    double x = 0;
    double r = 0.10;
    if ((x != 0)) {
      double rSeiMesi = ((r * 6) / 12);
      double capitale = (((rSeiMesi * 200) * 6) + x);
      System.out.println(("capitale dopo 6 mesi: " + Double.valueOf(capitale)));
    } else {
      System.out.println(("capitale dopo 6 mesi: " + Double.valueOf(x)));
    }
  }
}
