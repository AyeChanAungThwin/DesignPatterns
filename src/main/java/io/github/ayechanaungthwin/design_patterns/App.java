package io.github.ayechanaungthwin.design_patterns;

import java.util.List;

import io.github.ayechanaungthwin.design_patterns.creational.abstract_factory.AbstractDatabaseFactory;
import io.github.ayechanaungthwin.design_patterns.creational.factory.Connection;
import io.github.ayechanaungthwin.design_patterns.creational.factory.Database;
import io.github.ayechanaungthwin.design_patterns.creational.factory.DatabaseFactory;
import io.github.ayechanaungthwin.design_patterns.creational.factory.MyOracle;
import io.github.ayechanaungthwin.design_patterns.creational.factory.MySQL;
import io.github.ayechanaungthwin.design_patterns.creational.singleton.Singleton;

public class App {
    
	public static void main( String[] args ) {
		//singleton();
		//factory();
		abstractFactory();
    }

	public static void singleton() {
		//It will create an instance only once!
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
	}
	
	public static void factory() {
		//Program to interface, not implementation
		Connection mySQL = DatabaseFactory.getConnection(Database.MySQL);
		Connection myOracle = DatabaseFactory.getConnection(Database.MyOracle);
		
		System.out.println();
		
		List<Connection> connections = List.of(mySQL, myOracle);
		for (Connection out: connections) {
			out.connect();
		}
	}
	
	public static void abstractFactory() {
		Connection mySQL = new AbstractDatabaseFactory(new MySQL()).getConnection();
		Connection myOracle = new AbstractDatabaseFactory(new MyOracle()).getConnection();
		
		System.out.println();
		
		List<Connection> connections = List.of(mySQL, myOracle);
		for (Connection out: connections) {
			out.connect();
		}
	}
}
