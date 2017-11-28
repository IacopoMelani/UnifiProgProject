package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.ScalarProduct;
import javamm.ScalarProductSol;

@RunWith(Parameterized.class)
public class ScalarProductTest {

	@Parameters(name = "(a = {1}; b = {3})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][4];
		for (int i = 0; i < 1000; ++i) {
			int l = 1 + (int) (Math.random() * 10);
			int[] a = new int[l];
			int[] b = new int[l];
			for (int j = 0; j < l; j++) {
				a[j] = -100 + (int) (Math.random() * 201);
				b[j] = -100 + (int) (Math.random() * 201);
			}
			m[i][0] = a;
			m[i][1] = Arrays.toString(a);
			m[i][2] = b;
			m[i][3] = Arrays.toString(b);
		}
		return Arrays.asList(m);
	}

	private int[] a;
	@SuppressWarnings("unused")
	private String x;
	private int[] b;
	@SuppressWarnings("unused")
	private String y;

	public ScalarProductTest(int[] a, String x, int[] b, String y) {
		this.a = a;
		this.x = x;
		this.b = b;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(ScalarProductSol.scalarProduct(a, b), ScalarProduct.scalarProduct(a, b));
	}

}
