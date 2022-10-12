// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

/*
 * Creates nodes for evaluation
 */
public class NodeFactExpr extends NodeFact {

	//instantiate variables
	private NodeExpr expr;

	/**
	 * Main constructor
	 * 
	 * @param expr
	 */
	public NodeFactExpr(NodeExpr expr) {
		this.expr=expr;
	}

	/**
	 * @param env
	 * @return - eval double
	 * @throws EvalException
	 */
	public double eval(Environment env) throws EvalException {
		return expr.eval(env);
	}

	/**
	 * @return - translated C code
	 */
	public String code() { return "("+expr.code()+")"; }

}
