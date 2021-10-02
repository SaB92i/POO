package counters;

public class CyclicCounter extends BoundedCounter {

	public CyclicCounter(int value, int max) {
		super(value, max);
	}

	@Override
	public void increment() {
		if (getValue() < getMax()) {
			super.increment();
		} else {
			setValue(0);
		}
	}

	@Override
	public void decrement() {
		if (getValue() > 0) {
			super.decrement();
		} else {
			setValue(getMax());
		}
	}

}
