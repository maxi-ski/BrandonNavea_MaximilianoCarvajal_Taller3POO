package MaximilianoCarvajal_BrandonNavea_Taller3POO;

public interface Sistema {
	
	void SistemaImpl();
	Sistema getInstance();
	void cargarUsuarios(String[] partes);
	void cargarProyectos(String[] partes2);
	void cargarTareas(String[] partes1);
	String verificarLogin(String usuarioIngresado, String contraseña);
	void ReporteProyectos();
	void AsignarPrioridades();
	void AgregarProyecto();
	void showInfo();
}
