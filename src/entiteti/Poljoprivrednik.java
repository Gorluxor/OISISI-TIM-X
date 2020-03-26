package entiteti;
public class Poljoprivrednik extends Proizvodac {
	private int brojHektara;
	
	public Poljoprivrednik(String naziv, int brojHektara) {
		super(naziv);
		this.brojHektara = brojHektara;
		// Poljoprivrednik promenljiva = new Poljoprivrednik("test", 32);
	}
	
	public Poljoprivrednik(String naziv) {
		super(naziv);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getCena(String naziv) {
		
		for (int i = 0; i < this.prebroj(); i++) {
			if (this.getProizvodi()[i].compareTo(naziv) == 0) {
				return (float) (this.getCene()[i] * (1 - 0.02 * (this.brojHektara - 1)));    
			}
		}
		
		return -1;
	}

	public int getBrojHektara() {
		return brojHektara;
	}

	public void setBrojHektara(int brojHektara) {
		this.brojHektara = brojHektara;
	}

	
	
}
