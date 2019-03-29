package com.himart;

public class Handphone extends Product {

	private int inch;
	private String name; // 기종명

	public Handphone() {

		this.inch = 10;
		this.name = "s10";
		this.setBrand("Samsung");
		this.setColor("Pink");
		this.setPrice(100);
		this.setPoint(10);

	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
