package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.EvenlySpaced;
import javamm.EvenlySpacedSol;

@RunWith(Parameterized.class)
public class EvenlySpacedTest {

	@Parameters(name = "(a = {0}; b = {1}; c = {2})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][3];
		for (int i = 0; i < 1000; ++i) {
			int a = 1 + (int) (Math.random() * 20);
			int b = 1 + (int) (Math.random() * 20);
			int c = 1 + (int) (Math.random() * 20);
			m[i][0] = a;
			m[i][1] = b;
			m[i][2] = c;
		}
		return Arrays.asList(m);
	}

	private int a;
	private int b;
	private int c;

	public EvenlySpacedTest(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Test
	public void testExercise() {
		assertEquals(EvenlySpacedSol.evenlySpaced(a, b, c), EvenlySpaced.evenlySpaced(a, b, c));
	}

}
