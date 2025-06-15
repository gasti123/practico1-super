package paquetoton;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion;
		int opcione;
		Libro[] arreglo = new Libro[10];
		Revista[] arreglo2 = new Revista[10];
		ArticuloCientifico[] arreglo3 = new ArticuloCientifico[10];
		int cantidadRegistrosElec = 0;

		do {

			Scanner lector = new Scanner(System.in);
            //Menu principal
			System.out.println("Bienvenido");
			System.out.println("Ingrese el tipo de la publicacion:");
			System.out.println("1-Libro");
			System.out.println("2-Revista");
			System.out.println("3-Articulo Cientifico");
			System.out.println("4-Salir");
			opcion = lector.nextInt();

			switch (opcion) {
			case 1:
				do {

					// segundo menu Libro
					System.out.println("|LIBRO|");
					System.out.println(" Bienvenido");
					System.out.println(" Ingresa opcion deseada:");
					System.out.println(" 1- Ingresar Publicacion");
					System.out.println(" 2- Mostrar Lista de Publicaciones");
					System.out.println(" 3- Borrar Publicacion");
					System.out.println(" 4- Modificar ISBN");
					System.out.println(" 5- Salir");
					opcione = lector.nextInt();

					switch (opcione) {

					case 1:// case LIBRO
						altaLibro(arreglo, cantidadRegistrosElec, lector);
						cantidadRegistrosElec++;
						break;
					case 2:// case LIBRO
						listarLibro(arreglo);
						break;

					case 3:// case LIBRO

						System.out.println("Ingresa el ISBN(International Standard Book Number) para darlo de baja: ");
						int ISBN = lector.nextInt();
						bajaLibro(arreglo, ISBN);
						break;

					case 4://case LIBRO
						updateLibro(arreglo, lector);
						break;
					case 5://case LIBRO
						System.out.println("");
						break;

					default:
						System.out.println("Opcion no disponible");
						break;
					}
				} while (opcione != 5);
				// FIN DEL MENU DE LIBRO
				//----------------------------------------------------------------------------------------

				break;
			case 2: 
				do {

					// segundo menu REVISTA
					System.out.println("|Revista|");
					System.out.println("Bienvenido");
					System.out.println("Ingresa opcion deseada:");
					System.out.println(" 1- Ingresar Publicacion");
					System.out.println(" 2- Mostrar Lista de Publicaciones");
					System.out.println(" 3- Borrar Publicacion");
					System.out.println(" 4- Modificar ISSN");
					System.out.println(" 5- Salir");
					opcione = lector.nextInt();

					switch (opcione) {

					case 1://case REVISTA
						altaRevista(arreglo2, cantidadRegistrosElec, lector);
						cantidadRegistrosElec++;
						break;
					case 2://case REVISTA
						listarRevista(arreglo2);
						break;

					case 3://case REVISTA

						System.out.println("Ingresa el ISSN(International Standard Serial Number) para darlo de baja: ");
						int ISSN = lector.nextInt();
						bajaRevista(arreglo2, ISSN);
						break;

					case 4://case REVISTA
						updateRevista(arreglo2, lector);
						break;
					case 5://case REVISTA
						System.out.println("");
						break;

					default:
						System.out.println("Opcion no disponible");
						break;
					}
				} while (opcione != 5);
				// FIN DEL MENU DE LA REVISTA
				// ----------------------------------------------------------------------------------------

				break;
			case 3:
				do {
					// segundo menu ARTICULO CIENTIFICO
					System.out.println("|ALIMENTOS|");
					System.out.println(" Bienvenido");
					System.out.println(" Ingresa opcion deseada:");
					System.out.println(" 1- Ingresar Producto");
					System.out.println(" 2- Mostrar Lista de Producto");
					System.out.println(" 3- Borrar Producto");
					System.out.println(" 4- Modificar Codigo del Producto");
					System.out.println(" 5- Salir");
					opcione = lector.nextInt();

					switch (opcione) {

					case 1://case ARTICULO CIENTIFICO
						altaArticulo(arreglo3, cantidadRegistrosElec, lector);
						cantidadRegistrosElec++;
						break;
					case 2://case ARTICULO CIENTIFICO
						listarArticulo(arreglo3);
						break;

					case 3://case ARTICULO CIENTIFICO

						System.out.println("Ingresa el DOI (Digital Object Identifier) para darlo de baja: ");
						int DOI = lector.nextInt();
						bajaArticulo(arreglo3, DOI);
						break;

					case 4:// case ARTICULO CIENTIFICO
						updateArticulo(arreglo3, lector);
						break;
					case 5:// case ARTICULO CIENTIFICO
						System.out.println("");
						break;

					default:
						System.out.println("Opcion no disponible");
						break;
					}
				} while (opcione != 5);
				break;

			// FIN DEL MENU DE LOS ARTICULOS CIENTIFICOS
			// ----------------------------------------------------------------------------------------

			case 4:
				System.out.println("Se terminó");
				break;

			default:
				System.out.println("Opcion no disponible");
				break;
			}

		} while (opcion != 4);

	}

	// ----------------------------------------------------------------------------------------
	// Libro
	public static void bajaLibro(Libro[] arreglo, int ISBN) {

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null && arreglo[i].getISBN() == ISBN) {
				arreglo[i] = null;
				System.out.println("Cambio realizado con exito!");
			}
		}
	}

	public static void altaLibro(Libro[] arreglo, int cantidadRegistros, Scanner lector) {
		System.out.println("Ingrese el ISBN(International Standard Book Number):");
		int ISBN = lector.nextInt();
		System.out.println("Ingrese el Titulo:");
		String titulo = lector.next();
		System.out.println("Ingrese el Autor:");
		String autor = lector.next();
		System.out.println("Ingrese el Año de publicacion:");
		int año = lector.nextInt();
		System.out.println("Ingrese el Numero de Paginas:");
		int NumPag = lector.nextInt();

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == null) {
				arreglo[i] = new Libro(ISBN, titulo, autor, año, NumPag);
				break;
			}
		}

	}

	public static void listarLibro(Libro[] arreglo) {

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null) {

				System.out.print("Publicacion N°" + i + "-ISBN:" + arreglo[i].getISBN());
				System.out.print(" -Titulo:" + arreglo[i].getTitulo());
				System.out.print(" -Autor:" + arreglo[i].getAutor());
				System.out.print(" -Año:" + arreglo[i].getAño());
				System.out.print(" -Numero de Paginas:" + arreglo[i].getNumPagina() + "|");
			} else {
				System.out.println("Publicacion N°" + i + "-Vacio-");
			}

		}

	}

	public static void updateLibro(Libro[] arreglo, Scanner lector) {
		System.out.println("Ingresa el ISBN(International Standard Book Number) que quiere modificar: ");
		int Isbn = lector.nextInt();

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null && arreglo[i].getISBN() == Isbn) {
				System.out.println("Publicacion encontrada");
				System.out.println("Ingrese nuevo ISBN:");
				int nuevoISBN = lector.nextInt();
				arreglo[i].setISBN(nuevoISBN);
				System.out.println("Cambio realizado con exito!");
				System.out.println("  ");
			}
		}
	}
	// ----------------------------------------------------------------------------------------
	// REVISTA

	public static void bajaRevista(Revista[] arreglo2, int ISSN) {

		for (int i = 0; i < arreglo2.length; i++) {
			if (arreglo2[i] != null && arreglo2[i].getISSN() == ISSN) {
				arreglo2[i] = null;
				System.out.println("Cambio realizado con exito!");
			}
		}
	}

	public static void altaRevista(Revista[] arreglo2, int cantidadRegistros, Scanner lector) {
		System.out.println("Ingrese el ISSN(International Standard Serial Number):");
		int ISSN = lector.nextInt();
		System.out.println("Ingrese el Titulo:");
		String titulo = lector.next();
		System.out.println("Ingrese el Autor:");
		String autor = lector.next();
		System.out.println("Ingrese el Año de publicacion:");
		int año = lector.nextInt();
		System.out.println("Ingrese el Numero de la Edicion:");
		int NumEdicion = lector.nextInt();

		for (int i = 0; i < arreglo2.length; i++) {
			if (arreglo2[i] == null) {
				arreglo2[i] = new Revista(ISSN, titulo, autor, año, NumEdicion);
				break;
			}
		}

	}

	public static void listarRevista(Revista[] arreglo2) {

		for (int i = 0; i < arreglo2.length; i++) {
			if (arreglo2[i] != null) {

				System.out.print("Producto N°" + i + "-ISSN:" + arreglo2[i].getISSN());
				System.out.print(" -Titulo:" + arreglo2[i].getTitulo());
				System.out.print(" -Autor:" + arreglo2[i].getAutor());
				System.out.print(" -Año:" + arreglo2[i].getAño());
				System.out.print(" -Numero de Edicion:" + arreglo2[i].getNumEdicion() + "|");
			} else {
				System.out.println("Producto N°" + i + "-Vacio-");
			}

		}

	}

	public static void updateRevista(Revista[] arreglo2, Scanner lector) {
		System.out.println("Ingresa el ISSN(International Standard Serial Number) a modificar: ");
		int Issn = lector.nextInt();

		for (int i = 0; i < arreglo2.length; i++) {
			if (arreglo2[i] != null && arreglo2[i].getISSN() == Issn) {
				System.out.println("Producto encontrado");
				System.out.println("Ingresa nuevo Codigo de Barra:");
				int NuevoISSN = lector.nextInt();
				arreglo2[i].setISSN(NuevoISSN);
				System.out.println("Cambio realizado con exito!");
				System.out.println("  ");
			}
		}

	}

	// ----------------------------------------------------------------------------------------
	// ARTICULO CIENTIFICO
	public static void bajaArticulo(ArticuloCientifico[] arreglo3, int DOI) {

		for (int i = 0; i < arreglo3.length; i++) {
			if (arreglo3[i] != null && arreglo3[i].getDOI() == DOI) {
				arreglo3[i] = null;
				System.out.println("Cambio realizado con exito!");
			}
		}
	}

	public static void altaArticulo(ArticuloCientifico[] arreglo3, int cantidadRegistros, Scanner lector) {
		System.out.println("Ingrese el DOI(Digital Object Identifier):");
		int ISBN = lector.nextInt();
		System.out.println("Ingrese el Titulo:");
		String titulo = lector.next();
		System.out.println("Ingrese el Autor:");
		String autor = lector.next();
		System.out.println("Ingrese el Año de publicacion:");
		int año = lector.nextInt();
		System.out.println("Ingrese el Numero de Citaciones Dadas:");
		int NumCitacionesDadas = lector.nextInt();

		for (int i = 0; i < arreglo3.length; i++) {
			if (arreglo3[i] == null) {
				arreglo3[i] = new ArticuloCientifico(ISBN,titulo,autor,año,NumCitacionesDadas);
				break;
			}
		}

	}

	public static void listarArticulo(ArticuloCientifico[] arreglo3) {

		for (int i = 0; i < arreglo3.length; i++) {
			if (arreglo3[i] != null) {

				System.out.print("Producto N°" + i + "-DOI:" + arreglo3[i].getDOI());
				System.out.print(" -Titulo:" + arreglo3[i].getTitulo());
				System.out.print(" -Autor:" + arreglo3[i].getAutor());
				System.out.print(" -Año:" + arreglo3[i].getAño());
				System.out.print(" -Numero de Citaciones Dadas:" + arreglo3[i].getNumCitacionesDadas() + "|");
			} else {
				System.out.println("Producto N°" + i + "-Vacio-");
			}

		}

	}

	public static void updateArticulo(ArticuloCientifico[] arreglo3, Scanner lector) {
		System.out.println("Ingresa el DOI(International Standard Serial Number) a modificar: ");
		int Doi = lector.nextInt();

		for (int i = 0; i < arreglo3.length; i++) {
			if (arreglo3[i] != null && arreglo3[i].getDOI() == Doi) {
				System.out.println("Producto encontrado");
				System.out.println("Ingresa nuevo Codigo de Barra:");
				int NuevoDoi = lector.nextInt();
				arreglo3[i].setDOI(NuevoDoi);
				System.out.println("Cambio realizado con exito!");
				System.out.println("  ");
			}
		}
	}
}