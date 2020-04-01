package model;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class PerroFechaNCompare implements Comparator<Perro>{
	


	public PerroFechaNCompare() {
		// TODO Auto-generated constructor stub
	}

	
	public int compare(Perro o1, Perro o2) {
		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date perro1 = null;
        Date perro2 = null;
           try {
           perro1 = df.parse(o1.getFechaN());
           perro2 = df.parse(o2.getFechaN());
           } catch (Exception e) {
           e.printStackTrace();
           }    
             return perro1.compareTo(perro2);
	}

}
