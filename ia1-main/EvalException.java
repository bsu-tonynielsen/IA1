// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

/*
 * A class for evaluation exceptions and handling
 */
public class EvalException extends Exception {

	//declaration of initial variables
	private int pos;
	private String msg;

	/**
	 * Main Constructor
	 * 
	 * @param pos
	 * @param msg
	 */
	public EvalException(int pos, String msg) {
		this.pos=pos;
		this.msg=msg;
	}

	/**
	 * @return output string of exception
	 */
	public String toString() {
		return "eval error"
			+", pos="+pos
			+", "+msg;
	}

}
