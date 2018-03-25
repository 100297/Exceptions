package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double a, double b) throws IllegalArgumentException {
		if (b == 0) {
			throw new IllegalArgumentException();
		} else {
			return a / b;
		}

	}

	public String reverseString(String a1) {
		String reverseWord = "";
		if (a1 == "") {
			throw new IllegalArgumentException();
		} else {
			for (int i = a1.length() - 1; i > -1; i++) {
				reverseWord += a1.charAt(i);
			}
			return reverseWord;
		}
	}

}