
public class TimesAll extends ExpressionCollector {
	public TimesAll() {
		super();
	}
	@Override
	void evaluate() {
		if (this.isTypeCorrect()) { 
			Integer total = 1;
			for (Expression e : this.exp) {
				e.evaluate();
				total *= (Integer) e.getValue();
			}
			this.value = total;
		}
	}
}
