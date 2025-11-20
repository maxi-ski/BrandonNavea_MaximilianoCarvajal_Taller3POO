package Factory;

import MaximilianoCarvajal_BrandonNavea_Taller3POO.Bug;
import MaximilianoCarvajal_BrandonNavea_Taller3POO.Documentacion;
import MaximilianoCarvajal_BrandonNavea_Taller3POO.Feature;
import MaximilianoCarvajal_BrandonNavea_Taller3POO.Tarea;

public class TaskFactory {
	public static Tarea createTask(String[] partes) {
		String[] fecha = partes[7].split("-");
		switch(partes[2]) {
		case "Bug":
			return new Bug(partes[0],partes[1],partes[2],partes[3],partes[4],partes[5],partes[6],Integer.parseInt(fecha[2]),Integer.parseInt(fecha[1]),Integer.parseInt(fecha[0]));
		case"Feature":
			return new Feature(partes[0],partes[1],partes[2],partes[3],partes[4],partes[5],partes[6],Integer.parseInt(fecha[2]),Integer.parseInt(fecha[1]),Integer.parseInt(fecha[0]));
		case"Documentacion":
			return new Documentacion(partes[0],partes[1],partes[2],partes[3],partes[4],partes[5],partes[6],Integer.parseInt(fecha[2]),Integer.parseInt(fecha[1]),Integer.parseInt(fecha[0]));
		}
		return null;
	}
}
