package javamm;

@SuppressWarnings("all")
public class ConversioneGradi {
  public static void main(String[] args) {
    int celsius = 25;
    int fahrenheit = (((9 / 5) * celsius) + 32);
    System.out.println(("celsius: " + Integer.valueOf(celsius)));
    System.out.println(("fahrenheit: " + Integer.valueOf(fahrenheit)));
  }
}
