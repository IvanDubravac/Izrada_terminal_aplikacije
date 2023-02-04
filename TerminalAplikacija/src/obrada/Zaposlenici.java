package obrada;

import java.util.ArrayList;
import java.util.List;

import model.Start;
import model.Zaposlenik;

public class Zaposlenici {
	
	private List<Zaposlenik> zaposlenici;
	private Start start;

	public Zaposlenici(Start start) {
		super();
		zaposlenici=new ArrayList<>();
		this.start=start;
	}
	
	public Zaposlenici(List<Zaposlenik> zaposlenici, Start start) {
		super();
		this.zaposlenici = zaposlenici;
		this.start = start;
	}





	public List<Zaposlenik> getZaposlenici() {
		return zaposlenici;
	}
	public void setZaposlenici(List<Zaposlenik> zaposlenici) {
		this.zaposlenici = zaposlenici;
	}
	public Start getStart() {
		return start;
	}
	public void setStart(Start start) {
		this.start = start;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	

}
