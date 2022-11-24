
public class Fatorial {

	public static void main(String[] args) {

		int fatorial = 1;		
		for (int numeroAtual = 0; numeroAtual <= 10; numeroAtual++) {
			// System.out.println(numeroAtual);
			if (numeroAtual == 0) {
				System.out.println("Fatorial de 0 = " + fatorial);
			} else {
				// fatorial = numeroAtual * (numeroAtual - 1);
				fatorial = fatorial * numeroAtual;
				System.out.println("Fatorial de " + numeroAtual + " = " + fatorial);
			}
		}
		
		//solucao do instrutor
		fatorial=1;
		System.out.println("###Solucao do Instrutor###");
		for(int i=1;i<11;i++) {
			fatorial*=i;
			System.out.println("Fatoria de "+i+" ="+fatorial);
		}
	}
}
