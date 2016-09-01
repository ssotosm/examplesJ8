package samples;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestArrays {
	
	static int arrayExpected[];
	static List<Integer> listNumbers = new ArrayList<Integer>();
	
	@BeforeClass
	public static void setUp() {
		 arrayExpected= new int[] { 1, 3, 4, 5 };
		listNumbers.add(1);
		listNumbers.add(3);
		listNumbers.add(4);
		listNumbers.add(5);
	}

	@Test
	public void listToPrimitiveArrayInt() {
		int arrayResult[] = new int[] {};
		arrayResult = convertPrimitiveArray(listNumbers);
		assertTrue(Arrays.equals(arrayExpected, arrayResult));

	}

	private int[] convertPrimitiveArray(List<Integer> listNumbers) {
		int[] array = new int[] {};
		array = listNumbers.stream().mapToInt(i -> i).toArray();		
		return array;
	}

}
