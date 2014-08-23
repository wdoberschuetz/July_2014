package domainObjects;


import java.util.Date;

public class NationalGala extends Gala{
	
	// full argument constructor from superclass
	public NationalGala(Date galaDate, String galaName, int payment) {
		super(galaDate, galaName, payment);
	}

	// no-argument constructor is inherited from the superclass
	public NationalGala(){
		super();		
	}	
	
	
	
}