// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

/*
 * Currently unused
 */
public class NodeFactId extends NodeFact {

	private String id;

	public NodeFactId(int pos, String id) {
		this.pos=pos;
		this.id=id;
	}

	public double eval(Environment env) throws EvalException {
		return env.get(pos,id);
	}

	public String code() { return id; }

}
