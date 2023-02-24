package application;

import java.util.Locale;
import java.util.Scanner;

import entities1.Contas_semana;
import entities2.Receber_semana;

public class Fluxo_de_caixa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int menu, ano, numPags, numReceb;
		double saldoInicial;
		String mes;
		
		do {
			
		menu=0;
		saldoInicial=0;
		ano=0;
		numPags=0;
		numReceb=0;
		
		System.out.println("Controle de fluxo de caixa.");
		System.out.println(" ");
		System.out.println("1 - Semanal");
		System.out.println("2 - Mensal");
		System.out.println("3 - Anual");
		System.out.println(" ");
		System.out.print("Digite a opção desejada: ");
		menu=sc.nextInt();
		System.out.println(" ");
		System.out.println("Pressione ENTER para continuar.");		
			
		switch (menu) {
		
		case 1:
			Contas_semana[] vect = new Contas_semana[numPags];
			sc.nextLine();
			Receber_semana[] vect2 = new Receber_semana[numReceb];
			sc.nextLine();
			System.out.println("- Fluxo de caixa semanal -");
			System.out.println(" ");
			System.out.print("Digite o saldo inicial da semana: R$ ");
			saldoInicial=sc.nextDouble();
			System.out.println(" ");
			System.out.print("Digite o número de pagamentos realizados durante a semana: ");
			numPags=sc.nextInt();
			System.out.println(" ");
			
			for (int i=0; i<numPags; i++) {
				sc.nextLine();
				System.out.print("Dia do pagamento: ");
				String diaC = sc.nextLine();
				System.out.print("Valor do pagamento: R$ ");
				double valorPago = sc.nextDouble();
				vect[i] = new Contas_semana(diaC, valorPago);
				
				}
			
			System.out.println(" ");
			System.out.print("Digite o número de recebimentos durante a semana: ");
			numReceb=sc.nextInt();
			System.out.println(" ");
			
			for (int i=0; i<numPags; i++) {
				sc.nextLine();
				System.out.print("Dia do recebimento: ");
				String diaR = sc.nextLine();
				System.out.print("Valor do recebimento: R$ ");
				double valorRecebido = sc.nextDouble();
				vect2[i] = new Receber_semana(diaR, valorRecebido);
				
				}
			
		break;
			
		case 2:
		
			System.out.print("Digite o mês de lançamento: ");
			mes=sc.nextLine();
			System.out.print("Digite o saldo inicial do mês: R$ ");
			saldoInicial=sc.nextDouble();
			System.out.println(" ");
			
		break;	
			
		case 3:
		
			System.out.print("Digite o ano de lançamento: ");
			ano=sc.nextInt();
			System.out.print("Digite o saldo inicial do ano: R$ ");
			saldoInicial=sc.nextDouble();
			System.out.println(" ");
		
		break;	
			
		}
		
		}while (menu<4);
		
		sc.close();	
	
	}
}

