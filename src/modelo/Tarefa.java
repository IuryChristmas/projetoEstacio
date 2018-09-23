package modelo;

public class Tarefa extends Evento{

	private String prioridade;
	private boolean status;
	
	public Tarefa(int codigo, String dataTermino, String descricao, boolean status, String prioridade) {
		super.setCodigo(codigo);
		super.setDataTermino(dataTermino);
		super.setDescricao(descricao);
		this.status = status;
		this.prioridade = prioridade;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CODIGO: " +super.getCodigo()+ " DESCRIÇÃO TAREFA: "+super.getDescricao()+" DATA: "+super.getDataTermino()
		+" STATUS:"+ (isStatus()?"CONCLUIDO":"EM ANDAMENTO") + " PRIORIDADE: "+getPrioridade();
	}
}
