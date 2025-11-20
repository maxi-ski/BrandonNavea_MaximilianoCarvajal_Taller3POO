package MaximilianoCarvajal_BrandonNavea_Taller3POO;

public abstract class Usuario  {
	
	protected String Username, contraseña, rol;

	public Usuario(String username, String contraseña, String rol) {
		super();
		Username = username;
		this.contraseña = contraseña;
		this.rol = rol;
	}

	public String getUsername() {
		return Username;
	}

	public String getContraseña() {
		return contraseña;
	}

	public String getRol() {
		return rol;
	}
	
	

}
