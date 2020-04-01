package model;

import java.util.Comparator;

public class PerroEdadCompare implements Comparator<Perro>{

	public PerroEdadCompare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Perro o1, Perro o2) {
		return o1.getEdad() - o2.getEdad();
	}

}
