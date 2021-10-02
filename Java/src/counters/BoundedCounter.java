package counters;

public class BoundedCounter extends Counter {
	private int max;

	public BoundedCounter(int value, int valueMax) {
		super(value);
		max = valueMax;
	}

	@Override
	public void increment() {
		if (getValue() < max) {
			super.increment();
		} 
	}

	protected int getMax() {
		return max;
	}
}
