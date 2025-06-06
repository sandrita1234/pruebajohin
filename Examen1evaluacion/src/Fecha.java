import java.util.Calendar;

public class Fecha {
	private int dia,mes,agno;
	Fecha(){}
	public Fecha(int dia, int mes, int agno) {
		this.dia = dia;
		this.mes = mes;
		this.agno = agno;
	}

	public boolean mismoAgno(int i, int j, int k) {
		if (agno==k) {
			System.out.println("Es el mismo año");
			return true;
		}
			System.out.println("No es el mismo año");
			return false;
			
	}
		
	       
	void fechaActual() {
	agno=Calendar.getInstance().get(Calendar.YEAR);
	mes=1+Calendar.getInstance().get(Calendar.MONTH);
	dia=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	
			
	}
	public static void main(String[] args) {
		Fecha obj=new Fecha();
		
		obj.mismoAgno(1,1,2025);
		

	}

}
