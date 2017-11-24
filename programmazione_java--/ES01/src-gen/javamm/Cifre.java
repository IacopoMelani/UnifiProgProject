package javamm;

@SuppressWarnings("all")
public class Cifre {
  public static void main(String[] args) {
    int num = 000;
    int first = (num / 100);
    int second = ((num % 100) / 10);
    int third = (num % 10);
    int somma = ((first + second) + third);
    System.out.println(("somma: " + Integer.valueOf(somma)));
  }
}
