

public class SupervisoresTecnicos extends Empleado {
	public SupervisoresTecnicos(String nombre, String cedula, int codigo) {
		super(nombre, cedula, codigo);
	}

	public void Sueldo(double salario) {
		this.salario=salario+(salario*((getAño()*5)/100));
	}

}
