package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;

public class Empleado {

	private String nombre;
	private double salario;
	private String cargo;
	private ArrayList<Prestamo> listaPrestamos;
	private int aniosExperiencia;

	/**
	 * Es el constructor del empleado
	 * 
	 * @param nombre
	 * @param salario
	 * @param cargo
	 */
	public Empleado(String nombre, double salario, String cargo) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.cargo = cargo;
		this.listaPrestamos = new ArrayList<Prestamo>();
	}

	/**
	 * Es el constructor del empleado sin parámetros
	 */
	public Empleado() {

	}

	/**
	 * Obtiene el nombre del empleado
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el nombre del empleado
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene la lista de préstamos del empleado
	 * 
	 * @return
	 */
	public ArrayList<Prestamo> getListaPrestamos() {
		return listaPrestamos;
	}

	/**
	 * Cambia la lista de préstamos del empleado
	 * 
	 * @param listaPrestamos
	 */
	public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
		this.listaPrestamos = listaPrestamos;
	}

	/**
	 * Obtiene el salario del empleado
	 * 
	 * @return
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * Cambia el salario del empleado
	 * 
	 * @param salario
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * Obtiene el cargo del empleado
	 * 
	 * @return
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * Cambia el cargo del empleado
	 * 
	 * @param cargo
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * Obtiene los años de experiencia del emleado
	 * 
	 * @return
	 */
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	/**
	 * Cambia los años de experiencia del emleado
	 * 
	 * @param aniosExperiencia
	 */
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + ", cargo=" + cargo + ", listaPrestamos="
				+ listaPrestamos + ", aniosExperiencia=" + aniosExperiencia + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
