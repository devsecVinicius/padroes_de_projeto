import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
	
	public static void main (String[] args) {
		int opcao = 0;
		List<MidiaAbstrata> midias = new ArrayList<MidiaAbstrata>();
		ManipularMidia manipularMidia = new ManipularMidia();
		Menus menus = new Menus();
		String nome = "Vazio";
		int op = 0;
		Speed speed = null;
		
		while( opcao != 666 ){
			menus.printMenu();
			opcao = inputInt();
			
			switch(opcao) {
				case 1:
					menus.printMenuOp1();
					nome = inputString();
					MidiaAbstrata  midiaAbstrata= manipularMidia.selecionarMidia(midias, nome);
					System.out.println("\n\t"+midiaAbstrata.getNome()+"."+midiaAbstrata.getExtensao());
					if( !(midiaAbstrata instanceof NullMidia) ){
						System.out.println("\n\n\tDeseja reproduzir " + midiaAbstrata.getNome() + "." + midiaAbstrata.getExtensao() + " ?");
						System.out.println("\n\t1) Sim");
						System.out.println("\n\t2) Nao");
						System.out.print("\n\n>>> ");
						op = inputInt();
						if( op == 1 ){
							System.out.println("\n\n\tReproduzindo: " + midiaAbstrata.getNome() );
						}
					}
				break;
				case 2: // VER MIDIAS
					menus.printMenuOp2();
					manipularMidia.imprimirMidias(midias);
				break;
				case 3: // ADICIONAR MIDIA
					op = 0;
					menus.printMenuOp3();
					op = inputInt();
					if(op != 1 && op != 2 && op != 3 && op != 4 )
						System.out.println("\nOpcao Invalida!!!");
					else{
						if( op == 1){ // ADICIONAR MUSICA
							System.out.print("\nDigite o nome da musica: ");
							nome = inputString();
							manipularMidia = new ManipularMidia(new AdicionarMusica(), nome);
							midias.add(manipularMidia.addMidia.adicionar(nome));
						}
						if( op == 2){ // ADICIONAR VIDEO
							System.out.print("\nDigite o nome do video: ");
							nome = inputString();
							manipularMidia = new ManipularMidia(new AdicionarVideo(), nome);
							midias.add(manipularMidia.addMidia.adicionar(nome));
						}
						if( op == 3){ // ADICIONAR OUTRO TIPO DE MIDIA
							System.out.print("\nDigite o nome da midia: ");
							nome = inputString();
							System.out.print("\nDigite a extensao do arquivo: ");
							String ext = inputString();
							manipularMidia = new ManipularMidia(new AdicionarMidia(ext), nome);
							midias.add(manipularMidia.addMidia.adicionar(nome));
						}
						if( op == 4){ // VOLTAR
							continue;
						}
					}
				break;
				case 4:
					while(true){
						menus.printMenuOp4();
						op = inputInt();
						if( op == 1 ){
							if( speed != null ){
								speed.changeSpeed();
							}else{
								speed = new Speed();
							}
						}
						if( op == 2 ){
							break;
						}
					}
				break;
			}
		}
		
	}// final da main
	
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
