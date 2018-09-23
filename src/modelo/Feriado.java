package modelo;

public class Feriado extends Evento{

	private String abrangencia;
	
	public Feriado(int codigo, String nome, String dataInicio, String abrangencia) {
		super.setCodigo(codigo);
		super.setNome(nome);
		super.setDataInicio(dataInicio);
		this.abrangencia = abrangencia;
	}

	public String getAbrangencia() {
		return abrangencia;
	}

	public void setAbrangencia(String abrangencia) {
		this.abrangencia = abrangencia;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CODIGO: " +super.getCodigo()+ " FERIADO: "+super.getNome()+" DATA: "+super.getDataInicio()
				+" NACIONAL:"+getAbrangencia();
	}
}
