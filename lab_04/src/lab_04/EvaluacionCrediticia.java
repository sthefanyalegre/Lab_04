package lab_04;

public class EvaluacionCrediticia {
	
	private String sexo;
	private String trabaja;
	private int sueldo;
	public EvaluacionCrediticia() {}
	
	public EvaluacionCrediticia(String sexo, String trabaja, int sueldo) {
		this.sexo = sexo;
		this.trabaja = trabaja;
		this.sueldo = sueldo;
	}

	public String getSexo() {return sexo;}

	public void setSexo(String sexo) {this.sexo = sexo;}

	public String getTrabaja() {return trabaja;}

	public void setTrabaja(String trabaja) {this.trabaja = trabaja;}

	public int getSueldo() {return sueldo;}

	public void setSueldo(int sueldo) {this.sueldo = sueldo;}

	@Override
	public String toString() {
		return "-----Evaluacion Crediticia----- \n sexo: " + sexo + " \n trabaja: " + trabaja + "\n sueldo: " + sueldo ;
	}
	
}
