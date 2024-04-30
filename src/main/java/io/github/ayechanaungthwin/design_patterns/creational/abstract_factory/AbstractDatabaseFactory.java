package io.github.ayechanaungthwin.design_patterns.creational.abstract_factory;

import io.github.ayechanaungthwin.design_patterns.creational.factory.Connection;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class AbstractDatabaseFactory {

	@Getter
	private Connection connection;
}
