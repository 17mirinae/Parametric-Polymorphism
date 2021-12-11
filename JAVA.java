// JAVA Parametric Polymorphism Example

class printValue<T> {
	T value;

	public void print() {
		System.out.println("Value = " + value);
	}
}

public class Programming_Language {
	public static void main(String[] args) {
		printValue<String> strVal = new printValue<String>();
		printValue<Integer> intVal = new printValue<Integer>();
		
		strVal.value = "Hello Value";
		intVal.value = 100;
		
		strVal.print();
		intVal.print();
	}
}
