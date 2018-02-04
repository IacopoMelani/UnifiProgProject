package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.MaximumNumber;
import javamm.MaximumNumberSolution;

@RunWith(Parameterized.class)
public class MaximumNumberTest {

	@Parameters(name = "(a = {2}; k = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][3];
		for (int i = 0; i < 100; ++i) {
			int l = 10;
			int[] x = new int[l];
			for (int j = 0; j < l; j++) {
				x[j] = 1 + (int) (Math.random() * 9);
			}
			for (int k = 1; k <= l; k++) {
				m[l*i+k-1][0] = x;
				m[l*i+k-1][1] = k;
				m[l*i+k-1][2] = Arrays.toString(x);
			}
		}
		return Arrays.asList(m);
	}

	private int[] x;
	private int y;
	@SuppressWarnings("unused")
	private String z;

	public MaximumNumberTest(int[] x, int y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Test
	public void testExercise() {
		assertEquals(MaximumNumberSolution.maximumNumber(x, y), MaximumNumber.maximumNumber(x, y));
	}

}
