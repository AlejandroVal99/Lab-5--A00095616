package model;

import java.sql.Savepoint;
import java.util.*;

import org.w3c.dom.ls.LSInput;

import processing.core.PApplet;

public class LogicBusiness {

	private PApplet app;
	private LinkedList<Perro> listPerros;
	private String[] parte1;
	private String[] parte2;
	private int ordenadoPor;
	private PerroEdadCompare perroEdadCompare;
	private PerroNombreCompare perroNombreCompare;
	private PerroFechaNCompare perroFechaCompare;
	private PerroRazaCompare perroRazaCompare;

	public LogicBusiness(PApplet app) {
		this.app = app;
		listPerros = new LinkedList<Perro>();
		parte1 = app.loadStrings("../data/Imports/datosUno.txt");
		parte2 = app.loadStrings("../data/Imports/datosDos.txt");
		crearPerros();
		perroEdadCompare = new PerroEdadCompare();
		perroNombreCompare = new PerroNombreCompare();
		perroFechaCompare = new PerroFechaNCompare();
		perroRazaCompare = new PerroRazaCompare();
	}

	public void crearPerros() {

		for (int i = 0; i < parte1.length; i++) {
			String[] datosUno = parte1[i].split(",");

			for (int j = 0; j < parte2.length; j++) {

				String[] datosDos = parte2[j].split(",");

				if (datosDos[0].equals(datosUno[0])) {

					String nombre = datosUno[1];
					String raza = datosDos[1];
					String fechaN = datosDos[2];
					int id = Integer.parseInt(datosUno[0]);
					int edad = Integer.parseInt(datosUno[2]);
					listPerros.add(new Perro(id, edad, nombre, raza, fechaN, app));
				}
			}

		}

	}

	public void sortList(int i) {
		System.out.println(i);
		switch (i) {

		case 1:// id
			Collections.sort(listPerros);
			ordenadoPor = 1;
			break;

		case 2:// nombre
			Collections.sort(listPerros, perroNombreCompare);
			ordenadoPor = 2;
			break;

		case 3:// raza
			Collections.sort(listPerros, perroRazaCompare);
			ordenadoPor = 3;
			break;

		case 4:// fecha de Nacimiento
			ordenadoPor = 4;
			Collections.sort(listPerros, perroFechaCompare);
			break;

		case 5:// Edad
			Collections.sort(listPerros, perroEdadCompare);
			ordenadoPor = 5;
			break;

		}

	}

	public LinkedList<Perro> getListPerros() {
		return listPerros;
	}

	public void setListPerros(LinkedList<Perro> listPerros) {
		this.listPerros = listPerros;
	}

	public void guardarTxt() {

		String[] nuevoTxt;
		nuevoTxt = new String[listPerros.size()];

		for (int r = 0; r < listPerros.size(); r++) {

			String id = "ID:" + listPerros.get(r).getId();
			String nombre = " Nombre:" + listPerros.get(r).getNombre().toLowerCase();
			String edad = " Edad:" + listPerros.get(r).getEdad();
			String raza = " Raza:" + listPerros.get(r).getRaza().toLowerCase();
			String fechaN = " Fecha de Nacimiento:" + listPerros.get(r).getFechaN();

			nuevoTxt[r] = id + nombre + edad + raza + fechaN;
			// System.out.println(nuevoTxt[r]);
		}

		switch (ordenadoPor) {
		
		//RECORDAR DAR REFRESH A LA CARPETA PARA VERSE LOS NUEVOS TXT
		
		case 1:
			app.saveStrings("./data/Exports/OrdenId.txt",nuevoTxt);
			System.out.println("guarde");
			break;

		case 2:
			app.saveStrings("./data/Exports/OrdenNombre.txt",nuevoTxt);
			break;

		case 3:
			app.saveStrings("./data/Exports/OrdenRaza.txt",nuevoTxt);
			break;

		case 4:
			app.saveStrings("./data/Exports/OrdenFechaN.txt",nuevoTxt);
			break;

		case 5:
			app.saveStrings("./data/Exports/OrdenEdad.txt",nuevoTxt);
			break;

		}
	}

}
