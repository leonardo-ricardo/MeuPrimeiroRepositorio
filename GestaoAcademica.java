import java.util.Scanner;
public class GestaoAcademica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double prova, proj, exercicios, notaM, media, mediaNecessaria, mediaLista, mediaTotal;
		
		System.out.print("Digite a nota da Prova: ");
		prova = sc.nextDouble();
		
		System.out.println("Digite a nota do Projeto: ");
		proj = sc.nextDouble();
		
		System.out.println("Digite a nota da Lista de Exercicios: ");
		exercicios = sc.nextDouble();
		
		System.out.println("Digite a nota de MOOCS: ");
		notaM = sc.nextDouble();
		
		media = (prova + proj + notaM) / 3;
		mediaLista = (exercicios) / 2;
		mediaTotal = (media + mediaLista);
		mediaNecessaria = (mediaTotal - 10);
		
		if(media >= 8) {
			System.out.println("Você foi Aprovado com média" + mediaTotal + "Parabéns !!");
		}
			else {
				System.out.println("Você foi reprovado, necessita tirar nota " +mediaNecessaria+ " para ser aprovado");
				
			}
		

		sc.close();
		
	}

}
