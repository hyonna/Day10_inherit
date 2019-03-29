package com.zoo;

public class Lion extends Animal {

	private int tooth;
	
	public Lion() {
		super();
	}
	
	


	public int getTooth() {
		return tooth;
	}




	public void setTooth(int tooth) {
		this.tooth = tooth;
	}


	public void eat() {
		
		
	}


//	public void eat() {
//		
//		//오버라이딩
//		super.eat();
//		System.out.println("챱챱챱");
//		
//	}

	
	public static void main(String[] args) {
		
		Lion lion = new Lion();
		lion.eat();
		
		
		
		
	}
	
	
}
