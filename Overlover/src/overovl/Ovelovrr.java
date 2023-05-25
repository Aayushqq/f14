package overovl;

class Over {
	void overr(int a, int b) {
		System.out.println(a + b);
	}// same name different parameter with inn same class///

	void overr(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}

class A extends Over {
	void meth() {
		System.out.println("Redifine childish class");

	}

}

public class Ovelovrr {
	public static void main(String[] args) {
		A ob = new A();
		ob.meth();
	}
}
