package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Amicable;
import javamm.AmicableSol;

@RunWith(Parameterized.class)
public class AmicableTest {

	@Parameters(name = "(a = {0}; b = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[300 * 300][2];
		for (int i = 0; i < 300; ++i) {
			for (int j = 0; j < 300; ++j) {
				m[i*300+j][0] = 1+i+1;
				m[i*300+j][1] = 1+j+1;
			}
		}
		return Arrays.asList(m);
	}

	private int x;
	private int y;

	public AmicableTest(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExcercise() {
		assertEquals(AmicableSol.amicable(x, y), Amicable.amicable(x, y));
	}

}
