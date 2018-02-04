package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.BinPacking;
import javamm.BinPackingSolution;

@RunWith(Parameterized.class)
public class BinPackingTest {
	private static int[] nextInput(int n, int s) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = 1+(int)(Math.random()*s);
		}
		return a;
	}
	
	@Parameters(name = "(a = {2}; s = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][3];
		for (int i = 0; i < 400; ++i) {
			int n = 10;
			int s = 10;
			int[] a = nextInput(n,s);
			m[i][0] = a;
			m[i][1] = s;
			m[i][2] = Arrays.toString(a);
		}
		for (int i = 400; i < 700; ++i) {
			int n = 20;
			int s = 10;
			int[] a = nextInput(n,s);
			m[i][0] = a;
			m[i][1] = s;
			m[i][2] = Arrays.toString(a);
		}
		for (int i = 700; i < 1000; ++i) {
			int n = 20;
			int s = 100;
			int[] a = nextInput(n,s);
			m[i][0] = a;
			m[i][1] = s;
			m[i][2] = Arrays.toString(a);
		}
		return Arrays.asList(m);
	}

	private int[] x;
	private int y;
	@SuppressWarnings("unused")
	private String z;

	public BinPackingTest(int[] x, int y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Test
	public void testExercise() {
		assertEquals(BinPackingSolution.ffd(x,  y), BinPacking.ffd(x,  y));
	}

}
