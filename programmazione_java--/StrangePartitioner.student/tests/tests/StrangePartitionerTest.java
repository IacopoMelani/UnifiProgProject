package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.StrangePartitioner;
import javamm.StrangePartitionerSolution;

@RunWith(Parameterized.class)
public class StrangePartitionerTest {

	@Parameters(name = "(a = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[600][2];
		for (int i = 0; i < 200; ++i) {
			for (int l = 5; l < 20; l = l + 5) {
				int[] x = new int[l];
				for (int j = 0; j < l; j++) {
					x[j] = 1 + (int) (Math.random() * 100);
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

	public StrangePartitionerTest(int[] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(StrangePartitionerSolution.strangePartition(x), StrangePartitioner.strangePartition(x));
	}

}
