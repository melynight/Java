package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Empleado[] empleados = new Empleado[5];
		
		empleados[0] = new Empleado();
		empleados[1] = new Empleado("Jose",33);
		empleados[2] = new Empleado();
		empleados[3] = new Empleado("Perla",19);
		empleados[4] = new Empleado("Carlos",55);
		
		
		for (Empleado emp : empleados ) {
            System.out.println(emp);
        }
		
		
								}
					
														}
