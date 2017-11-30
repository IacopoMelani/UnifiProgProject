package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.PalindromeArray;
import javamm.PalindromeArraySol;

@RunWith(Parameterized.class)
public class PalindromeArrayTest {

	@Parameters(name = "(a = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][2];
		for (int i = 0; i < 1000; i++) {
			int l = 1 + (int) (Math.random() * 15);
			int[] a = new int[l];
			if (Math.random() < 0.5) {
				for (int j = 0; j < l; j++) {
					a[j] = -100 + (int) (Math.random() * 201);
				}
			} else {
				for (int j = 0; j < l/2; j++) {
					a[j] = -100 + (int) (Math.random() * 201);
					a[l-j-1] = a[j];
				}				
			}
			m[i][0] = a;
			m[i][1] = Arrays.toString(a);

		}
		return Arrays.asList(m);
	}

	private int[] a;
	@SuppressWarnings("unused")
	private String y;

	public PalindromeArrayTest(int[] a, String y) {
		this.a = a;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(PalindromeArraySol.palindrome(a), PalindromeArray.palindrome(a));
	}

}
