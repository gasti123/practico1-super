package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner lector = new Scanner (System.in);

	System.out.println("Ingrese el Tamaño de la Casa:");
    int TamañoCasa = lector.nextInt();
    System.out.println("Ingrese el Coste de Construccion de la Casa:");
    int CosteConstruccionCasa = lector.nextInt();
	System.out.println("Ingrese el Material que se uso para la Casa:");
    String Material = lector.next();
    System.out.println("Ingrese la Cantidad de Habitaciones:");
    int CantHabit = lector.nextInt();
   
    Casa casa1 = new Casa(TamañoCasa,CosteConstruccionCasa,Material,CantHabit);
    System.out.println("------------------------------------");
    System.out.println("Ingrese el Tamaño del Apartamento:");
    int TamañoApartamento = lector.nextInt();
    System.out.println("Ingrese el Coste de Construccion del Apartamento:");
    int CosteConstruccionApartamento = lector.nextInt();
	System.out.println("Ingrese el Numero de Pisos:");
	int NumPisos = lector.nextInt();
    System.out.println("Ingrese el Costo de Mantenimiento:");
    int CostoMantenimiento = lector.nextInt();
    
    Apartamento apartamento1 = new Apartamento(TamañoApartamento,CosteConstruccionApartamento,NumPisos,CostoMantenimiento);
    
    System.out.println("Casa:" + "  Tamaño:" + TamañoCasa+ "  Coste de Construccion:" + CosteConstruccionCasa +"  Material:" + Material + "  Cantidad de Habitaciones:" + CantHabit );
    System.out.println("                                          ");
    System.out.println("Apartamento:" + "  Tamaño:" + TamañoApartamento + "  Coste de Construccion:" + CosteConstruccionApartamento+ "  Numero de Pisos:" + NumPisos + "  Coste de Mantenimiento:"+ CostoMantenimiento );
    System.out.println("                                          ");
   
	}

}