// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

import java.util.Hashtable;
import java.util.Set;

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
public class Environment {

	private Hashtable<String, Double> variables = new Hashtable<String, Double>();
	private Set<String> keySet = variables.keySet();

	/**
	 * Puts var and val within a single hashtable or updates the value
	 * if already within hashtable
	 * 
	 * @param var
	 * @param val 
	 * @return - val double
	 */
	public double put(String var, double val) {
		if (variables.containsKey(var)) {
			variables.remove(var);
		}
		variables.put(var, val);
		return val;
	}

	/**
	 * @param pos
	 * @param var
	 * @return - if var is already present return val otherwise return pos given
	 */
	public double get(int pos, String var) throws EvalException {
		if (variables.containsKey(var))
			return variables.get(var);

		return pos;
	}

	/**
	 * @return - declaration of variables within C code
	 */
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
