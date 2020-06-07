package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PFisica;
import entities.PJuridica;
import entities.Pessoa;

public class ProgramPessoa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		List<Pessoa> listaPessoas = new ArrayList<>();

		System.out.print("Entre com o número de pessoas: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Pessoa #" + i);
			System.out.print("Pessoa fisica ou juridica(f/j) ?");
			char r = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();

			switch (r) {

			case 'f':
				System.out.print("Gastos com saude: ");
				double gastos = sc.nextDouble();
				PFisica pf = new PFisica(nome, renda, gastos);
				listaPessoas.add(pf);
				break;
			case 'j':
				System.out.print("Quantidade de Funcionarios: ");
				int qtd = sc.nextInt();
				PJuridica pj = new PJuridica(nome, renda, qtd);
				listaPessoas.add(pj);
				break;
			}

		}
		System.out.println("\nLista de Impostos ");
		System.out.println("--------------------------------------------------");
		
		double soma = 0.0;
		for (Pessoa p : listaPessoas) {
			double imposto = p.imposto();
			System.out.println(p.getNome() + " R$: " + String.format("%.2f", p.imposto()));
			soma = soma + imposto;
			
		}
		System.out.println();
		System.out.println("Total de impostos R$:" + String.format("%.2f", soma));
		

		sc.close();

	}

}
