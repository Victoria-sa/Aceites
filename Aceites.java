package aceites;


import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;



public class Aceites {

	public Aceites() {
		
	}

	public static void main(String[] args) {
		
		Scanner lector=new Scanner(System.in);
		int cantidad,  precio;
		int codigo;
		System.out.println();
		
		boolean salir=false;
		int contador=0;//Refleja el numero de Factura, 
		do {
			System.out.println("+---------------+");
			System.out.println("|  Menu Pricipal|");
			System.out.println("|1.Facturacion  |");
			System.out.println("|2. Salir       |");
			System.out.println("|               |");
			System.out.println("+---------------+");
			System.out.println("Indica tu opcion ------>");
			int opcion = lector.nextInt();
			
	switch (opcion)	{
	case 1 -> {
		contador++;
		System.out.println("Codigo del Producto ::");
		codigo=lector.nextInt();
		System.out.println("Cantidad de litros ::");
		cantidad=lector.nextInt();
		System.out.println("Precio del litro ::");
		precio=lector.nextInt(); 
        
		
		
		
		salir=false;
       
		
		int total=cantidad*precio;
		
		System.out.println("+-----------------------+");
		System.out.println("|Factura ::"  +contador   );
	    System.out.println("|Codigo :: "  +codigo     );
		System.out.println("|Cantidad :: "+cantidad   );
		System.out.println("|Precio/l ::" +precio     );
		System.out.println("Total Factura :: "+total+" € ");
		System.out.println("+-----------------------+");
		total=lector.nextInt();
	}
	case 2->
	salir=true;
	default -> {
	
	System.out.println("Opcion no valida ");
	salir= false;
	
	}
	
		}
		}
	while (!salir);
		
			
		}
		
		
		
		
	}	
		
		
		
	

