package com.example;

public class CodeEX {
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CodeEX [name=" + name + "]";
	}

	public CodeEX(String name) {
		super();
		this.name = name;
	}

}
