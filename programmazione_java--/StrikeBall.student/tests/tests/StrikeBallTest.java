package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.StrikeBall;
import javamm.StrikeBallSolution;

@RunWith(Parameterized.class)
public class StrikeBallTest {

	@Parameters(name = "(n = {0}; m = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][2];
		for (int i = 0; i < 100; ++i) {
			int x = 10 + (int) (Math.random() * 90);
			int y = 10 + (int) (Math.random() * 90);
			m[i][0] = x;
			m[i][1] = y;
		}
		for (int i = 100; i < 400; ++i) {
			int x = 100 + (int) (Math.random() * 900);
			int y = 100 + (int) (Math.random() * 900);
			m[i][0] = x;
			m[i][1] = y;
		}
		for (int i = 400; i < 700; ++i) {
			int x = 10000 + (int) (Math.random() * 90000);
			int y = 10000 + (int) (Math.random() * 90000);
			m[i][0] = x;
			m[i][1] = y;
		}
		for (int i = 700; i < 1000; ++i) {
			int x = 1000000 + (int) (Math.random() * 9000000);
			int y = 1000000 + (int) (Math.random() * 9000000);
			m[i][0] = x;
			m[i][1] = y;
		}
		return Arrays.asList(m);
	}

	private int x;
	private int y;

	public StrikeBallTest(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(Arrays.toString(StrikeBallSolution.strikeBall(x, y)),
				Arrays.toString(StrikeBall.strikeBall(x, y)));
	}

}
