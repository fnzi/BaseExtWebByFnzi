package test.groovy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.RETURN;

class TestGroovy {

	@Test
	public void test() {
		MissMethod mm = new MissMethod();
		assert "this is hello method..." == mm.hello()
		
		print mm.hello('1', '2')
	}
}

class MissMethod {

	def hello() {
		return "this is hello method..."
	}

	def methodMissing(String name,args) {
		return "run methodMissing: unknown method $name(${args.join(',')})"
	}
}
