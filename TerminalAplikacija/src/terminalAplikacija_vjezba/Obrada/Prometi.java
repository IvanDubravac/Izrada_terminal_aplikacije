package terminalAplikacija_vjezba.Obrada;

import java.util.ArrayList;
import java.util.List;

import terminalAplikacija_vjezba.Start;
import terminalAplikacija_vjezba.model.Proizvod;
import terminalAplikacija_vjezba.model.Promet;
import terminalAplikacija_vjezba.model.Zaposlenik;

public class Prometi {

	private Start start;
	private List<Promet> prometi;

	public Prometi(Start start) {
		super();
		prometi = new ArrayList<>();
		this.start = start;
	}

	public Prometi(Start start, List<Promet> prometi) {
		super();
		this.start = start;
		this.prometi = prometi;
	}

	public Start getStart() {
		return start;
	}

	public void setStart(Start start) {
		this.start = start;
	}

	public List<Promet> getPrometi() {
		return prometi;
	}

	public void setPrometi(List<Promet> prometi) {
		this.prometi = prometi;
	}

}
