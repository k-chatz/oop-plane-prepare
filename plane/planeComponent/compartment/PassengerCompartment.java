package plane.planeComponent.compartment;

import employee.Employee;
import java.util.Random;
import plane.planeComponent.PlaneComponent;

public class PassengerCompartment extends PlaneComponent{ 
    private PassengerCompartment pc;
	private int depth;
	
    public PassengerCompartment(String d, int position, int depth){
        super(d);
	   this.depth = depth;
	   Random rnd = new Random();
       if(rnd.nextBoolean()){
		   pc = new PassengerCompartment("Passenger Compartment #" + (position + 1)+ " (Inner: " + (depth + 1) + ")", position, depth + 1);
	   }
    }
    
    @Override
    public boolean ready_check(){
        System.out.println(description + " OK!");
        return true;
    }
    
    @Override
    public boolean process(Employee em){
         if(pc != null)
			pc.process(em);
         return em.workon(this);
    }
    
    public String get_description(){ return description; }
}
