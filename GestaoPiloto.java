import java.util.Scanner;

public class GestaoPiloto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double mediaBi, provaP, projetoP, exerciciosP, prova, proj, exercicios;
		
		System.out.print("Digite a nota da Prova: ");
		prova = sc.nextDouble();
		
		System.out.println("Digite a nota do Projeto: ");
		proj = sc.nextDouble();
		
		System.out.println("Digite a nota da Lista de Exercicios: ");
		exercicios = sc.nextDouble();
		
		
		provaP = (prova) / 5;
		projetoP = (proj) / 3;
		exerciciosP = (exercicios) / 2;
		
		mediaBi = (provaP + projetoP + exerciciosP);
		
		
		if(mediaBi >= 8) {
			System.out.println("Você foi aprovado com nota " +mediaBi+ "parabéns !!");
		}
			else if(mediaBi == 7.9 && mediaBi == 5) {
				System.out.println("Você deve realizar a Avaliação Final(AF)");
			
		}
			else{
				System.out.println("Você foi reprovado.");
			
		}
		

		sc.close();
		
	}

}

