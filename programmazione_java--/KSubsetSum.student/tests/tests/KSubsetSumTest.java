package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.KSubsetSum;
import javamm.KSubsetSumSolution;

@RunWith(Parameterized.class)
public class KSubsetSumTest {

	private static Object[] nextInput(int l, int m) {
		Object[] r = new Object[4];
		for (int i = 0; i < 500; ++i) {
			int[] x = new int[l];
			int sum = 0;
			for (int j = 0; j < l; j++) {
				x[j] = 1 + (int) (Math.random() * m);
				sum = sum + x[j];
			}
			r[0] = x;
			r[1] = 1 + (int) (Math.random() * l);
			r[2] = 1 + (int) (Math.random() * sum);
			r[3] = Arrays.toString(x);
		}
		return r;
	}

	@Parameters(name = "(n = {3}; k = {1}; s = {2})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][];
		for (int i = 0; i < 500; ++i) {
			m[i] = nextInput(5, 20);
		}
		for (int i = 500; i < 1000; ++i) {
			m[i] = nextInput(10, 50);
		}
		return Arrays.asList(m);
	}

	private int[] x;
	private int y;
	private int w;
	@SuppressWarnings("unused")
	private String z;

	public KSubsetSumTest(int[] x, int y, int w, String z) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.z = z;
	}

	@Test
	public void testExercise() {
		assertEquals(KSubsetSumSolution.kSubsetSum(x, y, w), KSubsetSum.kSubsetSum(x, y,w));
	}

}
