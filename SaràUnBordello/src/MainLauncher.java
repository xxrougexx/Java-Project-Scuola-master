
public class MainLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcheggio p=new Parcheggio(0,3,5,0);
		
		
		p.ingresso();
		if(p.ingresso()==false){
			System.out.println("Non ci sono posti disponibili");
		}
		
		p.uscita();
		if(p.uscita()==false){
			System.out.println("Non sono presenti auto");
		}
		
		int liberi=p.postiLiberi();
		System.out.println("I posti disponibili sono: "+liberi);
		
		int soldiInc=p.incasso();
		System.out.println("L'incasso totale è "+soldiInc);
		
		int valore=p.valoreLordo();
		System.out.println("Il valore totale è "+valore);
		
		int valP=p.valoreParcheggio();
		System.out.println("Il valore del parcheggio è "+valP);
		
	}

}
