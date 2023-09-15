package lab_04;
import java.util.Scanner;
public class actividad_01 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		int matriz[][] = new int[2][2];
		boolean salir = false;
		int opcion, fila,columna;
		boolean rellenado = false;

		do {
			System.out.println("\nMenu");
			System.out.println("1. Rellenar Matriz");
			System.out.println("2. Sumar fila");
			System.out.println("3. Suma Columna");
			System.out.println("4. Suma Diagonal");
			System.out.println("5. Suma Diagonal Inversa");
			System.out.println("6. Media de la matriz");
			System.out.println("7. Salir");
			System.out.println("Elije una opcion: ");
			opcion = sn.nextInt();
			switch (opcion) {
			case 1:
				rellenarMatriz(sn, matriz);
				rellenado = true;
				imprimir(matriz);
				break;
			case 2:
				if (rellenado) {
					do {
						System.out.println("Elige una fila");
						fila = sn.nextInt();
					}
					while (!(fila >= 0 && fila < matriz.length));
					System.out.println("La suma de los valores de la fila " + fila + " es: "
					+ sumaFila(matriz, fila));
				} 
				else {
					System.out.println("Debes rellenar la matriz primero");
				}
				break;
			case 3:
				if (rellenado) {
					do {
						System.out.println("Elige una columna: ");
						columna = sn.nextInt();
					}
					while (!(columna >= 0 && columna < matriz.length));
					System.out.println("La suma de los valores de la fila " + columna+ 
							" es: " + sumaColumna(matriz, columna));
				} 
				else {
					System.out.println("Debes rellenar la matriz primero");
				}
				break;
			case 4:
				int total =0;
				for(int fila1 =0; fila1 < matriz.length; fila1++) {
					for(int columna1 =0; columna1 < matriz.length; columna1++) {
						if(fila1 == columna1) {
							total = total + matriz[fila1][columna1];
						}
					}
				}
				System.out.print("La suma de la diagonal es:  "+total);
				break;
			case 5:
				System.out.println("La suma de la diagonal inversa es: "+ sumaDInvesa(matriz));
				break;
			case 6:
				int suma=0,media=0;
				for(int fila1 =0; fila1 < matriz.length; fila1++) {
					for(int columna1 =0; columna1 < matriz.length; columna1++) {
						suma = suma + matriz[fila1][columna1];
					}
				}
				media =suma/(matriz.length*matriz.length);
				System.out.print("La media de la matriz es:  "+ media);
				break;
			case 7: 
				salir = true;
				break;
			default:
				System.out.println("Tienes que meter un valor entre 1 y 7");
			}
		} while (!salir);
		System.out.println("FIN");
	}
	public static void rellenarMatriz(Scanner sn, int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println("Escribe un numero en la posicion " + i + " " + j);
				matriz[i][j] = sn.nextInt();
			}
		}
	}
	public static int sumaColumna(int[][] matriz, int columna) {
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			suma += matriz[i][columna];
		}
		return suma;
	}
	
	public static int sumaDInvesa(int[][] matriz){
        int suma = 0;
        for(int fila= 0; fila < matriz.length;fila++){
            for(int columna = 0; columna < matriz.length; columna++){
                if( fila + columna == matriz.length-1){
                    suma = suma + matriz[fila][columna];
                }
            }
        }
        return suma;
    }
	public static int sumaFila(int[][] matriz, int fila) {
		int suma = 0;
		for (int j = 0; j < matriz.length; j++) {
			suma += matriz[fila][j];
		}
		return suma;
	}
	public static void imprimir(int [][] matriz) {
		for(int fila = 0; fila < matriz.length;fila++) {
			for(int columna = 0; columna < matriz[fila].length;columna++)
				System.out.printf("%d ",matriz[fila][columna]);
			System.out.println();
		}	
	}

}


