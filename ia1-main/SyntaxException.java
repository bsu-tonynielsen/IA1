// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

/*
 * Handles syntax errors within main code and displays their trace message.
 */
public class SyntaxException extends Exception {

	//instantiate variables
	private int pos;
	private Token expected;
	private Token found;

	/**
	 * Main Constructor
	 * 
	 * @param pos
	 * @param expected
	 * @param found
	 */
	public SyntaxException(int pos, Token expected, Token found) {
		this.pos=pos;
		this.expected=expected;
		this.found=found;
	}

	/**
	 * @return output string of error message
	 */
	public String toString() {
		return "syntax error"
			+", pos="+pos
			+", expected="+expected
			+", found="+found;
	}

}
