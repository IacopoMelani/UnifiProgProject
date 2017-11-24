package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.FirstLastDigitSum;
import javamm.FirstLastDigitSumSol;

@RunWith(Parameterized.class)
public class FirstLastDigitSumTest {

	@Parameters(name = "(n = {0})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][1];
		for (int i = 0; i < 1000; ++i) {
			int n = 10 + (int) (Math.random() * 10000000);
			m[i][0] = n;
		}
		return Arrays.asList(m);
	}

	private int n;

	public FirstLastDigitSumTest(int n) {
		this.n = n;
	}

	@Test
	public void testExercise() {
		assertEquals(FirstLastDigitSumSol.firstLastDigitSum(n), FirstLastDigitSum.firstLastDigitSum(n));
	}

}
