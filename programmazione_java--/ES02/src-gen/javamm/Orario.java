package javamm;

@SuppressWarnings("all")
public class Orario {
  public static void main(String[] args) {
    long millisecondi = 315576000000L;
    int s = ((int) (millisecondi / 1000.0));
    int seconds = ((int) (s % 60));
    int m = (s / 60);
    int minuts = (m % 60);
    int h = (m / 60);
    int hours = (h % 24);
    int d = (h / 24);
    int days = (d % 365);
    int y = (d / 365);
    System.out.println(((((((((("y: " + Integer.valueOf(y)) + " d: ") + Integer.valueOf(days)) + " h: ") + Integer.valueOf(hours)) + " m: ") + Integer.valueOf(minuts)) + " s: ") + Integer.valueOf(seconds)));
  }
}
