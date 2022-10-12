// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

/*
 * Currently unused
 */
public class NodeWr extends Node {

	//instantiate variables
	private NodeExpr expr;

	/**
	 * Main Constructor
	 * 
	 * @param expr
	 */
	public NodeWr(NodeExpr expr) {
		this.expr=expr;
	}

	/**
	 * @param env
	 * @return - double value
	 */
	public double eval(Environment env) throws EvalException {
		double d=expr.eval(env);
		System.out.println(d);
		return d;
	}

	/**
	 * @return code to print a double value in C
	 */
	public String code() {
		return "printf(\"%g\\n\","
			+"(double)("
			+expr.code()
			+"));";
	}

}
