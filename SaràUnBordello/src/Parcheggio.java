
public class Parcheggio {
	private int n_ingressi;
	private int n_posti;
	private int costo_posto;
	private int n_posti_occupati;
	private String strerrore;
	
	public int getN_ingressi() {
		return n_ingressi;
	}
	public void setN_ingressi(int n_ingressi) {
		this.n_ingressi = n_ingressi;
	}
	public int getN_posti() {
		return n_posti;
	}
	public void setN_posti(int n_posti) {
		this.n_posti = n_posti;
	}
	public int getCosto_posto() {
		return costo_posto;
	}
	public void setCosto_posto(int costo_posto) {
		this.costo_posto = costo_posto;
	}
	public int getN_posti_occupati() {
		return n_posti_occupati;
	}
	public void setN_posti_occupati(int n_posti_occupati) {
		this.n_posti_occupati = n_posti_occupati;
	}
	public String getStrerrore() {
		return strerrore;
	}
	public void setStrerrore(String strerrore) {
		this.strerrore = strerrore;
	}
	public boolean ingresso(){
		n_posti_occupati++;
		n_ingressi++;
		if(this.n_posti_occupati-this.n_posti==0){
			setStrerrore(this.strerrore);
			return false;
		}
		else{
			return true;
		}
	}
	public boolean uscita(){
		if (n_posti_occupati==0){
			setStrerrore(this.strerrore);
			return false;
		}
		else{
			n_posti_occupati--;
			return true;
		}
	}
	public int postiLiberi(){
		int postiLib;
		postiLib = n_posti-n_posti_occupati;
		return postiLib;
	}
	public int incasso(){
		int soldi=0;
		soldi=soldi+valoreParcheggio();
		return soldi;
	}
	public int valoreLordo(){
		int valLor=0;
		valLor=valLor+incasso()+valoreParcheggio();
		return valLor;
		
	}
	public int valoreParcheggio(){
		int val=0;
		val=val+(n_posti_occupati*costo_posto);
		return val;
	}
	
	
	
	
	
	
	
	
	
	
}


