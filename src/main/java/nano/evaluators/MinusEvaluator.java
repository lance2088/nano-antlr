package nano.evaluators;

public class MinusEvaluator implements IEvaluator<Integer> {

	private final IEvaluator<Integer> op1,op2;

	public MinusEvaluator(IEvaluator<Integer> op1, IEvaluator<Integer> op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public Integer evaluate() {
		return op1.evaluate() - op2.evaluate();
	}
	public String toTreeString(String indent) {
		return '\n' + indent + "Minus" +
			op1.toTreeString(indent + "  ") +
			op2.toTreeString(indent + "  ");
	}
}
