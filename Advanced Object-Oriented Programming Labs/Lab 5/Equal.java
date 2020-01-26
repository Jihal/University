
public class Equal extends Expression {
	public Equal(int left, int right) {
		super(left, right);
		evaluate();
	}
	@Override
	void evaluate() {
		if (left == right) {
			this.value = true;
		}
		else {
			this.value = false;
		}
	}
}
