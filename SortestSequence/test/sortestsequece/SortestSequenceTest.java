package sortestsequece;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SortestSequenceTest {
	int X = 5;
	int A[] = new int[] { 5, 5, 5,1, 7, 2, 3, 5 ,5,5};

	@Test
	public void prueba() {
		int sol =SortestSequence.calculate(X,A);	
		assertEquals(4, sol);

	}

	
}