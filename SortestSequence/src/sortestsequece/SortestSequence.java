package sortestsequece;

public class SortestSequence {

	public static int calculate(int X, int[] A) {
		int length = A.length;
		int firstSum = 0, secondSum = 0;
		int positionSolution = 0;
		for (int i = 0; i < length; i++) {
			secondSum = 0;
			firstSum = 0;
			for (int j = 0; j < i; j++) {

				if (A[j] == X)
					firstSum++;
			}
			for (int j = i + 1; j < length; j++) {

				if (A[j] != X)
					secondSum++;
			}
			if (firstSum == secondSum) {
				positionSolution = i + 1;
				return positionSolution;
			}
		}

		return positionSolution;
	}

}
