// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

/*
 * Creates nodes for evaluation
 */
public class NodeAssn extends Node {
	
	//declaration of variables
	private String id;
	private NodeExpr expr;

	/**
	 * Main constructor
	 * 
	 * @param id
	 * @param expr
	 */
	public NodeAssn(String id, NodeExpr expr) {
		this.id = id;
		this.expr = expr;
	}

	/**
	 * @param env
	 * @return - eval double
	 * @throws EvalException
	 */
	public double eval(Environment env) throws EvalException {
		return env.put(id, new NodeWr(expr).eval(env));
	}

	/**
	 * @return - translated C code
	 */
	public String code() {
		return id + "=" + expr.code() + ";" + new NodeWr(expr).code();
	}

}
