package counters;

public class Counter {
	/**
	 * The current value of the counter should always be positive.
	 */
	private int value;

	public Counter(int val) {
		value = val;
	}

	
	public void display() {
		System.out.println("[value=" + value + "]");
	}


	public int getValue() {
		return value;
	}

	public void setValue(int val) {
		value = val;
	}

	public void increment() {
		value++;
	}

	public void decrement() {
		if (value > 0) {
			value--;
		}
	}

	public void init() {
		value = 0;
	}

}
