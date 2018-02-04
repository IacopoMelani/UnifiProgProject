package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.GreedyCode;
import javamm.GreedyCodeSolution;

@RunWith(Parameterized.class)
public class GreedyCodeTest {

	@Parameters(name = "(n = {0})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][1];
		for (int i = 0; i < 300; ++i) {
			m[i][0] = 1+(long) (Math.random() * 1000000L);
		}
		for (int i = 300; i < 600; ++i) {
			m[i][0] = 1+(long) (Math.random() * 1000000000000L);
		}
		for (int i = 600; i < 1000; ++i) {
			m[i][0] = 1+(long) (Math.random() * Long.MAX_VALUE);
		}
		return Arrays.asList(m);
	}

	private long x;

	public GreedyCodeTest(long x) {
		this.x = x;
	}

	@Test
	public void testExercise() {
		String t = Arrays.toString(GreedyCodeSolution.greedyCode(x));
		String s = Arrays.toString(GreedyCode.greedyCode(x));
		assertEquals(t, s);
	}
}
