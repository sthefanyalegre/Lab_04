package lab_04;
import java.util.*;

public class Principalcontacto {

	public static void main(String[] args) {
		int opc;
		boolean nom;
		String nombre, telefono,direccion;
		Contacto cont = new Contacto();
		Scanner scanner = new Scanner(System.in);
		ArrayList<Contacto> agenda = new ArrayList<Contacto>(); 
		do {
			System.out.println("---Menu---");
			System.out.println("1. Añadir Contacto");
			System.out.println("2. Buscar Contacto");
			System.out.println("3. Modificar Contacto");
			System.out.println("4. Borrar Contacto");
			System.out.println("5. Mostrar Contactos");
			System.out.println("6. Salir");
			System.out.println("Ingrese una opción: ");
			opc = scanner.nextInt();
			switch(opc) {
			case 1:
				System.out.println("Ingrese el Nombre: ");
				nombre = scanner.next();
				System.out.println("Ingrese el telefono: ");
				telefono = scanner.next();
				System.out.println("Ingrese la dirección: ");
				direccion = scanner.next();
				agenda.add(new Contacto(nombre,telefono,direccion));
				break;
				
			case 2:
			    System.out.println("Ingrese el nombre que desea buscar: ");
			    nombre = scanner.next();
			    buscar(agenda,nombre);
				break;
			case 3:
			    System.out.println("Ingrese el nombre del contacto que desea modificar: ");
			    nombre = scanner.next();
			    
			    boolean contactoEncontrado = false;
			    for (Contacto contacto : agenda) {
			        if (contacto.getNombre().equalsIgnoreCase(nombre)) {
			            System.out.println("Contacto encontrado: " + contacto.toString());
			            System.out.println("Ingrese el nuevo teléfono: ");
			            telefono = scanner.next();
			            System.out.println("Ingrese la nueva dirección: ");
			            direccion = scanner.next();
			            contacto.setTelefono(telefono);
			            contacto.setDireccion(direccion);
			            System.out.println("Contacto modificado correctamente.");
			            contactoEncontrado = true;
			            break;
			        }
			    }
			    if (!contactoEncontrado) {
			        System.out.println("Contacto no encontrado.");
			    }
				break;
			case 4:
			    System.out.println("Ingrese el nombre del contacto que desea borrar: ");
			    nombre = scanner.next();
			    eliminar(agenda,nombre);
			   
			    break;
			case 5:
				Iterator<Contacto> mostrar = agenda.iterator();
				while(mostrar.hasNext()) {
					Contacto contactos = mostrar.next();
					System.out.print(contactos +"\n");
				}
				break;
			case 6:
				System.out.println("fin del programa...");
				break;
			}
		}while(opc != 6);
	}
	public static void buscar(ArrayList<Contacto> agenda, String nombre) {
		 for (Contacto contacto : agenda) {
		        if (contacto.getNombre().equalsIgnoreCase(nombre)) {
		            System.out.println("Contacto encontrado: \n" + contacto.toString());
		            break;
		        }if (!agenda.contains(new Contacto(nombre, "", ""))) {
			        System.out.println("Contacto no encontrado.");
			    }
		    }

		    
	}
	
	public static void eliminar(ArrayList<Contacto> agenda, String nombre) {
		 boolean contactoBorrado = false;
		    for (int i = 0; i < agenda.size(); i++) {
		        Contacto contacto = agenda.get(i);
		        if (contacto.getNombre().equalsIgnoreCase(nombre)) {
		            agenda.remove(i);
		            System.out.println("Contacto borrado correctamente.");
		            contactoBorrado = true;
		            break;
		        }
		    }
		    if (!contactoBorrado) {
		        System.out.println("Contacto no encontrado.");
		    }

	}
}

