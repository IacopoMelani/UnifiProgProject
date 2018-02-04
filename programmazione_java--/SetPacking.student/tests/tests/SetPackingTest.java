package tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.SetPacking;
import javamm.SetPackingSolution;

@RunWith(Parameterized.class)
public class SetPackingTest {
	private static byte[][] nextInput(int nr, int nc, int k) {
		int[] a = new int[nc];
		for (int i = 0; i < nc; i++) {
			a[i] = i;
		}
		byte[][] m = new byte[nr][nc];
		for (int i = 0; i < nr; ++i) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < a.length; j++) {
				list.add(j);
			}
			Collections.shuffle(list);
			for (int j = 0; j < nc; ++j) {
				m[i][j] = 0;
			}
			int s = 1 + (int) (Math.random() * k);
			for (int j = 0; j < s; j++) {
				m[i][list.get(j)] = 1;
			}
		}
		return m;
	}

	@Parameters(name = "(a = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[900][2];
		for (int i = 0; i < 300; ++i) {
			byte[][] x = nextInput(5, 5, 3);
			m[i][0] = x;
			m[i][1] = Arrays.deepToString(x);
		}
		for (int i = 300; i < 600; ++i) {
			byte[][] x = nextInput(5, 10, 4);
			m[i][0] = x;
			m[i][1] = Arrays.deepToString(x);
		}
		for (int i = 600; i < 900; ++i) {
			byte[][] x = nextInput(10, 10, 5);
			m[i][0] = x;
			m[i][1] = Arrays.deepToString(x);
		}
		return Arrays.asList(m);
	}

	private byte[][] x;
	@SuppressWarnings("unused")
	private String y;

	public SetPackingTest(byte[][] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(SetPackingSolution.setPacking(x), SetPacking.setPacking(x));
	}
}
