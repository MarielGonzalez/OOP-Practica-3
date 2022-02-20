
public class Diametro{
	
	// Faltan los identificadores. 
	// Estas variables tienen tipo pero no tienen nombre.
	private Punto pun;
  private Circunferencia circ;
  private Recta recta;

  public Diametro(Circunferencia c, Recta r){
			circ = c;
			recta = r; 

	}

	private void setCir(Punto p) {
		this.pun= p;
	}

	private void setRecta(Punto puntoA, Punto puntoB) {
		;
	}

	public Circunferencia getCirc(){
		return circ;

	}

		public Recta getRecta(){
		return recta;

	}
	
	public void setPuntoMedio(Recta r){
		double x = (r.getPuntoA().getX() + r.getPuntoB().getX())/2;
		double y = (r.getPuntoA().getY() + r.getPuntoB().getY())/2;
		Punto puntoMedio = new Punto(x, y);
		pun = puntoMedio;		
		
	}

	 

//TODO; emplear la logica indicada y quitar el placeholder
	private boolean esElDiametro(Recta r, Punto pun ){


  return true;
	}

	

	
	








}