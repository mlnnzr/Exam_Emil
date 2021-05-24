package controlVersiones;

/*
 *autor Emil
 *version Version 1, 2021
 *since 24/05/2021
 *
 */

public class Empleado {
	
	/*
	 * Nombre: Nombre del empleado
	 * Apellidos: apellidos del empleado
	 * salario: salario del empleado
	 */
	
	private String nombre;
	private String apellidos;
	private double salario; 


public Empleado(String nombre, String apellido, double salario) {
	this.nombre = nombre;
	this.apellidos = apellido;
	this.salario = salario;
}


/*
 * recoge el nombre del empleado
 */
public String getNombre() {
	return nombre;
}


/*
 * escribe el nombre del empleado
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellidos() {
	/*
	 * recoge los apellidos del empleado
	 */
	
	return apellidos;
}

public void setApellidos(String apellidos) {
/*
 * escribe los apellidos del empleado
 */
	
	this.apellidos = apellidos;
}


public double getSalario() {
	/*
	 * recoge el salario del empleado
	 */
	return salario;
}


public void setSalario(double salario) {
	/*
	 * recoge el salario del empleado
	 */
	this.salario = salario;
}



public void subirsalario (double subida) {
	/*
	 * este metodo añade la subida al salario de un trabajador,
	 * y lo vuelve el nuevo salario del mismo
	 */
	salario=salario+subida;
}


}