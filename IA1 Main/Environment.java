// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

// This class provides a stubbed-out environment.
// You are expected to implement the methods.
// Accessing an undefined variable should throw an exception.

// Hint!
// Use the Java API to implement your Environment.
// Browse:
//   https://docs.oracle.com/javase/tutorial/tutorialLearningPaths.html
// Read about Collections.
// Focus on the Map interface and HashMap implementation.
// Also:
//   https://www.tutorialspoint.com/java/java_map_interface.htm
//   http://www.javatpoint.com/java-map
// and elsewhere.
import java.util.Hashtable;
import java.util.Set;

public class Environment {

	private Hashtable<String, Double> variables = new Hashtable<String, Double>();
	private Set<String> keySet = variables.keySet();

	public double put(String var, double val) {
		if (variables.containsKey(var)) {
			variables.remove(var);
		}
		variables.put(var, val);
		return val;
	}

	public double get(int pos, String var) throws EvalException {
		if (variables.containsKey(var))
			return variables.get(var);

		return pos;
	}

	public String toC() {
		String s = "";
		String sep = " ";
		for (String v : keySet) {
			s += sep + v;
			sep = ",";
		}
		return s == "" ? "" : "double" + s + ";\nx=0;x=x;\n";
	}

}
