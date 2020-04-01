package model;

import java.util.Comparator;

public class PerroRazaCompare implements Comparator<Perro> {

	public PerroRazaCompare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Perro o1, Perro o2) {
		return o1.getRaza().compareTo(o2.getRaza());
	}

}
