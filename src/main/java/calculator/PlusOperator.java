package calculator;

public class PlusOperator implements Operator {
	@Override
	public long operation(long a, long b) {
		return a + b;
	}
}