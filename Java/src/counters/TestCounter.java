package counters;

public class TestCounter {

	public static void main(String[] args) {
		
		Counter counter = new Counter(0);
		counter.display();
		for (int i = 1; i <= 10; i++) {
			counter.increment();
		}
		counter.display();
		for (int i = 1; i <= 20; i++) {
			counter.decrement();
		}
		counter.display();
		
		BoundedCounter boundedCounter = new BoundedCounter(0, 5);
		boundedCounter.display();
		for (int i = 1; i <= 10; i++) {
			boundedCounter.increment();
		}
		boundedCounter.display();

		
		CyclicCounter cyclicCounter = new CyclicCounter(0, 5);
		cyclicCounter.display();
		for (int i = 1; i <= 100; i++) {
			cyclicCounter.increment();
		}
		cyclicCounter.display();

		CyclicCounter cyclicCounter2 = new CyclicCounter(0, 5);
		for (int i = 1; i <= 200; i++) {
			cyclicCounter2.decrement();
		}
		cyclicCounter2.display();

	}

}
