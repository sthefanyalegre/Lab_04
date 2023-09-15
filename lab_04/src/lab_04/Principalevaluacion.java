package lab_04;
import java.util.*;
public class Principalevaluacion {

	public static void main(String[] args) {
		String sexo,trabaja;
        EvaluacionCrediticia[] evaluacion1 = new EvaluacionCrediticia[8];
        Random random = new Random();

        int hombres = 0,mujeres = 0,
        hombresTrabajan = 0, mujeresTrabajan = 0,
        sueldoHombres = 0, sueldoMujeres = 0;

        for (int i = 0; i < evaluacion1.length; i++) {
            sexo = (random.nextInt(2) + 1) == 1 ? "Masculino" : "Femenino";
            trabaja = (random.nextInt(2) + 1) == 1 ? "Sí" : "No";
            int sueldo = trabaja.equals("Sí") ? random.nextInt(2051) + 950 : 0;

            evaluacion1[i] = new EvaluacionCrediticia(sexo, trabaja, sueldo);

            if (sexo.equals("Masculino")) {
                hombres++;
                if (trabaja.equals("Sí")) {
                    hombresTrabajan++;
                    sueldoHombres += sueldo;
                }
            } else {
                mujeres++;
                if (trabaja.equals("Sí")) {
                    mujeresTrabajan++;
                    sueldoMujeres += sueldo;
                }
            }
        }

        double porcentajeHombres = (double) hombres / evaluacion1.length * 100;
        double porcentajeMujeres = (double) mujeres / evaluacion1.length * 100;
        double porcentajeHombresTrabajan = (double) hombresTrabajan / evaluacion1.length * 100;
        double porcentajeMujeresTrabajan = (double) mujeresTrabajan / evaluacion1.length * 100;

        double sueldoPromedioHombres = hombresTrabajan > 0 ? (double) sueldoHombres / hombresTrabajan : 0;
        double sueldoPromedioMujeres = mujeresTrabajan > 0 ? (double) sueldoMujeres / mujeresTrabajan : 0;

        System.out.println("a) Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("b) Porcentaje de mujeres: " + porcentajeMujeres + "%");
        System.out.println("c) Porcentaje de hombres que trabajan: " + porcentajeHombresTrabajan + "%");
        System.out.println("d) Porcentaje de mujeres que trabajan: " + porcentajeMujeresTrabajan + "%");
        System.out.println("e) El sueldo promedio de los hombres que trabajan: $" + sueldoPromedioHombres);
        System.out.println("f) El sueldo promedio de las mujeres que trabajan: $" + sueldoPromedioMujeres);

    
		
	}

}
