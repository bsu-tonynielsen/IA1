// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

/*
 * Creates nodes for evaluation
 */
public class NodeExpr extends Node {
	
	//instantiate variables
	private NodeTerm term;
	private NodeAddop addop;
	private NodeExpr expr;

	/**
	 * Main constructor
	 * 
	 * @param term
	 * @param addop
	 * @param expr
	 */
	public NodeExpr(NodeTerm term, NodeAddop addop, NodeExpr expr) {
		this.term=term;
		this.addop=addop;
		this.expr=expr;
	}

	/**
	 * Appends passed in expression
	 * 
	 * @param expr
	 */
	public void append(NodeExpr expr) {
		if (this.expr==null) {
			this.addop=expr.addop;
			this.expr=expr;
			expr.addop=null;
		} else
			this.expr.append(expr);
	}

	/**
	 * @param env
	 * @return - eval double
	 * @throws EvalException
	 */
	public double eval(Environment env) throws EvalException {
		return expr==null
			? term.eval(env)
			: addop.op(expr.eval(env),term.eval(env));
	}

	/**
	 * @return - translated C code
	 */
	public String code() {
		return (expr==null ? "" : expr.code()+addop.code())+term.code();
	}

}
