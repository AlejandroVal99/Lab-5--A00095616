package model;

import processing.core.PApplet;

public class Perro implements Comparable<Perro>{
	
	private int edad;
	private int id;
	private String nombre;
	private String raza;
	private String fechaN;
	private int posX;
	private int posY;
	private PApplet app;
	
	
	
	
	public Perro(int id, int edad, String nombre, String raza, String fechaN, PApplet app) {
		
		this.edad = edad;
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.fechaN = fechaN;
		this.app = app;
		this.posX = 60;
		
		
	}
	
	public void draw(int posY) {
		
		app.ellipse(posX, posY, 30, 30);
		app.text(id, posX + 40, posY + 8);
		app.text(nombre,posX + 90 , posY + 8);
		app.text(edad,posX + 190 , posY + 8);
		app.text(raza,posX + 240 , posY + 8);
		app.text(fechaN,posX + 380 , posY + 8);
		
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getFechaN() {
		return fechaN;
	}

	public void setFechaN(String fechaN) {
		this.fechaN = fechaN;
	}

	@Override
	public int compareTo(Perro perroSig) {
		return this.id - perroSig.getId();
	}

}
