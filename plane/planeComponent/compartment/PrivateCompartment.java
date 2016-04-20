package plane.planeComponent.compartment;

import employee.Employee;
import plane.planeComponent.PlaneComponent;

public abstract class PrivateCompartment extends PlaneComponent{
  
    public PrivateCompartment(String d){ super(d); }
    
    public abstract boolean ready_check();
    
    public abstract boolean process(Employee em);
}
