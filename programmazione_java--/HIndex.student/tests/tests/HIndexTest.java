package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.HIndex;
import javamm.HIndexSolution;

@RunWith(Parameterized.class)
public class HIndexTest {

	@Parameters(name = "(a = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1010][2];
		for (int i = 0; i < 500; ++i) {
			int l = 10;
			int[] x = new int[l];
			for (int j = 0; j < l; j++) {
				x[j] = (int) (Math.random() * 20);
			}
			m[i][0] = x;
			m[i][1] = Arrays.toString(x);
		}
		for (int i = 500; i < 1000; ++i) {
			int l = 20;
			int[] x = new int[l];
			for (int j = 0; j < l; j++) {
				x[j] = (int) (Math.random() * 40);
			}
			m[i][0] = x;
			m[i][1] = Arrays.toString(x);
		}
		for (int i = 1000; i < 1010; ++i) {
			int l = i-999;
			int[] x = new int[l];
			for (int j = 0; j < l; j++) {
				x[j] = 0;
			}
			m[i][0] = x;
			m[i][1] = Arrays.toString(x);
		}
		return Arrays.asList(m);
	}

	private int[] x;
	@SuppressWarnings("unused")
	private String y;

	public HIndexTest(int[] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(HIndexSolution.hIndex(x), HIndex.hIndex(x));
	}

}
