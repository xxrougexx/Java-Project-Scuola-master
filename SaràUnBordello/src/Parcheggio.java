
public class Parcheggio {
	private int n_ingressi;
	private int n_posti;
	private int costo_posto;
	private int n_posti_occupati;
	
	
	//Metodo Costruttore
	public Parcheggio(int n_ingressi,int n_posti,int costo_posto,int n_posti_occupati){
		this.setN_ingressi(n_ingressi);
		this.setN_posti(n_posti);
		this.setCosto_posto(costo_posto);
		this.setN_posti_occupati(n_posti_occupati);
	}
	
	
	//Getters and Setters
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
	//Funzioni
	public boolean ingresso(){
		this.n_posti_occupati++;
		this.n_ingressi++;
		if(this.getN_posti_occupati()-this.getN_posti()==0){
			return false;
		}
		else{
			return true;
		}
	}
	public boolean uscita(){
		if (this.getN_posti_occupati()==0){
			return false;
		}
		else{
			this.n_posti_occupati--;
			return true;
		}
	}
	public int postiLiberi(){
		int postiLib=0;
		postiLib = this.n_posti-this.n_posti_occupati;
		return postiLib;
	}
	public int incasso(){
		int soldi=0;
		soldi=soldi+valoreParcheggio();
		return soldi;
	}
	public int valoreParcheggio(){
		int val=0;
		val=val+(this.getN_posti_occupati()*this.getCosto_posto());
		return val;
	}
	public int valoreLordo(){
		int valLor=0;
		valLor=valLor+incasso()+valoreParcheggio();
		return valLor;

	}











}
