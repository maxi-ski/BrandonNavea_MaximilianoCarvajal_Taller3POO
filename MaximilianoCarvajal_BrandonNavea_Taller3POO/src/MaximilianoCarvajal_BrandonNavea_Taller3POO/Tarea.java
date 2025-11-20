package MaximilianoCarvajal_BrandonNavea_Taller3POO;

public abstract class Tarea {
	
	protected String proyecto,id,tipo,descripcion,estado,responsable,complejidad;
	protected int año,mes,dia;
	
	public Tarea(String proyecto, String id, String tipo, String descripcion, String estado, String responsable,
			String complejidad, int año, int mes, int dia) {
		super();
		this.proyecto = proyecto;
		this.id = id;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.estado = estado;
		this.responsable = responsable;
		this.complejidad = complejidad;
		this.año = año;
		this.mes = mes;
		this.dia = dia;
	}

	protected String getProyecto() {
		return proyecto;
	}

	protected String getId() {
		return id;
	}

	protected String getTipo() {
		return tipo;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected String getEstado() {
		return estado;
	}

	protected String getResponsable() {
		return responsable;
	}

	protected String getComplejidad() {
		return complejidad;
	}

	protected int getAño() {
		return año;
	}

	protected int getMes() {
		return mes;
	}

	protected int getDia() {
		return dia;
	}
	
}
