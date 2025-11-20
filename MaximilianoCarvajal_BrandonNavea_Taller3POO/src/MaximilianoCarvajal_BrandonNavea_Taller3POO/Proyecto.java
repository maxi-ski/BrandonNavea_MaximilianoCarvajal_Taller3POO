package MaximilianoCarvajal_BrandonNavea_Taller3POO;

import java.util.*;
public class Proyecto {
	private String id,nombre,responsable;
	ArrayList<Tarea> tareasProyecto = new ArrayList<>();

	public Proyecto(String id, String nombre, String responsable) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.responsable = responsable;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getResponsable() {
		return responsable;
	}
	
	public void addTareas(Tarea t) {
		getTareasProyecto().add(t);
	}

	public ArrayList<Tarea> getTareasProyecto() {
		return tareasProyecto;
	}

	
}
