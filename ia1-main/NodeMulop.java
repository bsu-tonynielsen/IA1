// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

/*
 * Creates nodes for multiplication and division
 */
public class NodeMulop extends Node {

	//instantiate variables
	private String mulop;

	/**
	 * Main Constructor
	 * 
	 * @param pos
	 * @param mulop
	 */
	public NodeMulop(int pos, String mulop) {
		this.pos=pos;
		this.mulop=mulop;
	}

	/**
	 * @param d
	 * @param e
	 * @return - result
	 * @throws EvalException
	 */
	public double op(double d, double e) throws EvalException {
		if (mulop.equals("*"))
			return d*e;
		if (mulop.equals("/"))
			return d/e;
		throw new EvalException(pos,"bogus mulop: "+mulop);
	}

	/**
	 * @return - translated C code
	 */
	public String code() { return mulop; }

}
