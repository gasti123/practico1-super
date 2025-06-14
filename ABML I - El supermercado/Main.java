package paquetovich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion;
		int opcione;
		Electronica[] arreglo = new Electronica[10];
		Ropa[] arreglo2 = new Ropa[10];
		Alimento[] arreglo3 = new Alimento[10];
		int cantidadRegistrosElec = 0;

		do {

			Scanner lector = new Scanner(System.in);
            //Menu principal
			System.out.println("Bienvenido");
			System.out.println("Ingrese el tipo del producto:");
			System.out.println("1-Electronica");
			System.out.println("2-Ropa");
			System.out.println("3-Alimento");
			System.out.println("4-Salir");
			opcion = lector.nextInt();

			switch (opcion) {
			case 1:
				do {

					// segundo menu electrico
					System.out.println("|ELECTRONICA|");
					System.out.println(" Bienvenido");
					System.out.println(" Ingresa opcion deseada:");
					System.out.println(" 1- Ingresar Producto");
					System.out.println(" 2- Mostrar Lista de Producto");
					System.out.println(" 3- Borrar Producto");
					System.out.println(" 4- Modificar Codigo del Producto");
					System.out.println(" 5- Salir");
					opcione = lector.nextInt();

					switch (opcione) {

					case 1:// case electrico
						altaElectrico(arreglo, cantidadRegistrosElec, lector);
						cantidadRegistrosElec++;
						break;
					case 2:// case electrico
						listarElectrico(arreglo);
						break;

					case 3:// case electrico

						System.out.println("Ingresa el Codigo de Barras del producto para darlo de baja: ");
						int barra = lector.nextInt();
						bajaElectrico(arreglo, barra);
						break;

					case 4://case electrico
						updateElectrico(arreglo, lector);
						break;
					case 5://case electrico
						System.out.println("");
						break;

					default:
						System.out.println("Opcion no disponible");
						break;
					}
				} while (opcione != 5);
				// FIN DEL MENU DE ELECTRICO
				//----------------------------------------------------------------------------------------

				break;
			case 2: 
				do {

					// segundo menu ropa
					System.out.println("|ROPA|");
					System.out.println("Bienvenido");
					System.out.println("Ingresa opcion deseada:");
					System.out.println("1- Ingresar Producto");
					System.out.println("2- Mostrar Lista de Producto");
					System.out.println("3- Borrar Producto");
					System.out.println("4- Modificar Codigo del Producto");
					System.out.println("5- Salir");
					opcione = lector.nextInt();

					switch (opcione) {

					case 1://case ropa
						altaRopa(arreglo2, cantidadRegistrosElec, lector);
						cantidadRegistrosElec++;
						break;
					case 2://case ropa
						listarRopa(arreglo2);
						break;

					case 3://case ropa

						System.out.println("Ingresa el Codigo de Barras del producto para darlo de baja: ");
						int barra = lector.nextInt();
						bajaRopa(arreglo2, barra);
						break;

					case 4://case ropa
						updateRopa(arreglo2, lector);
						break;
					case 5://case ropa
						System.out.println("");
						break;

					default:
						System.out.println("Opcion no disponible");
						break;
					}
				} while (opcione != 5);
				// FIN DEL MENU DE LA ROPA
				// ----------------------------------------------------------------------------------------

				break;
			case 3:
				do {
					// segundo menu alimento
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

					case 1://case alimento
						altaAlimento(arreglo3, cantidadRegistrosElec, lector);
						cantidadRegistrosElec++;
						break;
					case 2://case alimento
						listarAlimento(arreglo3);
						break;

					case 3://case alimento

						System.out.println("Ingresa el Codigo de Barras del producto para darlo de baja: ");
						int barra = lector.nextInt();
						bajaAlimento(arreglo3, barra);
						break;

					case 4:// case alimento
						updateAlimento(arreglo3, lector);
						break;
					case 5:// case alimento
						System.out.println("");
						break;

					default:
						System.out.println("Opcion no disponible");
						break;
					}
				} while (opcione != 5);
				break;

			// FIN DEL MENU DE LOS ALIMENTOS
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
	// Electrico
	public static void bajaElectrico(Electronica[] arreglo, int barra) {

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null && arreglo[i].getCodigoBarra() == barra) {
				arreglo[i] = null;
				System.out.println("Cambio realizado con exito!");
			}
		}
	}

	public static void altaElectrico(Electronica[] arreglo, int cantidadRegistros, Scanner lector) {
		System.out.println("Ingrese el codigo de barras del producto:");
		int codigoBarras = lector.nextInt();
		System.out.println("Ingresa Nombre:");
		String nombre = lector.next();
		System.out.println("Ingrese Precio:");
		int precio = lector.nextInt();
		System.out.println("Ingrese la Marca:");
		String marca = lector.next();
		System.out.println("Ingrese el Modelo:");
		String modelo = lector.next();

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == null) {
				arreglo[i] = new Electronica(codigoBarras, nombre, precio, marca, modelo);
				break;
			}
		}

	}

	public static void listarElectrico(Electronica[] arreglo) {

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null) {

				System.out.print("Producto N°" + i + "-Codigo Barra:" + arreglo[i].getCodigoBarra());
				System.out.print(" -Nombre:" + arreglo[i].getNombre());
				System.out.print(" -Precio:" + arreglo[i].getPrecio());
				System.out.print(" -Marca:" + arreglo[i].getMarca());
				System.out.print(" -Modelo:" + arreglo[i].getModelo() + "|");
			} else {
				System.out.println("Producto N°" + i + "-Vacio-");
			}

		}

	}

	public static void updateElectrico(Electronica[] arreglo, Scanner lector) {
		System.out.println("Ingresa el Codigo de Barra a modificar: ");
		int CodeBarra = lector.nextInt();

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null && arreglo[i].getCodigoBarra() == CodeBarra) {
				System.out.println("Producto encontrado");
				System.out.println("Ingresa nuevo Codigo de Barra:");
				int nuevaCodeBarra = lector.nextInt();
				arreglo[i].setCodigoBarra(nuevaCodeBarra);
				System.out.println("Cambio realizado con exito!");
				System.out.println("  ");
			}
		}
	}
	// ----------------------------------------------------------------------------------------
	// ROPA

	public static void bajaRopa(Ropa[] arreglo2, int barra) {

		for (int i = 0; i < arreglo2.length; i++) {
			if (arreglo2[i] != null && arreglo2[i].getCodigoBarra() == barra) {
				arreglo2[i] = null;
				System.out.println("Cambio realizado con exito!");
			}
		}
	}

	public static void altaRopa(Ropa[] arreglo2, int cantidadRegistros, Scanner lector) {
		System.out.println("Ingrese el codigo de barras del producto:");
		int codigoBarras = lector.nextInt();
		System.out.println("Ingresa Nombre:");
		String nombre = lector.next();
		System.out.println("Ingrese Precio:");
		int precio = lector.nextInt();
		System.out.println("Ingrese la Talla:");
		String talla = lector.next();
		System.out.println("Ingrese el Color:");
		String color = lector.next();

		for (int i = 0; i < arreglo2.length; i++) {
			if (arreglo2[i] == null) {
				arreglo2[i] = new Ropa(codigoBarras, nombre, precio, talla, color);
				break;
			}
		}

	}

	public static void listarRopa(Ropa[] arreglo2) {

		for (int i = 0; i < arreglo2.length; i++) {
			if (arreglo2[i] != null) {

				System.out.print("Producto N°" + i + "-Codigo Barra:" + arreglo2[i].getCodigoBarra());
				System.out.print(" -Nombre:" + arreglo2[i].getNombre());
				System.out.print(" -Precio:" + arreglo2[i].getPrecio());
				System.out.print(" -Talla:" + arreglo2[i].getTalla());
				System.out.print(" -Color:" + arreglo2[i].getColor() + "|");
			} else {
				System.out.println("Producto N°" + i + "-Vacio-");
			}

		}

	}

	public static void updateRopa(Ropa[] arreglo2, Scanner lector) {
		System.out.println("Ingresa el Codigo de Barra a modificar: ");
		int CodeBarra = lector.nextInt();

		for (int i = 0; i < arreglo2.length; i++) {
			if (arreglo2[i] != null && arreglo2[i].getCodigoBarra() == CodeBarra) {
				System.out.println("Producto encontrado");
				System.out.println("Ingresa nuevo Codigo de Barra:");
				int nuevaCodeBarra = lector.nextInt();
				arreglo2[i].setCodigoBarra(nuevaCodeBarra);
				System.out.println("Cambio realizado con exito!");
				System.out.println("  ");
			}
		}

	}

	// ----------------------------------------------------------------------------------------
	// ALIMENTO
	public static void bajaAlimento(Alimento[] arreglo3, int barra) {

		for (int i = 0; i < arreglo3.length; i++) {
			if (arreglo3[i] != null && arreglo3[i].getCodigoBarra() == barra) {
				arreglo3[i] = null;
				System.out.println("Cambio realizado con exito!");
			}
		}
	}

	public static void altaAlimento(Alimento[] arreglo3, int cantidadRegistros, Scanner lector) {
		System.out.println("Ingrese el codigo de barras del producto:");
		int codigoBarras = lector.nextInt();
		System.out.println("Ingresa Nombre:");
		String nombre = lector.next();
		System.out.println("Ingrese Precio:");
		int precio = lector.nextInt();
		System.out.println("Ingrese la Fecha de Vencimiento:");
		String FechaVenc = lector.next();
		System.out.println("Ingrese los Kilogramos:");
		int Kg = lector.nextInt();

		for (int i = 0; i < arreglo3.length; i++) {
			if (arreglo3[i] == null) {
				arreglo3[i] = new Alimento(codigoBarras, nombre, precio, FechaVenc, Kg);
				break;
			}
		}

	}

	public static void listarAlimento(Alimento[] arreglo3) {

		for (int i = 0; i < arreglo3.length; i++) {
			if (arreglo3[i] != null) {

				System.out.print("Producto N°" + i + "-Codigo Barra:" + arreglo3[i].getCodigoBarra());
				System.out.print(" -Nombre:" + arreglo3[i].getNombre());
				System.out.print(" -Precio:" + arreglo3[i].getPrecio());
				System.out.print(" -Fecha vencimiento:" + arreglo3[i].getFechaVencimiento());
				System.out.print(" -Kilogramos:" + arreglo3[i].getKg() + "|");
			} else {
				System.out.println("Producto N°" + i + "-Vacio-");
			}

		}

	}

	public static void updateAlimento(Alimento[] arreglo3, Scanner lector) {
		System.out.println("Ingresa el Codigo de Barra a modificar: ");
		int CodeBarra = lector.nextInt();

		for (int i = 0; i < arreglo3.length; i++) {
			if (arreglo3[i] != null && arreglo3[i].getCodigoBarra() == CodeBarra) {
				System.out.println("Producto encontrado");
				System.out.println("Ingresa nuevo Codigo de Barra:");
				int nuevaCodeBarra = lector.nextInt();
				arreglo3[i].setCodigoBarra(nuevaCodeBarra);
				System.out.println("Cambio realizado con exito!");
				System.out.println("  ");
			}
		}
	}
}