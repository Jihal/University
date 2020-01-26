
public class AddAll extends ExpressionCollector {
	public AddAll() {
		super();
	}
	@Override
	void evaluate() {
		if (this.isTypeCorrect()) { 
			Integer total = 0;
			for (Expression e : this.exp) {
				e.evaluate();
				total += (Integer) e.getValue();
			}
			this.value = total;
		}
	}
}
