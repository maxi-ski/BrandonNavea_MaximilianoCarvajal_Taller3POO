package MaximilianoCarvajal_BrandonNavea_Taller3POO;

import java.util.ArrayList;

import Factory.TaskFactory;
import Factory.UserFactory;

import java.util.*;
import java.io.*;

public class SistemaImpl implements Sistema{
	
	private static SistemaImpl Instance;
	public ArrayList<Tarea> tareas = new ArrayList();
	public ArrayList<Usuario>usuarios = new ArrayList<>();
	public ArrayList<Proyecto>proyectos = new ArrayList<>();
	
	private SistemaImpl() {
	}
	public static Sistema getInstance() {
		if (Instance == null) {
			 Instance = new SistemaImpl();
		}	
		else {
		return Instance;	}
		}
	
	@Override
	public void cargarUsuarios(String[] partes) {
		Usuario user = UserFactory.createUser(partes);
		usuarios.add(user);
	}
	@Override
	public void cargarProyectos(String[] partes2) {
		proyectos.add(new Proyecto(partes2[0],partes2[1],partes2[2]));	
		
	}
	@Override
	public void cargarTareas(String[] partes1) {
		Tarea t = TaskFactory.createTask(partes1);
		tareas.add(t);
		for (Proyecto p : proyectos) {
			if (t.getProyecto().equals(p.getId())) {
				p.addTareas(t);	}	}	}
	@Override
	public String verificarLogin (String usuarioIngresado, String contraseña) {
	for (Usuario u : usuarios )
		if (usuarioIngresado.equals(u.getUsername()) && contraseña.equals(u.getContraseña())) {
			System.out.println("¡Ha ingresado como "+u.getRol()+"!");
			System.out.println();
			return u.getRol();
		}
	return "Invalido";
	}
	
				
	
	public void ReporteProyectos() {
		// TODO Auto-generated method stub
		
	}
	public void AsignarPrioridades() {
		
	}
	public void AgregarProyecto() {
		
	}
	public void showInfo() {
		for(Proyecto p : proyectos) {
			for (Tarea t : p.tareasProyecto) {
				System.out.println("");	}	}
	
	}
	
	
}