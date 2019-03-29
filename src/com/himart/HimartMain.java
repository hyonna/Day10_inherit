package com.himart;

public class HimartMain {

	public static void main(String[] args) {

		Tv tv = new Tv();
		Computer computer = new Computer();
		Handphone handphone = new Handphone();
		HimartView himartView = new HimartView();
		Customer customer = new Customer();
		
		
		Product[] products = new Product[3];
		products[0] = tv;
		products[1] = handphone;
		products[2] = computer;
		

//		himartView.view(tv);
//		himartView.view(computer);
//		himartView.view(handphone);

//		Tv[] tvs = new Tv[3];
//		tvs[0] = new Tv();
//		tvs[1] = new Tv();
//		tvs[2] = new Tv();
//		
//		
//		
//		customer.buy(handphone);
//		
//		Product p = tv;
//		
//		((Tv)p).getInch();
//		
//		p = new Product();
//		((Tv)p).getInch();
//		
//		System.out.println(p.getBrand());
//		System.out.println(p.getPrice());
//		System.out.println(((Tv)p).getInch());
		

	}

}
