package com.Exception;

class FnameLnameException1 extends Exception {

	public FnameLnameException1(String s) {
		super(s);
	}
}

public class FnameLnameException {
	void checkNames(String firstN, String lastN) throws FnameLnameException1 {
		if (firstN == null && lastN == null) {
			throw new FnameLnameException1("Invalid name");
		} else {
			System.out.println(firstN.concat(lastN));
		}
	}

	public static void main(String[] args) {
		FnameLnameException n = new FnameLnameException();
		try {
			n.checkNames(null, "sonu");
		} catch (Exception e) {
			System.out.println("Exception occur");
			System.out.println(e.getMessage());
		}
	}
}
