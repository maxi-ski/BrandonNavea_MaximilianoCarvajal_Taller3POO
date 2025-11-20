package MaximilianoCarvajal_BrandonNavea_Taller3POO;

public class Documentacion extends Tarea {

	public Documentacion(String proyecto, String id, String tipo, String descripcion, String estado, String responsable,
			String complejidad, int año, int mes, int dia) {
		super(proyecto, id, tipo, descripcion, estado, responsable, complejidad, año, mes, dia);
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
