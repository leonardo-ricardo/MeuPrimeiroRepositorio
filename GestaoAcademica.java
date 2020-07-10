import java.util.Scanner;
public class GestaoAcademica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a nota da Prova: ");
		String prova1 = sc.nextLine();
		System.out.println("Digite a nota do Projeto: ");
		String proj1 = sc.nextLine();
		System.out.println("Digite a nota da Lista de Exercicios: ");
		String lste = sc.nextLine();
		System.out.println("Digite a nota de MOOCS: ");
		String notaM = sc.nextLine();
		String Media = prova1 + proj1 + lste + notaM;
		int mediaConvertida = Integer.parseInt(Media);
		int MediaFinal = 8;
		int notaMinima = MediaFinal - 10; 
		
		boolean Aprovado = mediaConvertida >= MediaFinal;
		
		if(Aprovado) {
			System.out.println("Você foi Aprovado!! Parabéns!");
		}else {
			System.out.print("Ah não, você Reprovou! Tire no minimo" + notaMinima + "para passar!");
		}
		sc.close();
		
	}

}
