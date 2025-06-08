package paqueto;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.println("Ingrese el nombre de la pintura:");
	    String nombrePintura = scanner.next();
		System.out.println("Ingrese el autor de la pintura:");
		String autorPintura = scanner.next();
		System.out.println("Ingrese el año de la pintura:");
	    int añoPintura = scanner.nextInt();
	    
		System.out.println("Ingrese el tamaño de la pintura:");
	    String Tamaño = scanner.next();
	    System.out.println("Ingrese el estilo de la pintura:");
	    String Estilo = scanner.next();
	    
	    Pintura pintura1 = new Pintura(nombrePintura,autorPintura,añoPintura,Tamaño,Estilo);
	    
	    System.out.println("------------------------------------");
	    System.out.println("Ingrese el nombre de la escultura:");
	    String nombreEscultura = scanner.next();
	    System.out.println("Ingrese el autor de la escultura:");
	    String autorEscultura = scanner.next();
	    System.out.println("Ingrese de que año es la escultura:");
	    int añoEscultura = scanner.nextInt();
	    
	    System.out.println("Ingrese el material de la escultura:");
	    String Material = scanner.next();
	    System.out.println("Ingrese cual es la representacion de la escultura:");
	    String Representacion = scanner.next();
	    
	    Escultura escultura1 = new Escultura(nombreEscultura,autorEscultura,añoEscultura,Material,Representacion);
	    
	    System.out.println("------------------------------------");
	    System.out.println("Ingrese el nombre de la fotografia:");
	    String nombreFotografia = scanner.next();
		System.out.println("Ingrese el autor de la fotografia:");
		String autorFotografia = scanner.next();
		System.out.println("Ingrese de que año es la fotografia:");
	    int añoFotografia = scanner.nextInt();
	    
	    System.out.println("Ingrese el dispositivo de el cual se tomo la fotografia:");
	    String Dispositivo = scanner.next();
	    
	    Fotografia fotografia1 = new Fotografia(nombreFotografia,autorFotografia,añoFotografia,Dispositivo);

	    System.out.println("Info de las obras de arte:");
	    System.out.println("Pintura: " + "-Nombre:" + nombrePintura+ " - Autor:" + autorPintura +" - Año:" + añoPintura + " - Tamaño:" + Tamaño + " - Estilo:" + Estilo + "\n" + "Escultura: " + "-Nombre:" + nombreEscultura + " - Autor:" + autorEscultura+ " - Año:" + añoEscultura + " - Material:"+ Material + " - Representacion: "+ Representacion + "\n" + "Fotografia: " + "-Nombre:"+ nombreFotografia + " - Autor:"+ autorFotografia + " - Año:"+ añoFotografia + " - Dispositivo:" + Dispositivo );
		}

	}
