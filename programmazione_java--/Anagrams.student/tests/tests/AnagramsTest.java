package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Anagrams;
import javamm.AnagramsSol;

@RunWith(Parameterized.class)
public class AnagramsTest {

	@Parameters(name = "(s = {2}; j = {3})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1100][4];
		for (int i = 0; i < 1000; ++i) {
			int l = 10;
			int[] x = new int[l];
			int[] y = new int[l];
			for (int j = 0; j < l; j++) {
				x[j] = 1 + (int) (Math.random() * 20);
				y[j] = 1 + (int) (Math.random() * 20);
			}
			m[i][0] = x;
			m[i][1] = y;
			m[i][2] = Arrays.toString(x);
			m[i][3] = Arrays.toString(y);
		}
		for (int i = 0; i < 100; ++i) {
			int l = 20;
			int[] x = new int[l];
			int[] y = new int[l];
			for (int j = 0; j < l; j++) {
				x[j] = 1 + (int) (Math.random() * 2);
				y[j] = 1 + (int) (Math.random() * 2);
			}
			m[1000+i][0] = x;
			m[1000+i][1] = y;
			m[1000+i][2] = Arrays.toString(x);
			m[1000+i][3] = Arrays.toString(x);
		}
		return Arrays.asList(m);
	}

	private int[] x;
	private int[] y;
	@SuppressWarnings("unused")
	private String w;
	@SuppressWarnings("unused")
	private String z;

	public AnagramsTest(int[] x, int[] y, String w, String z) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.z = z;
	}

	@Test
	public void testExcercise() {
		assertEquals(AnagramsSol.anagrams(x, y), Anagrams.anagrams(x, y));
	}

}
