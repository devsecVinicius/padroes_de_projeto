import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
	
	public static void main (String[] args) {
		int opcao = 0;
		List<Midia> midias = new ArrayList<Midia>();
		
		while( opcao != 666 ){
			printMenu();
			opcao = inputInt();
			
			switch(opcao) {
				case 2: // VER MIDIAS
				System.out.println(midias.size());
					int i = 0;
					printMenuOp2();
					for(i = 0; i < midias.size() ; ++i) {
						System.out.println("Nome = " + midias.get(i).nome+"."+midias.get(i).extensao);
					}
				break;
				case 3: // ADICIONAR MIDIA
					int op = 0;
					printMenuOp3();
					op = inputInt();
					String nome;
					if( op == 1){ // ADICIONAR MUSICA
						InterfaceAdicionarMidia addMidia = new AdicionarMusica();
						System.out.print("\nDigite o nome da musica: ");
						nome = inputString();
						midias.add(addMidia.adicionar(nome));
					}
					if( op == 2){ // ADICIONAR VIDEO
						InterfaceAdicionarMidia addMidia = new AdicionarVideo();
						System.out.print("\nDigite o nome do video: ");
						nome = inputString();
						midias.add(addMidia.adicionar(nome));
					}
				break;
			}
		}
		
	}
	
	public static void printMenu(){
		System.out.println("\n\n\t--------------------------");
		System.out.println("\t  Player de Video/Musica");
		System.out.println("\t--------------------------");
		System.out.println("\n 1) Selecionar Midia");
		System.out.println("\n 2) Ver Midia(s)");
		System.out.println("\n 3) Adicionar Midia");
		System.out.println("\n 666) Sair");
		System.out.print("\n\n>>> ");
	}
	
	public static void printMenuOp3(){
		System.out.println("\n\n\t--------------------------");
		System.out.println("\t  Adicionar Video/Musica");
		System.out.println("\t--------------------------");
		System.out.println("\n 1) Adicionar Musica");
		System.out.println("\n 2) Adicionar Video");
		System.out.print("\n\n>>> ");
	}
	public static void printMenuOp2(){
		System.out.println("\n\n\t--------------------------");
		System.out.println("\t\t  Midias");
		System.out.println("\t--------------------------\n\n");
	}
	
	public static int inputInt(){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		return input;
	}
	
	public static double inputDouble(){
		Scanner scanner = new Scanner(System.in);
		double input = scanner.nextDouble();
		return input;
	}

	public static String inputString(){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		return input;
	}
}
