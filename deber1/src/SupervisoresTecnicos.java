

public class SupervisoresTecnicos extends Empleado {
	public SupervisoresTecnicos(String nombre, String cedula, int codigo) {
		super(nombre, cedula, codigo);
	}

	public void Sueldo(double salario) {
		this.salario=salario+(salario*((getA�o()*5)/100));
	}

}
