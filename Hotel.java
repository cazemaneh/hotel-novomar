import java.util.ArrayList;

public class Hotel {
	
	  public ArrayList<Reserva> quartos;
	  Reserva reserva;
	  int quarto;
	  
	  
	public Hotel(int quarto) {
		this.quarto = quarto;
	}
	  
	
	public Hotel() {
	    quartos = new ArrayList<Reserva>();
	    quartos.ensureCapacity(2);
	    for (int i = 0; i < 2; i++) {
	      quartos.add(null);
	    }
	  }

	
	  
	  

}