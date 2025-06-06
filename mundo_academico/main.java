package mundo_academicoo;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.println("Ingrese el titulo del libro:");
	    String tituloLibro = scanner.next();
		System.out.println("Ingrese el autor del libro:");
		String autorLibro = scanner.next();
		System.out.println("Ingrese de que año es el libro:");
	    int añoLibro = scanner.nextInt();
	    
		System.out.println("Ingrese el ISBN del libro:");
	    int ISBN = scanner.nextInt();
	    System.out.println("Ingrese el numero de paginas del libro:");
	    int  NumPagina = scanner.nextInt();
	    
	    Libro libro1 = new Libro(tituloLibro,autorLibro,añoLibro,ISBN,NumPagina);
	    
	    System.out.println("------------------------------------");
	    System.out.println("Ingrese el titulo de la revista:");
	    String tituloRevista = scanner.next();
	    System.out.println("Ingrese el autor de la revista:");
	    String autorRevista = scanner.next();
	    System.out.println("Ingrese de que año es la revista:");
	    int añoRevista = scanner.nextInt();
	    
	    System.out.println("Ingrese el numero de edicion de la revista:");
	    int NumEdicion = scanner.nextInt();
	    System.out.println("Ingrese la periodicidad de la revista:");
	    int Periodicidad = scanner.nextInt();
	    
	    Revista revista1 = new Revista(tituloRevista,autorRevista,añoRevista,NumEdicion,Periodicidad);
	    
	    System.out.println("------------------------------------");
	    System.out.println("Ingrese el titulo del articulo cientifico:");
	    String tituloArticulo = scanner.next();
		System.out.println("Ingrese el autor del articulo cientifico:");
		String autorArticulo = scanner.next();
		System.out.println("Ingrese de que año es el articulo cientifico:");
	    int añoArticulo = scanner.nextInt();
	    
	    System.out.println("Ingrese el numero de citaciones que le dieron al articulo cientifico:");
	    int NumCitaciones = scanner.nextInt();
	    
	    ArticuloCientifico ArticuloCientifico1 = new ArticuloCientifico(tituloArticulo,autorArticulo,añoArticulo,NumCitaciones);

	    System.out.println("Info de las publicaciones:");
	    System.out.println("Libro: " + "-Titulo:" + tituloLibro+ " - Autor:" + autorLibro +" - Año:" + añoLibro + " - ISBN:" + ISBN + " - Numero de paginas:" + NumPagina + "\n" + "Revista: " + "-Titulo:" + tituloRevista + " - Autor:" + autorRevista+ " - Año:" + añoRevista + " - Numero de Edicion:"+ NumEdicion + " - Periodicidad: "+ Periodicidad + "\n" + "Articulo: " + "-Titulo:"+tituloArticulo + " - Autor:"+ autorArticulo + " - Año:"+ añoArticulo + " - Citaciones" + NumCitaciones );
		}

	}
