
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		
		//float pontoFlutuante = (float) 3.14;
		float pontoFlutuante = 3.14f;
		
		int valor = (int) salario; //cast/conversao de double para inteiro
		System.out.println(valor);
		
		//double valor = 3; //inteiro para double ok - cast/conversao automatica
		
		long numeroGrande=300000000000000000L;
		short valorPequeno=2131;
		byte b = 127;
		
		double valor1=0.2;
		double valor2=0.1;
		double total = valor1+valor2;
		System.out.println(total);
	}
}
