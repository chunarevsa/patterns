package com.example.patterns;

import com.example.patterns.creational.abstractFactory.AbstractFactoryProgram;
import com.example.patterns.creational.builder.BuilderProgram;
import com.example.patterns.creational.factoryMethod.FactoryMethodProgram;
import com.example.patterns.creational.prototype.PrototypeProgram;
import com.example.patterns.creational.sigleton.SingletonProgram;
import com.example.patterns.structural.adapter.AdapterProgram;
import com.example.patterns.structural.bridge.BridgeProgram;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);

		new AbstractFactoryProgram();
		new SingletonProgram();
		new FactoryMethodProgram();
		new BuilderProgram();
		new PrototypeProgram();

		new AdapterProgram();
		new BridgeProgram();

	}

}
