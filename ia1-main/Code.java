// Tony Nielsen
// CS 354 - IA1
// 10-11-2022

import java.io.*;

/*
 * Creates a C file from a inputed program.
 */
public class Code {

	/**
	 * @return - the start of the assembled C code
	 */
	private final String[] prologue={
		"#include <stdio.h>",
		"int main() {",
	};

	/**
	 * @return - the end of the assembled C code
	 */
	private final String[] epilogue={
		"return 0;",
		"}",
	};

	/**
	 * Creates the C file and then populates it with translated C code.
	 * 
	 * @param env
	 * @param code
	 */
	public Code(String code, Environment env) {
		String fn=System.getenv("Code");
		if (fn==null)
			return;
		try {
			BufferedWriter f=new BufferedWriter(new FileWriter(fn+".c"));
			for (String s: prologue)
				f.write(s+"\n");
			f.write(env.toC());
			f.write(code);
			for (String s: epilogue)
				f.write(s+"\n");
			f.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
