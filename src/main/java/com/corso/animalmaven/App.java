package com.corso.animalmaven;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) 
	{
		System.out.println( "Hello World!" );
        
        List<Animal> animals = new ArrayList<Animal>();
        
        animals.add(new Animal(1, "Lilli", 2));
        animals.add(new Animal(2, "Pippo", 5));
        animals.add(new Animal(3, "Pluto", 7));
        
        System.out.println(animals);

	}

}
