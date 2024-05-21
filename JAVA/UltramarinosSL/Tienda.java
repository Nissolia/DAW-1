package UltramarinosSL;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		// array list
		ArrayList<Articulo> Art = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		String producto = "";
		// menú
		for (int i = 0; i < (Math.random() * (10 - 3) + 3); i++) {
			Art.add(Articulo.generarArticuloAleatorio());// se hace si en el metodo sale un objeto
		}
		do {

			try {
				System.out.println("1. Mostrar artículos" + "\n2. Compra a proveedor" + "\n3. Venta a cliente"
						+ "\n4. Gestionar artículos" + "\n5. Criterios de ordenación" + "\n6. Salir");
				menu = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Vaya liada has montado...");
			} finally {
				sc.nextLine();
			}

			switch (menu) {
			case 1:

				listaArticulos(Art);
				break;
			case 2:// 2. Compra a proveedor
				/*
				 * permitirá realizar una compra al proveedor. Si el artículo existe, se
				 * aumentará su stock en la cantidad especificada; de lo contrario, se agregará
				 * el artículo a la tienda. La forma de introducir los datos necesarios para la
				 * compra queda a criterio del alumno. Una vez realizada la compra, se mostrarán
				 * todos los datos del artículo junto con un mensaje de confirmación.
				 */
				listaArticulos(Art);
				boolean exit = false;
				do {
					try {
						System.out.print("Introduce el producto que quieres comprar: ");
						String nombre = sc.nextLine();
						System.out.print("Introduce el precio de compra: ");
						double precioCompra = sc.nextDouble();
						System.out.print("Introduce la cantidad a comprar: ");
						int cantidad = sc.nextInt();
						sc.nextLine(); // Limpiar el buffer del scanner

						Articulo articuloExistente = null;
						for (Articulo articulo : Art) {
							if (articulo.getNombre().equalsIgnoreCase(nombre)) {
								articuloExistente = articulo;
							}
						}

						if (articuloExistente != null) {
							// Si el artículo ya existe, aumentar su stock
							articuloExistente.setStock(articuloExistente.getStock() + cantidad);
							System.out.println("Artículo existente actualizado: " + articuloExistente);
						} else {
							// Si el artículo no existe, agregarlo a la lista
							double precioVenta = precioCompra + (precioCompra * 0.21);
							Articulo nuevoArticulo = new Articulo(nombre, precioVenta, precioCompra, cantidad);
							Art.add(nuevoArticulo);
							System.out.println("Nuevo artículo agregado: " + nuevoArticulo);
						}

						System.out.println("Compra realizada exitosamente.");
						exit = true;
					} catch (Exception e) {
						throw new ImposibleCrearArticuloException();
					}
				} while (exit == false);

				break;
			case 3:// 3. Venta a cliente
				/*
				 * "Venta a cliente", mostrará una lista con los artículos y sus datos.
				 * Permitirá realizar una venta, solicitando los identificadores y cantidades de
				 * los artículos deseados. Para finalizar la compra, se deberá introducir un ID
				 * negativo para indicar que se ha terminado la selección de artículos. Se
				 * mostrará el precio total y se pedirá confirmación de la venta. Además, se
				 * deberá reducir el stock de los artículos seleccionados. Solo se podrá comprar
				 * un artículo si hay suficiente stock disponible. Si un artículo llega a un
				 * stock de 0, no se eliminará de la lista. Eso se realizará en la opción 4
				 */
				break;
			case 4:// 4. Gestionar artículos
				/*
				 * La opción 4 mostrará un submenú con 4 opciones. Las tres primeras opciones
				 * solicitarán la información necesaria y realizarán la operación
				 * correspondiente si es posible. La cuarta opción volverá al menú principal: 1.
				 * Eliminar artículo 2. Editar artículo (permitiendo cambiar el nombre y el IVA)
				 * 3. Volver al menú principal
				 */
				break;
			case 5:// 5. Criterios de ordenación
				/*
				 * La opción 5 mostrará un submenú que permitirá cambiar el criterio de
				 * ordenación de la lista de artículos. Se podrán ordenar por defecto (por ID),
				 * por precio de venta o por precio de venta, precio de compra y nombre, en ese
				 * orden
				 */
				break;
			case 6:// 6. Salir
				System.out.println("Saliendo del programa...");
				/*
				 * La opción 6 terminará el programa. El menú principal y el submenú se
				 * mostrarán después de cada operación hasta que el usuario elija "Salir" o
				 * "Volver", según corresponda. La opción 5 utilizará la ordenación por defecto
				 * y volverá al menú principal si no se elige ninguna opción.
				 */
				break;

			default:
				System.out.println("Ese no es el número para salir...");
				break;
			}
		} while (menu != 6);

	}

	private static void listaArticulos(ArrayList<Articulo> Art) {

		for (Articulo articulo : Art) {

			if (articulo == null) {
				throw new ImposibleCrearArticuloException("No hay archivos...");
			}
			System.out.println(articulo);
		}

	}

}
