package application;

import java.util.Locale;
import java.util.Scanner;

public class Fluxo_de_caixa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int menu, ano;
		double saldoInicial;
		String mes;
		
		System.out.println("Controle de fluxo de caixa.");
		System.out.println(" ");
		System.out.println("1 - Semanal");
		System.out.println("2 - Mensal");
		System.out.println("3 - Anual");
		System.out.println(" ");
		System.out.print("Digite a opção desejada: ");
		menu=sc.nextInt();
		System.out.println(" ");
		
		saldoInicial=0;
		
		if (menu==1) {
		
			System.out.print("Digite o saldo inicial da semana: R$ ");
			saldoInicial=sc.nextDouble();
			System.out.println(" ");
			
		}
		
		else if (menu==2) {
		
			System.out.print("Digite o mês de lançamento: ");
			mes=sc.nextLine();
			System.out.print("Digite o saldo inicial do mês: R$ ");
			saldoInicial=sc.nextDouble();
			System.out.println(" ");
			
		}
		
		else {
		
			System.out.print("Digite o ano de lançamento: ");
			ano=sc.nextInt();
			System.out.print("Digite o saldo inicial do ano: R$ ");
			saldoInicial=sc.nextDouble();
			System.out.println(" ");
			
		}
		
		sc.close();	
	}
}
