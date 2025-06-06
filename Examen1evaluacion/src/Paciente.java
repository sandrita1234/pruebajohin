import java.util.Random;
import java.util.Scanner;

public class Paciente {
	



	public static void main(String[] args) {
	Random rand = new Random();	
	int opc=0;
	Scanner sc= new Scanner (System.in);
		  do {
			 System.out.println("Da un numero del listado");
				System.out.println("1.-Ingreso del paciente");
				System.out.println("2.-Alta del paciente");
				System.out.println("3.-Numero total de habitaciones libres");
				System.out.println("4.-Listado de pacientes ");
				System.out.println("0.-Fin");
				opc=sc.nextInt();
				switch(opc) {
				case 1:
					int iden= rand.nextInt(6);
					System.out.println("identificador: "+ iden);
					System.out.println("Ingrese 1- urgente o 2-planeado");
					int opcion=sc.nextInt();
					if (opcion==1) {
						System.out.println("Tipo de ingreso urgente");
					}if (opcion==2){
						System.out.println("Tipo de ingreso planeado");
					}if(opcion!=1 && opcion!=2){
						System.out.println("No es valido ese numero");
					}
					break;      
				case 2:
					System.out.println("ingrese su identificador");
					int identificador= sc.nextInt();
					
				
					
					
				case 3: 
				case 4:
				}
		  }
	}
}
	
	


