package controller;

import java.util.LinkedList;

import model.LogicBusiness;
import model.Perro;
import processing.core.PApplet;

public class MainController {
	
	private PApplet app;
	
	private LogicBusiness logic;

	public MainController(PApplet app) {
		this.app = app;
		logic = new LogicBusiness (app);
	}

	public void sortList() {
		
		if(app.mouseX > 580 && app.mouseX < 650 && app.mouseY > 110 && app.mouseY < 140) {
			logic.sortList(1);
		}else if(app.mouseX > 580 && app.mouseX < 650 && app.mouseY > 150 && app.mouseY < 180) {
			logic.sortList(2);
		}else if(app.mouseX > 580 && app.mouseX < 650 && app.mouseY > 190 && app.mouseY < 220) {
			logic.sortList(3);
		}else if(app.mouseX > 580 && app.mouseX < 650 && app.mouseY > 230 && app.mouseY < 260) {
			logic.sortList(4);
		}else if(app.mouseX > 580 && app.mouseX < 650 && app.mouseY > 270 && app.mouseY < 300) {
			logic.sortList(5);
		}
		
	}
	
	public void guardarTxt() {
		
		if(app.mouseX > 580 && app.mouseX < 670 && app.mouseY > 490 && app.mouseY < 520) {
			logic.guardarTxt();
		}
		
	}

	public LinkedList<Perro> listPerros() {
		return logic.getListPerros();
	}

}
