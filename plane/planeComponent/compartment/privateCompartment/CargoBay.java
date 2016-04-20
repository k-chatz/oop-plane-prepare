package plane.planeComponent.compartment.privateCompartment;

import employee.Employee;
import plane.planeComponent.compartment.PrivateCompartment;

public class CargoBay extends PrivateCompartment{
    private EquipmentCompartment ec;

    public CargoBay(String d){ super(d);
        ec = new EquipmentCompartment(description + "::equipment compartment");
    }
    
    @Override
        public boolean ready_check(){
        ec.ready_check();
        System.out.println(description + " is ready");
        return true;
    }
    
    @Override
     public boolean process(Employee em){
        return em.workon(this) && em.workon(ec);
    }
    
    public String get_description(){
        return description;
    }
     
}
