package plane.planeComponent.compartment.privateCompartment;

import employee.Employee;
import plane.planeComponent.compartment.PrivateCompartment;

public class EquipmentCompartment extends PrivateCompartment {
    public EquipmentCompartment(String d) { super(d); }
    
    @Override
    public boolean ready_check(){
        System.out.println(description + " is ready");
        return true;
    }
    
    @Override
     public boolean process(Employee em){ return em.workon(this); }
     
    public String get_description(){ return description; }
}
