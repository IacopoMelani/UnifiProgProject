package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.IntervalMerge;
import javamm.IntervalMergeSolution;

@RunWith(Parameterized.class)
public class IntervalMergeTest {

	private static void swap(int[][] m, int i, int j) {
		int t0 = m[i][0];
		int t1 = m[i][1];
		m[i][0] = m[j][0];
		m[i][1] = m[j][1];
		m[j][0] = t0;
		m[j][1] = t1;
	}

	private static void sort(int[][] m) {
		int n = m.length;
		for (int i = 0; i < n - 1; i++) {
			int min = m[i][0];
			int imin = i;
			for (int j = i + 1; j < n; j++) {
				if (m[j][0] < min) {
					min = m[j][0];
					imin = j;
				}
			}
			swap(m, i, imin);
		}
	}

	private static String print(int[][] m) {
		if (m != null) {
			String r = "[";
			for (int i = 0; i < m.length - 1; i++) {
				r = r + Arrays.toString(m[i]) + ",";
			}
			r = r + Arrays.toString(m[m.length - 1]) + "]";
			return r;
		} else {
			return "null";
		}
	}

	@Parameters(name = "(m = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][2];
		for (int i = 0; i < 500; ++i) {
			int[][] x = new int[5][2];
			for (int j = 0; j < 5; j++) {
				x[j][0] = 1 + (int) (Math.random() * 20);
				x[j][1] = x[j][0] + (int) (Math.random() * (20 - x[j][0] + 1));
			}
			sort(x);
			m[i][0] = x;
			m[i][1] = print(x);
		}
		for (int i = 500; i < 1000; ++i) {
			int[][] x = new int[10][2];
			for (int j = 0; j < 10; j++) {
				x[j][0] = 1 + (int) (Math.random() * 100);
				x[j][1] = x[j][0] + (int) (Math.random() * (100 - x[j][0] + 1));
			}
			sort(x);
			m[i][0] = x;
			m[i][1] = print(x);
		}
		return Arrays.asList(m);
	}

	private int[][] x;
	@SuppressWarnings("unused")
	private String y;

	public IntervalMergeTest(int[][] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(print(IntervalMergeSolution.intervalMerge(x)), print(IntervalMerge.intervalMerge(x)));
	}

}
