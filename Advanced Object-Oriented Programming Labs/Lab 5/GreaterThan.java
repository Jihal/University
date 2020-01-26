
public class GreaterThan extends Expression {
	public GreaterThan(int left, int right) {
		super(left, right);
		evaluate();
	}
	@Override
	void evaluate() {
		if (left > right) {
			this.value = true;
		}
		else {
			this.value = false;	
		}
	}
}
