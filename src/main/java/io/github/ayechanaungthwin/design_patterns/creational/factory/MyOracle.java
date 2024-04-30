package io.github.ayechanaungthwin.design_patterns.creational.factory;

public class MyOracle implements Connection {

	public MyOracle() {
		System.out.println("MyOracle is created!");
	}
	
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("MyOracle is connected!");
	}

}
