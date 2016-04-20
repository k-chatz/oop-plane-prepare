package employee.type;

import employee.Employee;
import plane.planeComponent.compartment.PassengerCompartment;
import plane.planeComponent.compartment.privateCompartment.CargoBay;
import plane.planeComponent.compartment.privateCompartment.EquipmentCompartment;

public class SecurityEmployee  extends Employee{
  
    public SecurityEmployee(String n){ super(n);
        System.out.println("I create a security employee with name: " + name);
    }
    
   @Override
    public boolean workon(EquipmentCompartment pc){ 
        System.out.println("Security: " + name + " is working on " + pc.get_description());
        return true; 
    }
    
    @Override
    public boolean workon(PassengerCompartment pc){
        System.out.println("Security: " + name + " is working on " + pc.get_description());
        return true;
    }
    
    @Override
    public boolean workon(CargoBay cb){
         System.out.println("Security: " + name + " is working on " + cb.get_description());
         return true;
    }

    public void report() {
       System.out.println("Security report: Everything is OK!");
    }
}
