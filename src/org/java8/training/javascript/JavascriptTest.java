package org.java8.training.javascript;

import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavascriptTest {

	public static void main(String[] args) throws Exception {
		ScriptEngineManager engineManager = new ScriptEngineManager();
		ScriptEngine engine = engineManager.getEngineByName("nashorn");
		engine.eval(" function show(){"
				+ "print(\"Hellow World!!\"); }show();");
		
		engine.eval(new FileReader("/Users/eppra01/eclipse-workspace/Java8Examples/src/script.js"));
		Invocable invocable = (Invocable) engine;
		Object result = invocable.invokeFunction("show"); 
		System.out.println(result);
		System.out.println(result.getClass());
		 

	}

}
