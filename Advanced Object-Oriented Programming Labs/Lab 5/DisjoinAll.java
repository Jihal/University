
public class DisjoinAll extends ExpressionCollector {
	public DisjoinAll() {
		super();
	}
	@Override
	void evaluate() {
		if (this.isTypeCorrect()) { 
			Boolean total = false;
			for (Expression e : this.exp) {
				e.evaluate();
				total = total || (Boolean) e.getValue();
			}
			this.value = total;
		}
	}
}
