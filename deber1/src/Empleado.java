import java.util.Scanner;

public abstract class Empleado extends Empresa {
	String nombre, cedula;
	int codigo;
	double salario, año, bono;
	
	public Empleado(String nombre, String cedula, int codigo) {
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getSalario() {
		return salario;
	}
	
	public double getAño() {
		return año;
	}


	public double getBono() {
		return bono;
	}

	public void Año(double año) {
	}
	
	public void Bono(double bono) {
	}
	
	public abstract void Sueldo(double salario);
	
}
