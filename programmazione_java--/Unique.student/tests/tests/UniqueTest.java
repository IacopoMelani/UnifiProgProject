package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Unique;
import javamm.UniqueSolution;

@RunWith(Parameterized.class)
public class UniqueTest {

	@Parameters(name = "(a = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[2100][2];
		for (int i = 0; i < 2000; ++i) {
			int l = (int) (Math.random() * 21);
			int[] x = new int[l];
			for (int j = 0; j < l; j++) {
				x[j] = 1 + (int) (Math.random() * 20);
			}
			m[i][0] = x;
			m[i][1] = Arrays.toString(x);
		}
		for (int i = 2000; i < 2100; ++i) {
			int l = 10;
			int[] x = new int[l];
			for (int j = 0; j < l; j++) {
				x[j] = 1 + (int) (Math.random() * 4);
			}
			m[i][0] = x;
			m[i][1] = Arrays.toString(x);
		}
		return Arrays.asList(m);
	}

	private int[] x;
	@SuppressWarnings("unused")
	private String y;

	public UniqueTest(int[] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(Arrays.toString(UniqueSolution.unique(x)), Arrays.toString(Unique.unique(x)));
	}
}
