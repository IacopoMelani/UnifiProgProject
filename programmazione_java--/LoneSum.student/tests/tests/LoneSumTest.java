package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.LoneSum;
import javamm.LoneSumSol;

@RunWith(Parameterized.class)
public class LoneSumTest {

	@Parameters(name = "(a = {0}; b = {1}; c = {2})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][3];
		for (int i = 0; i < 1000; ++i) {
			int a = 1 + (int) (Math.random() * 9);
			int b = 1 + (int) (Math.random() * 9);
			int c = 1 + (int) (Math.random() * 9);
			m[i][0] = a;
			m[i][1] = b;
			m[i][2] = c;
		}
		return Arrays.asList(m);
	}

	private int a;
	private int b;
	private int c;

	public LoneSumTest(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Test
	public void testExercise() {
		assertEquals(LoneSumSol.loneSum(a, b, c), LoneSum.loneSum(a, b, c));
	}

}
