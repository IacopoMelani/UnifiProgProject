package javamm;

@SuppressWarnings("all")
public class SpiralMatrix {
  /**
   * Dato un numero n>0, la matrice a spirale
   * corrispondente a n e' la matrice nxn, contenente
   * i numeri interi da 1 a n*n inseriti nella
   * matrice secondo un percorso a spirale che,
   * partendo dall'elemento in alto a sinistra,
   * procede prima a destra, poi in basso, poi
   * a sinistra e poi in alto. Ad esempio, la
   * matrice a spirale corrispondente al numero 3
   * e' la matrice
   * 
   *  1  2  3
   *  8  9  4
   *  7  6  5
   * 
   * mentre quella corrispondente al numero 4 e'
   * la matrice
   * 
   *  1  2  3  4
   * 12 13 14  5
   * 11 16 15  6
   * 10  9  8  7
   * 
   * e quella corrispondente al numero 5 e'
   * la matrice
   * 
   *  1  2  3  4  5
   * 16 17 18 19  6
   * 15 24 25 20  7
   * 14 23 22 21  8
   * 13 12 11 10  9
   * 
   * Scrivere un metodo, chiamato spiralMatrix,
   * che, dato in input un numero positivo n e
   * un numero x compreso tra 1 e n*n, restituisca
   * un array di due elementi corrispondenti alla
   * riga e alla colonna della posizione in cui
   * si trova x all'interno della matrice a spirale
   * corrispondente a n.
   * 
   * ESEMPI
   * Input: 3, 6
   * Output: {2,1}
   * 
   * Input: 3, 9
   * Output: {1,1}
   * 
   * Input: 4, 1
   * Output: {0,0}
   * 
   * Input: 4, 12
   * Output: {1,0}
   * 
   * Input: 4, 15
   * Output: {2,2}
   * 
   * SUGGERIMENTO: puo' convenire costruire prima la matrice
   * a spirale e cercare poi nella matrice la posizione
   * del valore x. Poiche' i numeri che appaiono nella
   * matrice a spirale sono positivi, si puo' usare lo
   * 0 come indicatore che una posizione della matrice
   * non e' ancora stata occupata. Quindi, la costruzione
   * della matrice puo' essere effettuata muovendosi
   * in ciascuna direzione fintanto che si incontrano 0 e
   * fintanto che non si fuoriesce dalla matrice.
   */
  public static int[] spiralMatrix(int n, int x) {
    int[][] matrix = SpiralMatrix.createSpiralMatrix(n);
    for (int riga = 0; (riga < n); riga++) {
      for (int col = 0; (col < n); col++) {
        boolean _tripleEquals = (matrix[riga][col] == x);
        if (_tripleEquals) {
          return new int[] { riga, col };
        }
      }
    }
    return null;
  }
  
  public static int[][] createSpiralMatrix(int n) {
    int[][] matrix = new int[n][n];
    int x = -1;
    int y = 0;
    int num = 0;
    int numMatrix = 0;
    int[] ris = {};
    while (true) {
      {
        num = numMatrix;
        ris = SpiralMatrix.right(matrix, (num + 1), (x + 1), y, n);
        x = ris[0];
        y = ris[1];
        numMatrix = ris[2];
        if (((n * n) == numMatrix)) {
          break;
        }
        num = numMatrix;
        ris = SpiralMatrix.down(matrix, (num + 1), x, (y + 1), n);
        x = ris[0];
        y = ris[1];
        numMatrix = ris[2];
        if (((n * n) == numMatrix)) {
          break;
        }
        num = numMatrix;
        ris = SpiralMatrix.left(matrix, (num + 1), (x - 1), y, n);
        x = ris[0];
        y = ris[1];
        numMatrix = ris[2];
        if (((n * n) == numMatrix)) {
          break;
        }
        num = numMatrix;
        ris = SpiralMatrix.up(matrix, (num + 1), x, (y - 1), n);
        x = ris[0];
        y = ris[1];
        numMatrix = ris[2];
        if (((n * n) == numMatrix)) {
          break;
        }
      }
    }
    return matrix;
  }
  
  public static int[] right(int[][] matrix, int numStart, int x, int y, int n) {
    while (((x < n) && (matrix[y][x] == 0))) {
      {
        matrix[y][x] = numStart;
        numStart = (numStart + 1);
        x = (x + 1);
      }
    }
    return new int[] { (x - 1), y, (numStart - 1) };
  }
  
  public static int[] down(int[][] matrix, int numStart, int x, int y, int n) {
    while (((y < n) && (matrix[y][x] == 0))) {
      {
        matrix[y][x] = numStart;
        numStart = (numStart + 1);
        y = (y + 1);
      }
    }
    return new int[] { x, (y - 1), (numStart - 1) };
  }
  
  public static int[] left(int[][] matrix, int numStart, int x, int y, int n) {
    while (((x > -1) && (matrix[y][x] == 0))) {
      {
        matrix[y][x] = numStart;
        numStart = (numStart + 1);
        x = (x - 1);
      }
    }
    return new int[] { (x + 1), y, (numStart - 1) };
  }
  
  public static int[] up(int[][] matrix, int numStart, int x, int y, int n) {
    while (((y > -1) && (matrix[y][x] == 0))) {
      {
        matrix[y][x] = numStart;
        numStart = (numStart + 1);
        y = (y - 1);
      }
    }
    return new int[] { x, (y + 1), (numStart - 1) };
  }
  
  public static void main(String[] args) {
    int[][] matrix = SpiralMatrix.createSpiralMatrix(4);
    int[] ris = SpiralMatrix.spiralMatrix(4, 12);
    System.out.println(matrix);
  }
}
