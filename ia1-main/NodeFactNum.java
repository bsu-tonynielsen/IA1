// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

/*
 * Creates nodes for evaluation
 */
public class NodeFactNum extends NodeFact {

	//instantiate variables
	private String num;

	/**
	 * Main Constructor
	 * 
	 * @param pos
	 * @param id
	 */
	public NodeFactNum(String num) {
		this.num=num;
	}

	/**
	 * @param env
	 * @return - eval double
	 * @throws EvalException
	 */
	public double eval(Environment env) throws EvalException {
		return Integer.parseInt(num);
	}

	/**
	 * @return - translated C code
	 */
	public String code() { return num; }

}
