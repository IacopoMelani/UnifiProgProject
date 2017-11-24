package javamm;

@SuppressWarnings("all")
public class Resto {
  public static void main(String[] args) {
    double n = 11.52;
    int m2 = ((int) (n / 2));
    n = (n % 2);
    int m1 = ((int) (n / 1));
    n = (n % 1);
    int m50 = ((int) (n / 0.5));
    n = (n % 0.5);
    int m20 = ((int) (n / 0.2));
    n = (n % 0.2);
    int m10 = ((int) (n / 0.1));
    n = (n % 0.1);
    int m05 = ((int) (n / 0.05));
    n = (n % 0.05);
    int m02 = ((int) (n / 0.02));
    n = (n % 0.02);
    int m01 = ((int) (n / 0.01));
    String _plus = (Integer.valueOf(m2) + " ");
    String _plus_1 = (_plus + Integer.valueOf(m1));
    String _plus_2 = (_plus_1 + " ");
    String _plus_3 = (_plus_2 + Integer.valueOf(m50));
    String _plus_4 = (_plus_3 + " ");
    String _plus_5 = (_plus_4 + Integer.valueOf(m20));
    String _plus_6 = (_plus_5 + " ");
    String _plus_7 = (_plus_6 + Integer.valueOf(m10));
    String _plus_8 = (_plus_7 + " ");
    String _plus_9 = (_plus_8 + Integer.valueOf(m05));
    String _plus_10 = (_plus_9 + " ");
    String _plus_11 = (_plus_10 + Integer.valueOf(m02));
    String _plus_12 = (_plus_11 + " ");
    String _plus_13 = (_plus_12 + Integer.valueOf(m01));
    System.out.println(_plus_13);
  }
}
