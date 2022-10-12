// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

/*
 * Currently unused
 */
public class NodeStmt extends Node {

	private NodeAssn assn;

	public NodeStmt(NodeAssn assn) {
		this.assn=assn;
	}

	public double eval(Environment env) throws EvalException {
		return assn.eval(env);
	}

	public String code() { return assn.code(); }

}
