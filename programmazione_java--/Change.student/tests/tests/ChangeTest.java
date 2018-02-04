package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Change;
import javamm.ChangeSol;

@RunWith(Parameterized.class)
public class ChangeTest {
	public static void shuffle(int[] array){
		Random rgen = new Random();	
		for (int i=0; i<array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
	}
	
	@Parameters(name = "(c = {2},r={1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][3];
		for (int i = 0; i < 500; ++i) {
			int[] x = new int[5];
			x[0] = 1;
			for (int j = 1; j < 5; j++) {
				x[j] = x[j - 1] + 1 + (int) (Math.random() * (50 * j - x[j - 1] - (4 - j)));
			}
			shuffle(x);
			m[i][0] = x;
			m[i][1] = 1 + (int) (Math.random() * 2000);
			m[i][2] = Arrays.toString(x);
		}
		for (int i = 500; i < 1000; ++i) {
			int[] x = new int[10];
			x[0] = 1;
			for (int j = 1; j < 10; j++) {
				x[j] = x[j - 1] + 1 + (int) (Math.random() * (20 * j - x[j - 1] - (10 - j)));
			}
			shuffle(x);
			m[i][0] = x;
			m[i][1] = 1 + (int) (Math.random() * 2000);
			m[i][2] = Arrays.toString(x);
		}
		return Arrays.asList(m);
	}

	private int[] x;
	private int y;
	@SuppressWarnings("unused")
	private String z;

	public ChangeTest(int[] x, int y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Test
	public void testExercise() {
		assertEquals(ChangeSol.change(x, y), Change.change(x, y));
	}

}
