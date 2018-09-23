package view;

import java.util.Iterator;
import java.util.Scanner;

import controle.EventoControle;
import modelo.Aniversario;
import modelo.Evento;
import modelo.Feriado;
import modelo.Tarefa;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao =0;
		int tipoEvento = 0;
		int codigo;
		
		String nome;
		String dataInicio;
		String horaInicio;
		String local;
		String dataTermino;
		Evento evento;
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
					nome = tc.nextLine();
					System.out.println("== INFORME O LOCAL======");
					local = tc.nextLine();
					System.out.println("== INFORME A DATA (DD/MM/AAAA)");
					dataInicio = tc.nextLine();
					System.out.println("== INFORME A HORA (HH:MM)======");
					horaInicio = tc.nextLine();
					codigo = controleEventos.buscarTodos().size()+1;
					evento = new Evento(codigo, nome, dataInicio, local, horaInicio);
					controleEventos.cadastrar(evento);
					break;
				case 2:
					System.out.println("== INFORME A DESCRIÇÃO DA TAREFA======");
					tc.nextLine();
					String descricao = tc.nextLine();
					System.out.println("== INFORME O STATUS DA TAREFA(Concluida: S/N)======");
					boolean status = tc.nextLine()=="S"?true:false;
					System.out.println("== INFORME A DATA DE CONCLUSÃO (DD/MM/AAAA)");
					dataTermino = tc.nextLine();
					System.out.println("== INFORME A PRIORIDADE DA TAREFA(Alta/Media/Baixa)======");
					String prioridade = tc.nextLine();
					codigo = controleEventos.buscarTodos().size()+1;
					evento = new Tarefa(codigo, dataTermino, descricao, status, prioridade);
					controleEventos.cadastrar(evento);					
					break;
				case 3:
					System.out.println("== INFORME O NOME DO FERIADO======");
					tc.nextLine();
					nome = tc.nextLine();
					System.out.println("== INFORME A DATA (DD/MM/AAAA)");
					dataInicio = tc.nextLine();
					System.out.println("== O FERIADO É NACIONAL? (SIM/NÃO)======");
					String abrangencia = tc.nextLine();
					codigo = controleEventos.buscarTodos().size()+1;
					evento = new Feriado(codigo, nome, dataInicio, abrangencia);
					controleEventos.cadastrar(evento);
					break;
				case 4:
					System.out.println("== INFORME O NOME DO ANIVERSARIANTE======");
					tc.nextLine();
					String nomeAniversariante = tc.nextLine();
					System.out.println("== INFORME O LOCAL======");
					local = tc.nextLine();
					System.out.println("== INFORME A DATA (DD/MM/AAAA)");
					dataInicio = tc.nextLine();
					System.out.println("== INFORME A HORA (HH:MM)======");
					horaInicio = tc.nextLine();
					System.out.println("== INFORME A DATA DA FESTA (DD/MM/AAAA)");
					String dataFesta = tc.nextLine();
					codigo = controleEventos.buscarTodos().size()+1;
					evento = new Aniversario(codigo, nomeAniversariante, dataInicio, 
							local, horaInicio, dataFesta);
					controleEventos.cadastrar(evento);
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
