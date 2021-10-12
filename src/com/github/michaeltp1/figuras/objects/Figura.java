package com.github.michaeltp1.figuras.objects;


public abstract class Figura implements Cloneable {
	final int A=5;

	 abstract float area();
	 abstract float perimetro();
	 public abstract Figura clonar();
	public int getA() {
		return A;
	}
	
}
