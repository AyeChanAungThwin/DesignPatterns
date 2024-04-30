package io.github.ayechanaungthwin.design_patterns.creational.factory;

public class MySQL implements Connection {

	public MySQL() {
		System.out.println("MySQL is created!");
	}
	
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("MySQL is connected!");
	}

}
