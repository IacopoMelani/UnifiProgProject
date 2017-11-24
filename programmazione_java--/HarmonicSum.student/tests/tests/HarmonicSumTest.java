package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.HarmonicSum;
import javamm.HarmonicSumSol;

@RunWith(Parameterized.class)
public class HarmonicSumTest {

	@Parameters(name = "(x = {0})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][1];
		for (int i = 0; i < 1000; ++i) {
			int x = 1 + (int) (Math.random() * 100000);
			m[i][0] = x;
		}
		return Arrays.asList(m);
	}

	private int x;

	public HarmonicSumTest(int x) {
		this.x = x;
	}

	@Test
	public void testExercise() {
		assertEquals(HarmonicSumSol.harmonicSum(x), HarmonicSum.harmonicSum(x));
	}

}
