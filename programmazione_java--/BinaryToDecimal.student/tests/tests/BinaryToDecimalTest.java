package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.BinaryToDecimal;
import javamm.BinaryToDecimalSol;

@RunWith(Parameterized.class)
public class BinaryToDecimalTest {

	@Parameters(name = "(a = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[200][2];
		for (int i = 0; i < 200; i++) {
			int l = 1+(int)(Math.random()*15);
			int[] a = new int[l];
			for (int j = 0; j < l; j++) {
				a[j] = (int) (Math.random() * 2);
			}
			m[i][0] = a;
			m[i][1] = Arrays.toString(a);
			
		}
		return Arrays.asList(m);
	}

	private int[] a;
	@SuppressWarnings("unused")
	private String y;

	public BinaryToDecimalTest(int[] a, String y) {
		this.a = a;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(BinaryToDecimalSol.decimal(a), BinaryToDecimal.decimal(a));
	}

}
