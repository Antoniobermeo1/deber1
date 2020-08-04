import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
public class Empresa {

	
	
	/*public void contratar(Empleado empleado) {
		empleados.add(empleado);
		empleados.add(empleado);
	}*/
	
	public static double  diaDePago(ArrayList<Empleado>empleados) {
		double salario=0;
		for(int i = 0; i<empleados.size();i++) {
			Empleado emp = empleados.get(i);
			if(emp instanceof Oficinista) {
				Oficinista empofi = (Oficinista) emp;
			}
			else if(emp instanceof SupervisoresTecnicos) {
				SupervisoresTecnicos empsut = (SupervisoresTecnicos) emp;
			} 
			else if(emp instanceof Gerentes){
				Gerentes empge = (Gerentes) emp;
			}
			salario +=emp.getSalario();
		}
		return salario;
	}

	public static void main(String[] args) {
		double salario, año, bono;
		ArrayList<Empleado>empleados = new ArrayList<>();
		Empleado emp1 = new Oficinista("Juan", "0976252429", 801);
		Empleado emp2 = new SupervisoresTecnicos("Carlos", "0909578711", 954);
		Empleado emp3 = new Gerentes("Marcos", "0963218623",140);
		Empleado emp4 = new SupervisoresTecnicos("sebastian", "09475241672",960);
		Empleado emp5 = new Oficinista("josh", "0958726132",812);
		Empleado emp6 = new Gerentes("valeria", "0932124154",130);
		
		System.out.println("Ingrese el salario:");
		Scanner entrada = new Scanner(System.in);
		salario = entrada.nextInt();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese los años laborales:");
		Scanner entrada1 = new Scanner(System.in);
		año = entrada.nextInt();
		Scanner in1 = new Scanner(System.in);
		
		System.out.println("Ingrese el bono:");
		Scanner entrada2 = new Scanner(System.in);
		bono = entrada.nextInt();
		Scanner in2 = new Scanner(System.in);
		
		
		emp1.Sueldo(salario);
		emp2.Sueldo(salario); 
		emp3.Sueldo(salario);
		emp4.Sueldo(salario);
		emp5.Sueldo(salario);
		emp6.Sueldo(salario);
		
		
		empleados.add(emp1);
		empleados.add(emp2);
		empleados.add(emp3);
		empleados.add(emp4);
		empleados.add(emp5);
		empleados.add(emp6);
		
		System.out.println(diaDePago(empleados));
		
	}
	
}
