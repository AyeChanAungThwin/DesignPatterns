package io.github.ayechanaungthwin.design_patterns.creational.factory;

public class DatabaseFactory {

	public static Connection getConnection(Database database) {
		Connection connection = null;
		switch (database) {
		case MySQL:
			connection = new MySQL();
			break;

		case MyOracle:
			connection = new MyOracle();
			break;
		}
		
		return connection;
	}
}
