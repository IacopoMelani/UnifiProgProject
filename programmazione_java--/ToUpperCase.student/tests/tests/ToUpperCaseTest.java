package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.ToUpperCase;
import javamm.ToUpperCaseSol;

@RunWith(Parameterized.class)
public class ToUpperCaseTest {

	@Parameters(name = "(a = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][2];
		for (int i = 0; i < 1000; ++i) {
			int l = 1 + (int) (Math.random() * 10);
			char[] a = new char[l];
			for (int j = 0; j < l; j++) {
				if (Math.random() > 0.5) {
					a[j] = (char) (97 + (int) (Math.random() * 26));
				} else {
					a[j] = (char) (65 + (int) (Math.random() * 26));
				}
			}
			m[i][0] = a;
			m[i][1] = Arrays.toString(a);
		}
		return Arrays.asList(m);
	}

	private char[] a;
	@SuppressWarnings("unused")
	private String x;

	public ToUpperCaseTest(char[] a, String x) {
		this.a = a;
		this.x = x;
	}

	@Test
	public void testExercise() {
		assertEquals(Arrays.toString(ToUpperCaseSol.upperCase(a)), Arrays.toString(ToUpperCase.upperCase(a)));
	}

}
