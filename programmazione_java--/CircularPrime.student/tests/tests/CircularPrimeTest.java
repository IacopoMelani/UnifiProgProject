package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.CircularPrime;
import javamm.CircularPrimeSolution;

@RunWith(Parameterized.class)
public class CircularPrimeTest {

	@Parameters(name = "(n = {0})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[500][1];
		for (int i = 0; i < 500; ++i) {
			m[i][0] = 100 * (i + 1);
		}
		return Arrays.asList(m);
	}

	private int x;

	public CircularPrimeTest(int x) {
		this.x = x;
	}

	@Test
	public void testExercise() {
		assertEquals(CircularPrimeSolution.circularPrime(x), CircularPrime.circularPrime(x));
	}

}
