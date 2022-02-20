
public class Recta{
	private Punto puntoA;
	private Punto puntoB;

  public Recta(){
		
	}

	public Punto getPuntoA() {
		return puntoA;
	}

	public Punto getPuntoB() {
		return puntoB;
	}

	public void setPuntoA(Punto punto){
		this.puntoA = punto;
	}

	public void setPuntoB(Punto punto){
		this.puntoB = punto;
	}

	public String toString(){
		return String.format("%s%s", getPuntoA(), getPuntoB());
	}
    
}