
public class Circunferencia{
	private Punto pun;

	public Circunferencia(){
	}

	
	public Circunferencia(Punto punt){
		setCircunf(punt);
	}

	//TODO: Renombrar
	public void setCircunf(Punto p) {
		this.pun= p;
		
	}
	
	//TODO: Renombrar
	public Punto getCircunf() {
		return pun;
		
	}
	
}