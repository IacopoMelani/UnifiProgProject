package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Frequences;
import javamm.FrequencesSolution;

@RunWith(Parameterized.class)
public class FrequencesTest {

	@Parameters(name = "(a = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[2000][2];
		for (int i = 0; i < 1000; ++i) {
			int l = 10;
			int[] x = new int[l];
			for (int j = 0; j < l; j++) {
				x[j] = 1 + (int) (Math.random() * 3);
			}
			m[i][0] = x;
			m[i][1] = Arrays.toString(x);
		}
		for (int i = 1000; i < 2000; ++i) {
			int l = 1 + (int) (Math.random() * 20);
			int[] x = new int[l];
			for (int j = 0; j < l; j++) {
				x[j] = 1 + (int) (Math.random() * 20);
			}
			m[i][0] = x;
			m[i][1] = Arrays.toString(x);
		}
		return Arrays.asList(m);
	}

	private int[] x;
	@SuppressWarnings("unused")
	private String y;

	public FrequencesTest(int[] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExcercise() {
		assertEquals(Arrays.toString(FrequencesSolution.frequences(x)), Arrays.toString(Frequences.frequences(x)));
	}

}
