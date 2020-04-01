package model;

import java.util.Comparator;

public class PerroNombreCompare implements Comparator<Perro>{

	public PerroNombreCompare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Perro o1, Perro o2) {

		return o1.getNombre().compareTo(o2.getNombre());
	}

}
