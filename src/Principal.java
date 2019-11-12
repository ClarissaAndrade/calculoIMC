

public class Principal {

	public static void main(String[] args) {
		
		Paciente pacienteUm = new Paciente(92, 1.68);
		Paciente pacienteDois = new Paciente (51, 1.59);
		Paciente pacienteTres = new Paciente (100, 1.67);
		
		double imcUm = pacienteUm.calcularIMC();
		double imcDois = pacienteDois.calcularIMC();
		double imcTres = pacienteTres.calcularIMC();
		
		String resultadoUm = pacienteUm.diagnostico(imcUm);
		String resultadoDois = pacienteDois.diagnostico(imcDois);
		String resultadoTres = pacienteTres.diagnostico(imcTres);
		
		System.out.println("Primeiro paciente está com IMC " + String.format("%.2f", imcUm) + ", " + resultadoUm);
		System.out.println("Segundo paciente está com IMC " + String.format("%.2f", imcDois) + ", " + resultadoDois);
		System.out.println("Terceiro paciente está com IMC " + String.format("%.2f", imcTres) + ", " + resultadoTres);
	}
}
