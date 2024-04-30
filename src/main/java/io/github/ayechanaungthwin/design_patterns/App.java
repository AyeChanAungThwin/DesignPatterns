package io.github.ayechanaungthwin.design_patterns;

import io.github.ayechanaungthwin.design_patterns.creational.singleton.Singleton;

public class App {
    
	public static void main( String[] args ) {
		Singleton();
    }

	public static void Singleton() {
		//It will create an instance only once!
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
	}
		
}
