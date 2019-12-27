package org.szh.test.jdk8;

public class Person {
	private String id;

	private String name;

	private boolean sex;

	public Person() {
	}

	public Person(String name, boolean sex) {
		this.name = name;
		this.sex = sex;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}
}
