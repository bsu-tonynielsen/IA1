// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

/*
 * Creates nodes for evaluation
 */
public class NodeStmt extends Node {

	//instantiate variables
	private NodeAssn assn;

	/**
	 * Main Constructor
	 * 
	 * @param assn
	 */
	public NodeStmt(NodeAssn assn) {
		this.assn=assn;
	}

	/**
	 * @param env
	 * @return - eval double
	 * @throws EvalException
	 */
	public double eval(Environment env) throws EvalException {
		return assn.eval(env);
	}

	/**
	 * @return - translated C code
	 */
	public String code() { return assn.code(); }

}
