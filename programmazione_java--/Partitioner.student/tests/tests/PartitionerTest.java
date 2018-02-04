package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Partitioner;
import javamm.PartitionerSol;

@RunWith(Parameterized.class)
public class PartitionerTest {
	@Parameters(name = "(a = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[600][2];
		for (int i = 0; i < 200; ++i) {
			for (int l = 5; l < 20; l = l + 5) {
				int[] x = new int[l];
				for (int j = 0; j < l; j++) {
					x[j] = -50 + (int) (Math.random() * 101);
				}
				String y = Arrays.toString(x);
				m[i*3+l/5-1][0] = x;
				m[i*3+l/5-1][1] = y;
			}
		}
		return Arrays.asList(m);
	}

	private int[] x;
	@SuppressWarnings("unused")
	private String y;

	public PartitionerTest(int[] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(PartitionerSol.partition(x), Partitioner.partition(x));
	}
}
