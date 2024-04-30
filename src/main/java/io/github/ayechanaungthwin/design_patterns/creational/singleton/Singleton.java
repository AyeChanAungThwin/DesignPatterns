package io.github.ayechanaungthwin.design_patterns.creational.singleton;

public class Singleton {

	private static Singleton instance = null;
	
	private Singleton() {
		System.out.println("Single instance has been created!");
	}
	
	public static Singleton getInstance() {
		if (instance==null) {
			synchronized (Singleton.class) {
				if (instance==null) instance = new Singleton();
			}
		}
		return instance;
	}
}
