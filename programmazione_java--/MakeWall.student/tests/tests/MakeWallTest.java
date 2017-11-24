package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.MakeWall;
import javamm.MakeWallSol;

@RunWith(Parameterized.class)
public class MakeWallTest {

	@Parameters(name = "(s = {0}; b = {1}; g = {2})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][3];
		for (int i = 0; i < 1000; ++i) {
			int s = 1 + (int) (Math.random() * 20);
			int b = 1 + (int) (Math.random() * 10);
			int g = 1 + (int) (Math.random() * 100);
			m[i][0] = s;
			m[i][1] = b;
			m[i][2] = g;
		}
		return Arrays.asList(m);
	}

	private int s;
	private int b;
	private int g;

	public MakeWallTest(int s, int b, int g) {
		this.s = s;
		this.b = b;
		this.g = g;
	}

	@Test
	public void testExercise() {
		assertEquals(MakeWallSol.isWallDoable(s, b, g), MakeWall.isWallDoable(s, b, g));
	}

}
