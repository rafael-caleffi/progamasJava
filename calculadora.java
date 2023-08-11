import java.util.Scanner;


public class DesafioCalculadora {
	public static void main(String[] args) {
		

	    Scanner entrada = new Scanner(System.in);
		
	    System.out.println("Digite o primeiro número: ");
		double n1 = entrada.nextDouble();
		System.out.println("Digite o segundo número: ");
		double n2 = entrada.nextDouble();
		System.out.println("Digite o operador da conta: ");
		String op = entrada.next();
		
		var resultado = "+".equals(op) ? n1 + n2 : 0;
		resultado = "-".equals(op) ? n1 - n2 : resultado;
		resultado = "*".equals(op) ? n1 * n2 : resultado;
		resultado = "/".equals(op) ? n1 / n2 : resultado;
		resultado = "%".equals(op) ? n1 % n2 : resultado;
		
		System.out.println(resultado);
		

		entrada.close();
		
	}

}
