package com.corso.animalmaven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException 
	{
		System.out.println( "Hello World!" );
        
        List<Animal> animals = new ArrayList<Animal>();
        
        animals.add(new Animal(1, "Lilli", 2));
        animals.add(new Animal(2, "Pippo", 5));
        animals.add(new Animal(3, "Pluto", 7));
        
        System.out.println(animals);
        
        Scanner reader = new Scanner(new File("prova.txt"));
        String hello = "";
        while(reader.hasNextLine())
        	hello = reader.nextLine();
        
        System.out.println(hello);
        reader.close();

	}

}
