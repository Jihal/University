
public class Addition extends Expression {
	public Addition(int left, int right) {
		super(left, right);
		evaluate();
	}
	@Override
	void evaluate() {
		this.value = left + right;
	}
}
