// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

/*
 * Creates nodes so that the parser can evaluate node contents
 * using the eval() method.
 */
public class NodeTerm extends Node {

	//instantiate variables
	private NodeFact fact;
	private NodeMulop mulop;
	private NodeTerm term;

	/**
	 * Main Constructor
	 * 
	 * @param fact
	 * @param mulop
	 * @param term
	 */
	public NodeTerm(NodeFact fact, NodeMulop mulop, NodeTerm term) {
		this.fact=fact;
		this.mulop=mulop;
		this.term=term;
	}

	/**
	 * Appends passed in term
	 * 
	 * @param expr
	 */
	public void append(NodeTerm term) {
		if (this.term==null) {
			this.mulop=term.mulop;
			this.term=term;
			term.mulop=null;
		} else
			this.term.append(term);
	}

	/**
	 * @param env
	 * @return - eval double
	 * @throws EvalException
	 */
	public double eval(Environment env) throws EvalException {
		return term==null
			? fact.eval(env)
			: mulop.op(term.eval(env),fact.eval(env));
	}

	/**
	 * @return - translated C code
	 */
	public String code() {
		return (term==null ? "" : term.code()+mulop.code())+fact.code();
	}

}
