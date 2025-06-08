package supermercadooo;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);

	System.out.println("Ingrese el nombre de un producto Electronico:");
    String nombreElec = scanner.next();
    System.out.println("Ingrese el precio de un producto Electronico:");
    int precioElec = scanner.nextInt();
	System.out.println("Ingrese la marca de un producto Electronico:");
    String marca = scanner.next();
    System.out.println("Ingrese el modelo de un producto Electronico:");
    String modelo = scanner.next();
   
    Electronica electronica1 = new Electronica(nombreElec,precioElec,marca,modelo);
    System.out.println("------------------------------------");
    System.out.println("Ingrese el nombre de la Ropa:");
    String nombreRopa = scanner.next();
    System.out.println("Ingrese el precio de la Ropa:");
    int precioRopa = scanner.nextInt();
	System.out.println("Ingrese la talla de la Ropa:");
    String talla = scanner.next();
    System.out.println("Ingrese el color de la Ropa:");
    String color = scanner.next();
    
    Ropa ropa1 = new Ropa(nombreRopa,precioRopa,talla,color);
    
    System.out.println("------------------------------------");
    System.out.println("Ingrese el nombre de un Alimento:");
    String nombreAlimento = scanner.next();
    System.out.println("Ingrese el precio de un Alimento:");
    int precioAlimento = scanner.nextInt();
	System.out.println("Ingrese la fecha de vencimiento de un Producto:");
    String fechaVencimiento = scanner.next();
    
    
    Alimento alimento1 = new Alimento(nombreAlimento,precioAlimento,fechaVencimiento);
    
    System.out.println("Producto Electronico: " + "  Nombre:" + nombreElec+ "  Precio:" + precioElec +"  Marca:" + marca + "  Modelo:" + modelo );
    System.out.println("                                          ");
    System.out.println("Ropa: " + "  Nombre:" + nombreRopa + "  Precio:" + precioRopa+ "  Talla:" + talla + "  Color:"+ color );
    System.out.println("                                          ");
    System.out.println("Alimento: " + "  Nombre:"+nombreAlimento + "  Precio:"+ precioAlimento + "  Fecha de vencimiento:"+ fechaVencimiento);
    System.out.println("                                          ");
	}

}
