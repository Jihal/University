
public class LessThan extends Expression {
	public LessThan(int left, int right) {
		super(left, right);
		evaluate();
	}
	@Override
	void evaluate() {
		if (left < right) {
			this.value = true;
		}
		else {
			this.value = false;
		}
	}
}
