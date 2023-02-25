package application;

import java.util.Locale;
import java.util.Scanner;

import Entities4.Receber_mes;
import entities1.Contas_semana;
import entities2.Receber_semana;
import entities3.Contas_mes;

public class Fluxo_de_caixa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int menu, ano, numPags, numReceb;
		double saldoInicial, somaContas, somaRecebimentos, saldoFinal;
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
		System.out.println("4 - Sair");
		System.out.println(" ");
		System.out.print("Digite a opção desejada: ");
		menu=sc.nextInt();
		System.out.println(" ");
		
		switch (menu) {
		
		case 1:
			
			System.out.println("- Fluxo de caixa semanal -");
			System.out.println(" ");
			System.out.print("Digite o saldo inicial da semana: R$ ");
			saldoInicial=sc.nextDouble();
			System.out.println(" ");
			System.out.print("Digite o número de pagamentos realizados durante a semana: ");
			numPags=sc.nextInt();
			System.out.println(" ");
			
			Contas_semana[] vect = new Contas_semana[numPags];
						
			for (int i=0; i<numPags; i++) {
				sc.nextLine();
				System.out.print("Dia do pagamento: ");
				String diaC = sc.nextLine();
				System.out.print("Valor do pagamento: R$ ");
				double valorPago = sc.nextDouble();
				vect[i] = new Contas_semana(diaC, valorPago);
				System.out.println(" ");
				}
			
			System.out.println(" ");
			System.out.print("Digite o número de recebimentos durante a semana: ");
			numReceb=sc.nextInt();
						
			Receber_semana[] vect2 = new Receber_semana[numReceb];
			System.out.println(" ");
			
			for (int i=0; i<numReceb; i++) {
				sc.nextLine();
				System.out.print("Dia do recebimento: ");
				String diaR = sc.nextLine();
				System.out.print("Valor do recebimento: R$ ");
				double valorRecebido = sc.nextDouble();
				vect2[i] = new Receber_semana(diaR, valorRecebido);
				System.out.println(" ");
				}
			
			somaContas=0;
			somaRecebimentos=0;
			
			for (int i=0; i<numPags; i++) {
				somaContas+=vect[i].getValorPago();
			}
			
			for (int i=0; i<numReceb; i++) {
				somaRecebimentos+=vect2[i].getValorRecebido();
			}
			
			System.out.println("Valores pagos durante a semana");
			System.out.println(" ");
			
			for (int i=0; i<numPags; i++) {
				System.out.printf(vect[i].getDiaC()+": ");
				System.out.printf(vect[i].getValorPago()+" ");
				System.out.println(" ");
			}
			
			System.out.println(" ");
			System.out.println("Valores recebidos durante a semana");
			System.out.println(" ");
			
			for (int i=0; i<numReceb; i++) {
				System.out.printf(vect2[i].getDiaR()+": ");
				System.out.printf(vect2[i].getValorRecebido()+" ");
				System.out.println(" ");
			}
			
			saldoFinal=saldoInicial-somaContas+somaRecebimentos;
			
			System.out.println(" ");
			System.out.printf("Saldo inicial da semana: R$ " + saldoInicial);
			System.out.println(" ");
			System.out.printf("Contas a pagar da semana: R$ " + somaContas);
			System.out.println(" ");
			System.out.printf("Contas a receber da semana: R$ " + somaRecebimentos);
			System.out.println(" ");
			System.out.printf("Saldo final da semana: R$ " + saldoFinal);
			System.out.println(" ");
			System.out.println(" ");
						
		break;
			
		case 2:
			System.out.println("- Fluxo de caixa mensal -");
			System.out.println(" ");
			sc.nextLine();
			System.out.print("Digite o mês de lançamento: ");
			mes=sc.nextLine();
			System.out.println(" ");
			System.out.print("Digite o saldo inicial do mês: R$ ");
			saldoInicial=sc.nextDouble();
			System.out.println(" ");
			System.out.print("Digite o número de pagamentos durante o mês: ");
			numPags=sc.nextInt();
			
			Contas_mes[] vect3 = new Contas_mes[numPags];
			System.out.println(" ");
			
			for (int i=0; i<numPags; i++) {	
				sc.nextLine();
				System.out.print("Data do pagamento: ");
				String dataC = sc.nextLine();
				System.out.print("Valor do pagamento: R$ ");
				double valorPagoMes = sc.nextDouble();
				vect3[i] = new Contas_mes(dataC, valorPagoMes);
				System.out.println(" ");
				
				}
			
			System.out.println(" ");
			System.out.print("Digite o número de recebimentos durante o mês: ");
			numReceb=sc.nextInt();
						
			Receber_mes[] vect4 = new Receber_mes[numReceb];
			System.out.println(" ");
			
			for (int i=0; i<numReceb; i++) {
				sc.nextLine();
				System.out.print("Data do recebimento: ");
				String dataR = sc.nextLine();
				System.out.print("Valor do recebimento: R$ ");
				double valorRecebidoMes = sc.nextDouble();
				vect4[i] = new Receber_mes(dataR, valorRecebidoMes);
				System.out.println(" ");
				}
			
			somaContas=0;
			somaRecebimentos=0;
			
			for (int i=0; i<numPags; i++) {
				somaContas+=vect3[i].getValorPagoMes();
			}
			
			for (int i=0; i<numReceb; i++) {
				somaRecebimentos+=vect4[i].getValorRecebidoMes();
			}
			
			saldoFinal=saldoInicial-somaContas+somaRecebimentos;
			
			System.out.println("Valores pagos durante o mês");
			System.out.println(" ");
			
			for (int i=0; i<numPags; i++) {
				System.out.printf(vect3[i].getDataC()+": ");
				System.out.printf(vect3[i].getValorPagoMes()+" ");
				System.out.println(" ");
			}
			
			System.out.println(" ");
			System.out.println("Valores recebidos durante o mês");
			System.out.println(" ");
			
			for (int i=0; i<numReceb; i++) {
				System.out.printf(vect4[i].getDataR()+": ");
				System.out.printf(vect4[i].getValorRecebidoMes()+" ");
				System.out.println(" ");
			}
			
			System.out.println(" ");
			System.out.printf("Saldo inicial em "+ mes +": R$ " + saldoInicial);
			System.out.println(" ");
			System.out.printf("Contas a pagar em " + mes +": R$ " + somaContas);
			System.out.println(" ");
			System.out.printf("Contas a receber em " + mes +": R$ " + somaRecebimentos);
			System.out.println(" ");
			System.out.printf("Saldo final em " + mes +": R$ " + saldoFinal);
			System.out.println(" ");
			System.out.println(" ");
			
		break;	
			
		case 3:
		
			System.out.println("- Fluxo de caixa anual -");
			System.out.println(" ");
			sc.nextLine();
			System.out.print("Digite o ano de lançamento: ");
			ano=sc.nextInt();
			System.out.print("Digite o saldo inicial do ano: R$ ");
			saldoInicial=sc.nextDouble();
			System.out.println(" ");
		
		break;	
					
		case 4:
			
			System.out.print("Programa encerrado!");
		
		}	
		
		break;	
		
		}while (menu<4);
		
		sc.close();	
	
	}
}

