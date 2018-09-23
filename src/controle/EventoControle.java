package controle;

import java.util.ArrayList;
import java.util.List;
import modelo.Evento;

public class EventoControle {
	
	private List<Evento> eventos;
	private int posicaoEventoEncontrado;
	//-------------------metodos -----------------------------
	//construtores
	public EventoControle()
	{
		eventos = new ArrayList<>();
	}
	//funcionais
	//-----------buscar
	public Evento buscar(int codigo)
	{
		for(int i=0;i<eventos.size();i++)
		{
			if(eventos.get(i).getCodigo()==codigo)
			{
				posicaoEventoEncontrado = i;
				return eventos.get(i);
			}
		}
		return null;
	}
	//-----------cadastrar 
	public boolean cadastrar(Evento e)
	{
		if(buscar(e.getCodigo())==null)
		{
			eventos.add(e);
			return true;
		}
		else
			return false;
	}
	//-----------remover
	public boolean remover(Evento e)
	{
		if(buscar(e.getCodigo())!=null)
		{
			eventos.remove(posicaoEventoEncontrado);
			return true;
		}
		else
			return false;
	}
	//-----------editar
	public boolean editar(Evento e)
	{
		if(buscar(e.getCodigo())!=null)
		{
			eventos.set(posicaoEventoEncontrado, e);
			return true;
		}
		else
			return false;
	}
	//------------listar todos
	public List<Evento> buscarTodos()
	{
		return eventos;
	}

}
