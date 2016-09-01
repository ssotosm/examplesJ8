package equilibriumindex;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EquilibriumIndex {

	private int[] array;
	private List<Integer> index;

	public EquilibriumIndex(int[] array) {
		this.array = array;
		this.index = new ArrayList<>();
	}

	public List<Integer> getIndex() {
		return index;
	}

	public void setIndex(List<Integer> index) {
		this.index = index;
	}

	public void calculate() {
		System.out.println("Calculate equilibrium index...");

		for (int i = 0; (i < this.array.length && i + 1 < this.array.length); i++) {
			int sumFirst = addFirstPartArray(i);
			int sumSecond = addSecondPartArray(i);
			if (sumFirst == sumSecond)
				this.index.add(i + 1);
		}

		System.out.println(this.index.stream().map(Object::toString)
				.collect(Collectors.joining(", ")));
		
	

	}

	private int addFirstPartArray(int position) {

		int[] arrayCopy = new int[this.array.length];
		int quantity = position + 1;
		arrayCopy = Arrays.copyOf(this.array, quantity);
		int sum = Arrays.stream(arrayCopy).sum();

		return sum;
	}

	private int addSecondPartArray(int position) {

		int[] arrayCopy = new int[this.array.length];
		int initialPosition = position + 1;
		int quantity = this.array.length - (position + 1);
		System.arraycopy(this.array, initialPosition, arrayCopy, 0, quantity);

		int sum = Arrays.stream(arrayCopy).sum();
		sum = sum - this.array[initialPosition];

		return sum;

	}

}
