
public class Multiplication extends Expression {
	public Multiplication (int left, int right) {
		super(left, right);
		evaluate();
	}
	@Override
	void evaluate() {
		this.value = left * right;
	}
}
