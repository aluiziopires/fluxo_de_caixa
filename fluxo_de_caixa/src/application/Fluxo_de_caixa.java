package application;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

import Entities4.Receber_mes;
import entities1.Contas_semana;
import entities2.Receber_semana;
import entities3.Contas_mes;
import entities5.Contas_ano;
import entities6.Receber_ano;

public class Fluxo_de_caixa {

	public static void main(String[] args) throws IOException {

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
				
			FileWriter arq = new FileWriter("C:\\relatoriosemanal.txt");
			PrintWriter gravarArq = new PrintWriter(arq);
			
			gravarArq.printf("Valores pagos durante a semana%n");
			gravarArq.printf("%n");
						
			for (int i=0; i<numPags; i++) {
				gravarArq.printf(vect[i].getDiaC()+": ");
				gravarArq.printf(vect[i].getValorPago()+"%n");
				gravarArq.printf("%n");
				}
			
			gravarArq.printf("Valores recebidos durante a semana%n");
			gravarArq.printf("%n");
						
			for (int i=0; i<numReceb; i++) {
				gravarArq.printf(vect2[i].getDiaR()+": ");
				gravarArq.printf(vect2[i].getValorRecebido()+" %n");
				gravarArq.printf("%n");
				}
						
			saldoFinal=saldoInicial-somaContas+somaRecebimentos;
			
			gravarArq.printf("%n");
			gravarArq.printf("RESUMO");
			gravarArq.printf("%n");
			gravarArq.printf("Saldo inicial da semana: R$ " + saldoInicial);
			gravarArq.printf("%n");
			gravarArq.printf("Contas a pagar da semana: R$ " + somaContas);
			gravarArq.printf("%n");
			gravarArq.printf("Contas a receber da semana: R$ " + somaRecebimentos);
			gravarArq.printf("%n");
			gravarArq.printf("Saldo final da semana: R$ " + saldoFinal);
			gravarArq.printf("%n");
			gravarArq.printf("%n");
			
			arq.close();
			
			System.out.println("Arquivo salvo!");
			
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
			
			FileWriter arq2 = new FileWriter("C:\\relatoriomensal.txt");
			PrintWriter gravarArq2 = new PrintWriter(arq2);
			
			gravarArq2.printf("Valores pagos durante o mês%n");
			gravarArq2.printf("%n");
			
			for (int i=0; i<numPags; i++) {
				gravarArq2.printf("Dia " +vect3[i].getDataC()+": ");
				gravarArq2.printf(vect3[i].getValorPagoMes()+"%n ");
			}
			
			gravarArq2.printf("%n");
			gravarArq2.printf("Valores recebidos durante o mês%n");
			gravarArq2.printf("%n");
			
			for (int i=0; i<numReceb; i++) {
				gravarArq2.printf("Dia " +vect4[i].getDataR()+": ");
				gravarArq2.printf(vect4[i].getValorRecebidoMes()+"%n ");
			}
			
			gravarArq2.printf("%n");
			gravarArq2.printf("RESUMO%n");
			gravarArq2.printf("%n");
			gravarArq2.printf("Saldo inicial em "+ mes +": R$ " + saldoInicial+"%n");
			gravarArq2.printf("%n");
			gravarArq2.printf("Contas a pagar em " + mes +": R$ " + somaContas+"%n");
			gravarArq2.printf("%n");
			gravarArq2.printf("Contas a receber em " + mes +": R$ " + somaRecebimentos+"%n");
			gravarArq2.printf("%n");
			gravarArq2.printf("Saldo final em " + mes +": R$ " + saldoFinal+"%n");
			gravarArq2.printf("%n");
			gravarArq2.printf("%n");
			
			arq2.close();
			
			System.out.println("Arquivo salvo!");
			
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
		
			System.out.print("Digite o número de pagamentos durante o ano: ");
			numPags=sc.nextInt();
			
			Contas_ano[] vect5 = new Contas_ano[numPags];
			System.out.println(" ");
			
			for (int i=0; i<numPags; i++) {	
				sc.nextLine();
				System.out.print("Mês do pagamento: ");
				String mesC = sc.nextLine();
				System.out.print("Valor do pagamento: R$ ");
				double valorPagoAno = sc.nextDouble();
				vect5[i] = new Contas_ano(mesC, valorPagoAno);
				System.out.println(" ");
				
				}
			
			System.out.println(" ");
			System.out.print("Digite o número de recebimentos durante o ano: ");
			numReceb=sc.nextInt();
						
			Receber_ano[] vect6 = new Receber_ano[numReceb];
			System.out.println(" ");
			
			for (int i=0; i<numReceb; i++) {
				sc.nextLine();
				System.out.print("Mês do recebimento: ");
				String mesR = sc.nextLine();
				System.out.print("Valor do recebimento: R$ ");
				double valorRecebidoAno = sc.nextDouble();
				vect6[i] = new Receber_ano(mesR, valorRecebidoAno);
				System.out.println(" ");
				}
			
			somaContas=0;
			somaRecebimentos=0;
			
			for (int i=0; i<numPags; i++) {
				somaContas+=vect5[i].getValorPagoAno();
			}
			
			for (int i=0; i<numReceb; i++) {
				somaRecebimentos+=vect6[i].getValorRecebidoAno();
			}
			
			saldoFinal=saldoInicial-somaContas+somaRecebimentos;
			
			FileWriter arq3 = new FileWriter("C:\\relatorioanual.txt");
			PrintWriter gravarArq3 = new PrintWriter(arq3);
			
			gravarArq3.printf("Valores pagos durante " +ano+"%n");
			gravarArq3.printf("%n");
			
			for (int i=0; i<numPags; i++) {
				gravarArq3.printf(vect5[i].getMesC()+": ");
				gravarArq3.printf(vect5[i].getValorPagoAno()+"%n ");
				gravarArq3.printf("%n");
			}
			
			gravarArq3.printf("Valores recebidos durante " +ano+"%n");
			gravarArq3.printf("%n");
			
			for (int i=0; i<numReceb; i++) {
				gravarArq3.printf(vect6[i].getMesR()+": ");
				gravarArq3.printf(vect6[i].getValorRecebidoAno()+"%n ");
				gravarArq3.printf("%n");
			}
			
			gravarArq3.printf("%n");
			gravarArq3.printf("RESUMO%n");
			gravarArq3.printf("%n");
			gravarArq3.printf("Saldo inicial em "+ ano +": R$ " + saldoInicial+"%n");
			gravarArq3.printf("%n");
			gravarArq3.printf("Contas a pagar em " + ano +": R$ " + somaContas+"%n");
			gravarArq3.printf("%n");
			gravarArq3.printf("Contas a receber em " + ano +": R$ " + somaRecebimentos+"%n");
			gravarArq3.printf("%n");
			gravarArq3.printf("Saldo final em " + ano +": R$ " + saldoFinal+"%n");
			gravarArq3.printf("%n");
			gravarArq3.printf("%n");
			
			arq3.close();
			
			System.out.println("Arquivo salvo!");
			
		break;	
					
		case 4:
			
			System.out.print("Programa encerrado!");
		}	
		
		break;	
		
		}while (menu<4);
		
		sc.close();	
	}
}