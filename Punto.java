public class Punto {
  private int x;
  private int y;
  
  public Punto (double x, double y) {
     this.x = (int) x;
     this.y = (int) y;
  }
  
  public int getX() {
	  return this.x;
  }
  
  public int getY() {
	  return this.y;
  }

	public void setX(int x) {
	  this.x = x;
  }
  
  public void setY(int y) {
	  this.y = y;
  }
	  
	@Override
  public String toString(){
		return String.format("(%d,%d)", getX(), getY());	  
	  //return "(" + getX() + "," + getY() + ")";
  }
}