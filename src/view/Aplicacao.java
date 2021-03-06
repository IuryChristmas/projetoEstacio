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
			System.out.println("===ESCOLHA UMA OP��O=============");
			System.out.println("== 1: CADASTRAR==================");
			System.out.println("== 2: EDITAR==================");
			System.out.println("== 3: EXCLUIR==================");
			System.out.println("== 4: BUSCAR=====================");
			System.out.println("== 5: LISTAR TODOS=====================");
			System.out.println("== 6: SAIR==================");
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
					System.out.println("== INFORME A DESCRI��O DA TAREFA======");
					tc.nextLine();
					String descricao = tc.nextLine();
					System.out.println("== INFORME O STATUS DA TAREFA(Concluida: S/N)======");
					boolean status = tc.nextLine()=="S"?true:false;
					System.out.println("== INFORME A DATA DE CONCLUS�O (DD/MM/AAAA)");
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
					System.out.println("== O FERIADO � NACIONAL? (SIM/N�O)======");
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
				System.out.println("== 2: EDITAR==================");
				for (int i = 0; i <controleEventos.buscarTodos().size(); i++) {
					System.out.println(controleEventos.buscarTodos().get(i).toString());
				}
				System.out.println("== INFORME O CODIGO ==========");
				int codigoEditar = tc.nextInt();
				Evento eventoParaEditar = controleEventos.buscar(codigoEditar);
				if(eventoParaEditar instanceof Aniversario) {
					System.out.println("== INFORME O NOME DO ANIVERSARIANTE======");
					tc.nextLine();
					((Aniversario) eventoParaEditar).setNomeAniversariante(tc.nextLine());
					System.out.println("== INFORME O LOCAL======");
					eventoParaEditar.setLocal(tc.nextLine());
					System.out.println("== INFORME A DATA (DD/MM/AAAA)");
					eventoParaEditar.setDataInicio(tc.nextLine());
					System.out.println("== INFORME A HORA (HH:MM)======");
					eventoParaEditar.setHoraInicio(tc.nextLine());
					System.out.println("== INFORME A DATA DA FESTA (DD/MM/AAAA)");
					((Aniversario) eventoParaEditar).setDataFesta(tc.nextLine());
					controleEventos.editar(eventoParaEditar);
				} else if(eventoParaEditar instanceof Feriado) {
					System.out.println("== INFORME O NOME DO FERIADO======");
					tc.nextLine();
					eventoParaEditar.setNome(tc.nextLine());
					System.out.println("== INFORME A DATA (DD/MM/AAAA)");
					eventoParaEditar.setDataInicio(tc.nextLine());
					System.out.println("== O FERIADO � NACIONAL? (SIM/N�O)======");
					((Feriado) eventoParaEditar).setAbrangencia(tc.nextLine());
					controleEventos.editar(eventoParaEditar);
				} else if(eventoParaEditar instanceof Tarefa) {
					System.out.println("== INFORME A DESCRI��O DA TAREFA======");
					tc.nextLine();
					eventoParaEditar.setDescricao(tc.nextLine());
					System.out.println("== INFORME O STATUS DA TAREFA(Concluida: S/N)======");
					((Tarefa) eventoParaEditar).setStatus(tc.nextLine()=="S"?true:false);
					System.out.println("== INFORME A DATA DE CONCLUS�O (DD/MM/AAAA)");
					eventoParaEditar.setDataTermino(tc.nextLine());
					System.out.println("== INFORME A PRIORIDADE DA TAREFA(Alta/Media/Baixa)======");
					((Tarefa) eventoParaEditar).setPrioridade(tc.nextLine());
					controleEventos.editar(eventoParaEditar);
				} else {
					System.out.println("== INFORME O NOME DO EVENTO======");
					tc.nextLine();
					eventoParaEditar.setNome(tc.nextLine());
					System.out.println("== INFORME O LOCAL======");
					eventoParaEditar.setLocal(tc.nextLine());
					System.out.println("== INFORME A DATA (DD/MM/AAAA)");
					eventoParaEditar.setDataInicio(tc.nextLine());
					System.out.println("== INFORME A HORA (HH:MM)======");
					eventoParaEditar.setHoraInicio(tc.nextLine());
					controleEventos.editar(eventoParaEditar);
				}
				break;
			case 3:
				System.out.println("== 3: EXCLUIR==================");
				for (int i = 0; i <controleEventos.buscarTodos().size(); i++) {
					System.out.println(controleEventos.buscarTodos().get(i).toString());
				}
				System.out.println("== INFORME O CODIGO ==========");
				int codigoExcluir = tc.nextInt();
				Evento eventoParaExcluir = controleEventos.buscar(codigoExcluir);
				controleEventos.remover(eventoParaExcluir);
				break;
			case 4:
				System.out.println("== 4: BUSCAR==================");
				System.out.println("== INFORME O CODIGO ==========");
				int codigoInformado = tc.nextInt();
				Evento eventoEncontrado = controleEventos.buscar(codigoInformado);
				System.out.println(eventoEncontrado.toString());
				break;
			case 5:
				for (int i = 0; i <controleEventos.buscarTodos().size(); i++) {
					System.out.println(controleEventos.buscarTodos().get(i).toString());
				}
				break;
			case 6:
				System.exit(0);
				break;
			}
			
		}while(opcao!=6);

	}

}
