// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

/*
 * Creates nodes for evaluation
 */
public class NodeFactId extends NodeFact {

	//instantiate variables
	private String id;

	/**
	 * Main Constructor
	 * 
	 * @param pos
	 * @param id
	 */
	public NodeFactId(int pos, String id) {
		this.pos=pos;
		this.id=id;
	}

	/**
	 * @param env
	 * @return - eval double
	 * @throws EvalException
	 */
	public double eval(Environment env) throws EvalException {
		return env.get(pos,id);
	}

	/**
	 * @return - translated C code
	 */
	public String code() { return id; }

}
