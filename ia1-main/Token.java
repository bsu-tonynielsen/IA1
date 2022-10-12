// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

// This class models a token, which has two parts:
// 1) the token itself (e.g., "id" or "+")
// 2) the token's lexeme (e.g., "foo")
public class Token {

	//instantiate variables
	private String token;
	private String lexeme;

	/**
	 * Main Constructor
	 * 
	 * @param token
	 * @param lexeme
	 */
	public Token(String token, String lexeme) {
		this.token=token;
		this.lexeme=lexeme;
	}

	/**
	 * @param token
	 * @return - the token
	 */
	public Token(String token) {
		this(token,token);
	}

	/**
	 * @return token
	 */
	public String tok() { return token; }

	/**
	 * @return lexeme
	 */
	public String lex() { return lexeme; }

	/**
	 * 
	 * @param t
	 * @return if tokens are the same return true
	 */
	public boolean equals(Token t) {
		return token.equals(t.token);
	}

	/**
	 * @return - token and lexeme output string
	 */
	public String toString() {
		return "<"+tok()+","+lex()+">";
	}

}
