package com.himart;

public class Computer extends Product {

	private int size; // 용량
	private String cpu;

	public Computer() {

		this.size = 256;
		this.cpu = "i7";
		this.setBrand("Apple");
		this.setColor("Silver");
		this.setPrice(200);
		this.setPoint(20);

	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

}
