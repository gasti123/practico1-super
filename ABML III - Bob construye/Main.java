package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion;
		int opcione;
		Casa[] arreglo = new Casa[10];
		Apartamento[] arreglo2 = new Apartamento[10];
		int cantidadRegistrosElec = 0;

		do {

			Scanner lector = new Scanner(System.in);
            //Menu principal
			System.out.println("Bienvenido");
			System.out.println("Ingrese el tipo de la construccion:");
			System.out.println("1-Casa");
			System.out.println("2-Apartamento");
			System.out.println("3-Salir");
			opcion = lector.nextInt();

			switch (opcion) {
			case 1:
				do {

					// segundo menu CASA
					System.out.println("|Casa|");
					System.out.println(" Bienvenido");
					System.out.println(" Ingresa opcion deseada:");
					System.out.println(" 1- Ingresar Construccion");
					System.out.println(" 2- Mostrar Lista de Construcciones");
					System.out.println(" 3- Borrar Construccion");
					System.out.println(" 4- Modificar Codigo Postal");
					System.out.println(" 5- Salir");
					opcione = lector.nextInt();

					switch (opcione) {

					case 1:// case CASA
						altaCasa(arreglo, cantidadRegistrosElec, lector);
						cantidadRegistrosElec++;
						break;
					case 2:// case CASA
						listarCasa(arreglo);
						break;

					case 3:// case CASA

						System.out.println("Ingrese el Codigo Postal para darlo de baja: ");
						int CodePostal = lector.nextInt();
						bajaCasa(arreglo, CodePostal);
						break;

					case 4://case CASA
						updateCasa(arreglo, lector);
						break;
					case 5://case CASA
						System.out.println("");
						break;

					default:
						System.out.println("Opcion no disponible");
						break;
					}
				} while (opcione != 5);
				// FIN DEL MENU DE CASA
				//----------------------------------------------------------------------------------------

				break;
			case 2: 
				do {

					// segundo menu APARTAMENTO
					System.out.println("|Apartamento|");
					System.out.println(" Bienvenido");
					System.out.println(" Ingresa opcion deseada:");
					System.out.println(" 1- Ingresar Construccion");
					System.out.println(" 2- Mostrar Lista de Construcciones");
					System.out.println(" 3- Borrar Construccion");
					System.out.println(" 4- Modificar Codigo Postal");
					System.out.println(" 5- Salir");
					opcione = lector.nextInt();

					switch (opcione) {

					case 1://case APARTAMENTO
						altaApartamento(arreglo2, cantidadRegistrosElec, lector);
						cantidadRegistrosElec++;
						break;
					case 2://case APARTAMENTO
						listarApartamento(arreglo2);
						break;

					case 3://case APARTAMENTO

						System.out.println("Ingrese el Codigo Postal para darlo de baja:");
						int CodPostal = lector.nextInt();
						bajaApartamento(arreglo2, CodPostal);
						break;

					case 4://case APARTAMENTO
						updateApartamento(arreglo2, lector);
						break;
					case 5://case APARTAMENTO
						System.out.println("");
						break;

					default:
						System.out.println("Opcion no disponible");
						break;
					}
				} while (opcione != 5);
				// FIN DEL MENU DEL APARTAMENTO
				// ----------------------------------------------------------------------------------------

				break;
			

			case 3:
				System.out.println("Se terminó");
				break;

			default:
				System.out.println("Opcion no disponible");
				break;
			}

		} while (opcion != 3);

	}

	// ----------------------------------------------------------------------------------------
	// Casa
	public static void bajaCasa(Casa[] arreglo, int CodigoPostal) {

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null && arreglo[i].getCodigoPostal() == CodigoPostal) {
				arreglo[i] = null;
				System.out.println("Cambio realizado con exito!");
			}
		}
	}

	public static void altaCasa(Casa[] arreglo, int cantidadRegistros, Scanner lector) {
		System.out.println("Ingrese el Codigo Postal:");
		int CodePostal = lector.nextInt();
		System.out.println("Ingrese el Coste de Construccion:");
		int Coste = lector.nextInt();
		System.out.println("Ingrese el Tamaño:");
		int Tamaño = lector.nextInt();
		System.out.println("Ingrese el Material:");
		String Material = lector.next();
		System.out.println("Ingrese la Cantidad de Habitaciones:");
		int CantHabit = lector.nextInt();

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == null) {
				arreglo[i] = new Casa(CodePostal,Coste,Tamaño,Material,CantHabit);
				break;
			}
		}

	}

	public static void listarCasa(Casa[] arreglo) {

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null) {

				System.out.print("Construccion N°" + i + "-Codigo Postal:" + arreglo[i].getCodigoPostal());
				System.out.print(" -Coste:" + arreglo[i].getCosteConstruccion());
				System.out.print(" -Tamaño:" + arreglo[i].getTamaño());
				System.out.print(" -Material:" + arreglo[i].getMaterial());
				System.out.print(" -Cantidad de Habitaciones:" + arreglo[i].getCantHabit() + "|");
			} else {
				System.out.println("Construccion N°" + i + "-Vacio-");
			}

		}

	}

	public static void updateCasa(Casa[] arreglo, Scanner lector) {
		System.out.println("Ingrese el Codigo Postal para modificarlo:");
		int CodePosta = lector.nextInt();

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null && arreglo[i].getCodigoPostal() == CodePosta) {
				System.out.println("Construccion encontrada");
				System.out.println("Ingrese nuevo Codigo Postal:");
				int nuevoCode = lector.nextInt();
				arreglo[i].setCodigoPostal(nuevoCode);
				System.out.println("Cambio realizado con exito!");
				System.out.println("  ");
			}
		}
	}
	// ----------------------------------------------------------------------------------------
	// APARTAMENTO

	public static void bajaApartamento(Apartamento[] arreglo2, int CodePostal) {

		for (int i = 0; i < arreglo2.length; i++) {
			if (arreglo2[i] != null && arreglo2[i].getCodigoPostal() == CodePostal) {
				arreglo2[i] = null;
				System.out.println("Cambio realizado con exito!");
			}
		}
	}

	public static void altaApartamento(Apartamento[] arreglo2, int cantidadRegistros, Scanner lector) {
		System.out.println("Ingrese el Codgio Postal:");
		int CodigoPostal = lector.nextInt();
		System.out.println("Ingrese el Coste de Construccion:");
		int Coste = lector.nextInt();
		System.out.println("Ingrese el Tamaño:");
		int Tamaño = lector.nextInt();
		System.out.println("Ingrese el Numero de Pisos:");
		int NumPisos = lector.nextInt();
		System.out.println("Ingrese el Costo de Mantenimiento:");
		int CostoMantenimiento = lector.nextInt();

		for (int i = 0; i < arreglo2.length; i++) {
			if (arreglo2[i] == null) {
				arreglo2[i] = new Apartamento(CodigoPostal,Coste,Tamaño,NumPisos,CostoMantenimiento);
				break;
			}
		}

	}

	public static void listarApartamento(Apartamento[] arreglo2) {

		for (int i = 0; i < arreglo2.length; i++) {
			if (arreglo2[i] != null) {

				System.out.print("Construccion N°" + i + "-Codigo Postal:" + arreglo2[i].getCodigoPostal());
				System.out.print(" -Coste:" + arreglo2[i].getCosteConstruccion());
				System.out.print(" -Tamaño:" + arreglo2[i].getTamaño());
				System.out.print(" -Numero de Pisos:" + arreglo2[i].getNumPisos());
				System.out.print(" -Costo de Mantenimiento:" + arreglo2[i].getCostoMantenimiento() + "|");
			} else {
				System.out.println("Construccion N°" + i + "-Vacio-");
			}

		}

	}

	public static void updateApartamento(Apartamento[] arreglo2, Scanner lector) {
		System.out.println("Ingrese el Codigo Postal para modificarla:");
		int CodigoPostal = lector.nextInt();

		for (int i = 0; i < arreglo2.length; i++) {
			if (arreglo2[i] != null && arreglo2[i].getCodigoPostal() == CodigoPostal) {
				System.out.println("Construccion encontrada");
				System.out.println("Ingrese nuevo Codigo Postal:");
				int nuevoCodePostal = lector.nextInt();
				arreglo2[i].setCodigoPostal(nuevoCodePostal);
				System.out.println("Cambio realizado con exito!");
				System.out.println("  ");
			}
		}
	}
}