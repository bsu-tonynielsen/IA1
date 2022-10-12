// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

/*
 * Uses NodeMulop to create addition and subtraction operations
 */
public class NodeAddop extends Node {

	private String addop;

	/**
	 * Main constructor
	 * 
	 * @param pos
	 * @param addop
	 */
	public NodeAddop(int pos, String addop) {
		this.pos=pos;
		this.addop=addop;
	}

	/**
	 * @param o1
	 * @param o2
	 * @return - result
	 * @throws EvalException
	 */
	public double op(double o1, double o2) throws EvalException {
		if (addop.equals("+"))
			return o1+o2;
		if (addop.equals("-"))
			return o1-o2;
		throw new EvalException(pos,"bogus addop: "+addop);
	}

	/**
	 * @return - translated C code
	 */
	public String code() { return addop; }

}
