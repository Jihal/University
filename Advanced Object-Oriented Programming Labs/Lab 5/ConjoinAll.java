
public class ConjoinAll extends ExpressionCollector {
	public ConjoinAll() {
		super();
	}
	@Override
	void evaluate() {
		if (this.isTypeCorrect()) { 
			Boolean total = true;
			for (Expression e : this.exp) {
				e.evaluate();
				total = total && (Boolean) e.getValue();
			}
			this.value = total;
		}
	}
}
