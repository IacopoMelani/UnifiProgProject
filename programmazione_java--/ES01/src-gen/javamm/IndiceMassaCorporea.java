package javamm;

@SuppressWarnings("all")
public class IndiceMassaCorporea {
  public static void main(String[] args) {
    double pesoInLibbre = 200;
    double altezzaInPiedi = 5.10;
    double indiceMassaCorporea = ((pesoInLibbre * 0.53592) / ((altezzaInPiedi * 0.3048) * (altezzaInPiedi * 0.3048)));
    System.out.println(("indice di massa corporea: " + Double.valueOf(indiceMassaCorporea)));
  }
}
