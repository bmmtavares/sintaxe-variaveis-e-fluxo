
public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo  = 7;
		segundo = primeiro;
		primeiro = 10;
		
		//qto vale o segundo? 5 pois é copiado o valor e nao feito uma referencia
		
		System.out.println(segundo);
	}
}
