package view;

import controller.MainController;
import processing.core.PApplet;

public class MainView extends PApplet {
	
	private MainController controller;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.MainView");
	}
	
	public void settings() {
		size(700, 550);
		
	}
	
	public void setup() {
		
		controller = new MainController(this);
		
		
	}
	
	public void draw() {
		background(0);
		fill(255);
		for (int i = 0; i < controller.listPerros().size(); i++) {
			controller.listPerros().get(i).draw((i*50)+60);	
		}
		
		pintarBotones();
		pintarTitulo();
		
	}
	

	private void pintarTitulo() {
		fill(255);
		text("ID", 93, 30);
		text("Nombre", 150, 30);
		text("Edad", 240, 30);
		text("Raza", 300, 30);
		text("Fecha de Nacimiento", 440, 30);
		
	}

	public void mousePressed() {
		controller.sortList();
		controller.guardarTxt();
		
		System.out.println("X "+mouseX+" Y "+mouseY);
		
	}

	private void pintarBotones() {
		fill(255);
		text("Ordenar por:", 580, 100);
		
		rect(580, 110, 70, 30);
		fill(0);
		text("ID", 610, 130);
		
		fill(255);
		rect(580, 150, 70, 30);
		fill(0);
		text("Nombre", 595, 170);
		
		fill(255);
		rect(580, 190, 70, 30);
		fill(0);
		text("Raza", 600, 210);
		
		fill(255);
		rect(580, 230, 115, 30);
		fill(0);
		text("Fecha de Nacimiento", 581, 250);
		
		fill(255);
		rect(580, 270, 70, 30);
		fill(0);
		text("Edad", 600, 290);
		
		fill(255);
		rect(580, 490, 90, 30);
		fill(0);
		text("Guardar Archivo", 582, 510);
		
	}

}
