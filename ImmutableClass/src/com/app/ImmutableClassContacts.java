package com.app;

/*This Java class is immutable, because its state can not be changed once created. Whenever call
 * final in class let can't apply Inheritance and polymorphism. */

public final class ImmutableClassContacts {

	private final String name;
	private final String mobile;

	public ImmutableClassContacts(String name,String mobile) {
		this.name = name;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public String getMobile() {
		return mobile;
	}
}