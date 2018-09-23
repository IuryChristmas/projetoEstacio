package view;

import java.util.Iterator;
import java.util.Scanner;

import controle.EventoControle;
import modelo.Aniversario;
import modelo.Evento;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao =0;
		int tipoEvento = 0;
		Scanner tc = new Scanner(System.in);
		EventoControle controleEventos = new EventoControle();
		do
		{
			System.out.println("================MENU=============");
			System.out.println("===ESCOLHA UMA OPÇÃO=============");
			System.out.println("== 1: CADASTRAR==================");
			System.out.println("== 2: BUSCAR=====================");
			System.out.println("== 3: LISTAR TODOS=====================");
			System.out.println("== 4: SAIR==================");
			opcao = tc.nextInt();
			switch(opcao)
			{
			case 1:
				System.out.println("== 1: CADASTRAR==================");
				System.out.println("== SELECIONE O TIPO DE EVENTO");
				System.out.println("== 1: COMPROMISSO==================");
				System.out.println("== 2: TAREFA=====================");
				System.out.println("== 3: FERIADO=====================");
				System.out.println("== 4: ANIVERSARIO=====================");
				tipoEvento = tc.nextInt();
				
				switch(tipoEvento) {
				case 1:
					System.out.println("== INFORME O NOME DO EVENTO======");
					tc.nextLine();
					String nome = tc.nextLine();
					System.out.println("== INFORME O LOCAL======");
					String local = tc.nextLine();
					System.out.println("== INFORME A DATA (DD/MM/AAAA)");
					String dataInicio = tc.nextLine();
					System.out.println("== INFORME A HORA (HH:MM)======");
					String horaInicio = tc.nextLine();
					int codigo = controleEventos.buscarTodos().size()+1;
					Evento e = new Evento(codigo, nome, dataInicio, local, horaInicio);
					controleEventos.cadastrar(e);
					break;
				case 2:
					System.out.println("Em construção!");
					break;
				case 3:
					System.out.println("Em construção!");
					break;
				case 4:
					System.out.println("== INFORME O NOME DO ANIVERSARIANTE======");
					tc.nextLine();
					String nomeAniversariante = tc.nextLine();
					System.out.println("== INFORME O LOCAL======");
					String localAniversario = tc.nextLine();
					System.out.println("== INFORME A DATA (DD/MM/AAAA)");
					String dataInicioAniversario = tc.nextLine();
					System.out.println("== INFORME A HORA (HH:MM)======");
					String horaInicioAniversario = tc.nextLine();
					System.out.println("== INFORME A DATA DA FESTA (DD/MM/AAAA)");
					String dataFesta = tc.nextLine();
					int codigoAniversario = controleEventos.buscarTodos().size()+1;
					Evento eAniversario = new Aniversario(codigoAniversario, nomeAniversariante, dataInicioAniversario, 
							localAniversario, horaInicioAniversario, dataFesta);
					controleEventos.cadastrar(eAniversario);
					break;
				}
				
 			break;
			case 2:
				System.out.println("== 2: BUSCAR==================");
				System.out.println("== INFORME O CODIGO ==========");
				int codigoInformado = tc.nextInt();
				Evento eventoEncontrado = controleEventos.buscar(codigoInformado);
				System.out.println(eventoEncontrado.toString());
				break;
			case 3:
				for (int i = 0; i <controleEventos.buscarTodos().size(); i++) {
					System.out.println(controleEventos.buscarTodos().get(i).toString());
				}
				break;
			case 4:
				System.exit(0);
				break;
			}
			
		}while(opcao!=4);

	}

}
