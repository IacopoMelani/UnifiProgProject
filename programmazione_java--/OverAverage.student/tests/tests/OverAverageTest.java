package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.OverAverage;
import javamm.OverAverageSolution;

@RunWith(Parameterized.class)
public class OverAverageTest {

	@Parameters(name = "(a = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][2];
		for (int i = 0; i < 1000; ++i) {
			int l = 1 + (int) (Math.random() * 20);
			int[] x = new int[l];
			for (int j = 0; j < l; j++) {
				x[j] = 1 + (int) (Math.random() * 100);
			}
			m[i][0] = x;
			m[i][1] = Arrays.toString(x);
		}
		return Arrays.asList(m);
	}

	private int[] x;
	@SuppressWarnings("unused")
	private String y;

	public OverAverageTest(int[] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExcercise() {
		assertEquals(Arrays.toString(OverAverageSolution.overAverage(x)), Arrays.toString(OverAverage.overAverage(x)));
	}

}
