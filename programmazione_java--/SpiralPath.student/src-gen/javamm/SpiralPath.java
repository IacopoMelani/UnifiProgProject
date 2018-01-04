package javamm;

@SuppressWarnings("all")
public class SpiralPath {
  /**
   * Dato un numero dispari positivo n, la matrice associata ad n e' la
   * matrice bidimensionale di dimensione nxn, riempita con i numeri da
   * 1 a nxn a partire dall'elemento in alto a sinistra e procedendo da
   * sinistra verso destra e dall'alto verso il basso. Ad esempio,
   * la matrice associata a 3 e' la seguente matrice:
   * 
   *   1 2 3
   *   4 5 6
   *   7 8 9
   * 
   * mentre la matrice associata a 5 e' la seguente matrice:
   * 
   *   1  2  3  4  5
   *   6  7  8  9 10
   *  11 12 13 14 15
   *  16 17 18 19 20
   *  21 22 23 24 25
   * 
   * La visita a spirale della matrice associata a n consiste nel visitare,
   * una e una sola volta, tutti gli elementi della matrice partendo
   * dall'elemento "al centro" e proseguendo secondo una spirale in senso
   * antiorario, ossia avanzando nel seguente ordine: in alto, a sinistra,
   * in basso e a destra, il numero di volte necessario per ciascuna direzione,
   * e ricominciando. Ad esempio, la visita a spirale della matrice associata a 3
   * visita i suoi elementi secondo il seguente ordine:
   * 
   * 5 2 1 4 7 8 9 6 3
   * 
   * mentre la visita a spirale della matrice associata a 5 visita i suoi elementi
   * secondo il seguente ordine:
   * 
   * 13 8 7 12 17 18 19 14 9 4 3 2 1 6 11 16 21 22 23 24 25 20 15 10 5
   * 
   * Scrivere un metodo, chiamato spiralPath, che dato in input un numero
   * dispari positivo e dato un numero positivo i tale che 1<=i<=nxn,
   * restituisca l'elemento della matrice associata ad n che viene
   * visitato per i-esimo durante la visita a spirale della matrice stessa.
   * 
   * ESEMPI
   * Input: 3, 2
   * Output: 2
   * 
   * Input: 3, 5
   * Output: 7
   * 
   * Input: 3, 8
   * Output: 6
   * 
   * Input: 5, 2
   * Output: 8
   * 
   * Input: 5, 8
   * Output: 14
   * 
   * Input: 5, 15
   * Output: 11
   */
  public static int spiralPath(int n, int i) {
    int[][] matrix = SpiralPath.createMatrix(n);
    int[] reversepath = SpiralPath.createPath(matrix, n);
    int[] path = SpiralPath.sortPath(reversepath);
    int x = SpiralPath.findInput(path, i);
    return x;
  }
  
  public static int[][] createMatrix(int n) {
    int[][] matrix = new int[n][n];
    int num = 1;
    for (int y = 0; (y < n); y++) {
      for (int x = 0; (x < n); x++) {
        {
          matrix[y][x] = num;
          num = (num + 1);
        }
      }
    }
    return matrix;
  }
  
  public static int[] createPath(int[][] matrix, int n) {
    int center = matrix[(n / 2)][(n / 2)];
    int[] path = new int[(n * n)];
    int y = -1;
    int x = (n - 1);
    int i = 0;
    int[] ris = {};
    while (true) {
      {
        ris = SpiralPath.down(matrix, path, x, (y + 1), n, i);
        x = ris[0];
        y = ris[1];
        i = ris[2];
        boolean _tripleEquals = (path[(i - 1)] == center);
        if (_tripleEquals) {
          break;
        }
        ris = SpiralPath.left(matrix, path, (x - 1), y, n, i);
        x = ris[0];
        y = ris[1];
        i = ris[2];
        boolean _tripleEquals_1 = (path[(i - 1)] == center);
        if (_tripleEquals_1) {
          break;
        }
        ris = SpiralPath.up(matrix, path, x, (y - 1), n, i);
        x = ris[0];
        y = ris[1];
        i = ris[2];
        boolean _tripleEquals_2 = (path[(i - 1)] == center);
        if (_tripleEquals_2) {
          break;
        }
        ris = SpiralPath.right(matrix, path, (x + 1), y, n, i);
        x = ris[0];
        y = ris[1];
        i = ris[2];
        boolean _tripleEquals_3 = (path[(i - 1)] == center);
        if (_tripleEquals_3) {
          break;
        }
      }
    }
    return path;
  }
  
  public static int[] right(int[][] matrix, int[] path, int x, int y, int n, int i) {
    while (((x < n) && (matrix[y][x] != 0))) {
      {
        path[i] = matrix[y][x];
        matrix[y][x] = 0;
        x = (x + 1);
        i = (i + 1);
      }
    }
    return new int[] { (x - 1), y, i };
  }
  
  public static int[] down(int[][] matrix, int[] path, int x, int y, int n, int i) {
    while (((y < n) && (matrix[y][x] != 0))) {
      {
        path[i] = matrix[y][x];
        matrix[y][x] = 0;
        y = (y + 1);
        i = (i + 1);
      }
    }
    return new int[] { x, (y - 1), i };
  }
  
  public static int[] left(int[][] matrix, int[] path, int x, int y, int n, int i) {
    while (((x > -1) && (matrix[y][x] != 0))) {
      {
        path[i] = matrix[y][x];
        matrix[y][x] = 0;
        x = (x - 1);
        i = (i + 1);
      }
    }
    return new int[] { (x + 1), y, i };
  }
  
  public static int[] up(int[][] matrix, int[] path, int x, int y, int n, int i) {
    while (((y > -1) && (matrix[y][x] != 0))) {
      {
        path[i] = matrix[y][x];
        matrix[y][x] = 0;
        y = (y - 1);
        i = (i + 1);
      }
    }
    return new int[] { x, (y + 1), i };
  }
  
  public static int[] sortPath(int[] rvPath) {
    int[] path = new int[rvPath.length];
    for (int i = rvPath.length; (i > 0); i--) {
      path[(rvPath.length - i)] = rvPath[(i - 1)];
    }
    return path;
  }
  
  public static int findInput(int[] path, int x) {
    return path[(x - 1)];
  }
  
  public static void main(String[] args) {
    int n = SpiralPath.spiralPath(5, 15);
    System.out.println(n);
  }
}
