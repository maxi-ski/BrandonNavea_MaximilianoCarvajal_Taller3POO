package Factory;

import MaximilianoCarvajal_BrandonNavea_Taller3POO.Administrador;
import MaximilianoCarvajal_BrandonNavea_Taller3POO.Colaborador;
import MaximilianoCarvajal_BrandonNavea_Taller3POO.Usuario;

public class UserFactory {
	
	public static Usuario createUser(String[] partes) {
		switch(partes[2]) {
		case"Administrador":
			return new Administrador(partes[0], partes[1], partes[2]);
		case"Colarborador":
			return new Colaborador (partes[0], partes[1], partes[2]);
		}
		return null;
	}

}
