

public class Gerentes extends Empleado {
	public Gerentes(String nombre, String cedula, int codigo) {
		super(nombre, cedula, codigo);
		// TODO Auto-generated constructor stub
	}
	

	public void Sueldo(double salario) {
		
		this.salario=salario+(salario*((getAño() *5)/100))+getBono();
		
}
}
