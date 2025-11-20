/* Maximiliano Carvajal 22.090.639-6
 * Brandon Navea 
 */

package MaximilianoCarvajal_BrandonNavea_Taller3POO;
import java.util.*;
import java.io.*;
public class app {
	
	static Sistema sys = SistemaImpl.getInstance();
	 
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[]args) throws FileNotFoundException {
		
		textoUsuarios();
		textoProyectos();
		textoTareas();
		
		while (true) {
			System.out.print("Ingrese su Username: ");
			String inputUser = s.nextLine();
			System.out.print("Ingrese su Contraseña: ");
			String inputPassword = s.nextLine();
			String rol = sys.verificarLogin(inputUser, inputPassword);
			
			switch (rol) {
			case "Administrador":
				subMenuAdmin();
				int op = escogerOpcion();
				sys.accionesAdmin(op);
				
				break;
				
			case "Colaborador":
				subMenuColaborador();
				int o = escogerOpcion();
				sys.accionesColab(o);
				break;
				
			case "Invalido" :
				System.out.println("Contraseña incorrecta, intente nuevamente.");
				break;
			}
		}
	}
	public static void textoProyectos() throws FileNotFoundException {
		Scanner scan1 = new Scanner(new File("proyectos.txt"));
		
		while (scan1.hasNextLine()) {
		String[] Partes1 = scan1.nextLine().split("\\|");
		sys.cargarProyectos(Partes1);
		}	
		scan1.close();
	}
	public static void textoTareas() throws FileNotFoundException {
		Scanner scan2 = new Scanner(new File("tareas.txt"));
		while (scan2.hasNextLine()) {
			String[] Partes2 = scan2.nextLine().split("\\|");
		sys.cargarTareas(Partes2);
		}
		scan2.close();
	}
	public static void textoUsuarios() throws FileNotFoundException {
		Scanner scan3 = new Scanner(new File("usuarios.txt"));
		while (scan3.hasNextLine()) {
		String[] Partes3 = scan3.nextLine().split("\\|");
		sys.cargarUsuarios(Partes3);
		}
		scan3.close();
	}
	public static void subMenuAdmin() {
		System.out.println("---------------------- Menú Administrador ----------------------");
		System.out.println("1) Ver lista completa de proyectos y tareas:");
		System.out.println("2) Agregar o eliminar un proyecto");
		System.out.println("3) Asignar prioridades con Strategy");
		System.out.println("4) Generar reporte de proyectos");
	}
	public static void subMenuColaborador() {
		System.out.println("---------------------- Menú Usuario ----------------------");
		System.out.println("1) Ver proyectos disponibles");
		System.out.println("2) Ver tareas asignadas");
		System.out.println("3) Actualizar estado de una tarea");
		System.out.println("4) Aplicar visitor sobre tareas");
	}
	public static int escogerOpcion() {
		System.out.print("> ");
		int opcion = Integer.parseInt(s.nextLine());
		System.out.println();
		return opcion;	
	}
	public void accionesAdmin(int op) {
		switch(op) {
		case 1:
			sys.showInfo();
			break;
		case 2:
			sys.AgregarProyecto();
			break;
		case 3:
			sys.AsignarPrioridades();
			break;
		case 4:
			sys.ReporteProyectos();
			break;
		}		
	}
	public void accionesColab(int o) {
		switch(o) {
		case 1:
			sys.verProyectos();
			break;
		case 2:
			sys.tareasAsignadas();
			break;
		case 3:
			sys.actualizarTarea();
			break;
			
		case 4:
			sys.visitorTareas();
			break;
		}	
	}
}
