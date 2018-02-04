package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Armstrong;
import javamm.ArmstrongSol;

@RunWith(Parameterized.class)
public class ArmstrongTest {

	@Parameters(name = "(n = {0})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[10000][1];
		for (int i = 0; i < 10000; ++i) {
			int x = i + 1;
			m[i][0] = x;
		}
		return Arrays.asList(m);
	}

	private int x;

	public ArmstrongTest(int x) {
		this.x = x;
	}

	@Test
	public void testExcercise() {
		assertEquals("The expected boolean value is different from the returned one. Boolean value ",
				ArmstrongSol.armstrong(x), Armstrong.armstrong(x));
	}

}
