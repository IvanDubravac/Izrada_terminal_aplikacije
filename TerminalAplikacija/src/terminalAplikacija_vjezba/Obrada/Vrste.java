package terminalAplikacija_vjezba.Obrada;

import java.util.ArrayList;
import java.util.List;

import terminalAplikacija_vjezba.Start;
import terminalAplikacija_vjezba.model.Vrsta;

public class Vrste {
	private Start start;
	private List<Vrsta> vrste;
	
public Vrste() {
		super();
		this.start=start;
		vrste=new ArrayList<>();
		
	}



	public Vrste(Start start, List<Vrsta> vrste) {
		super();
		this.start = start;
		this.vrste = vrste;
		
	}
	public Start getStart() {
		return start;
	}
	public void setStart(Start start) {
		this.start = start;
	}
	public List<Vrsta> getVrste() {
		return vrste;
	}
	public void setVrste(List<Vrsta> vrste) {
		this.vrste = vrste;
	}
}
