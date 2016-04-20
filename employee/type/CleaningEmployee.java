package employee.type;

import employee.Employee;
import plane.planeComponent.compartment.PassengerCompartment;
import plane.planeComponent.compartment.privateCompartment.CargoBay;
import plane.planeComponent.compartment.privateCompartment.EquipmentCompartment;

public class CleaningEmployee extends Employee{
    
    public CleaningEmployee(String n) { super(n);
        System.out.println("I create a cleaner employee with name: " + name);
    }
   
    @Override
    public boolean workon(EquipmentCompartment ec){ 
        System.out.println("Cleaner: " + name + " is'nt authorized to work on " + ec.get_description());
        return false; 
    }
    
    @Override
    public boolean workon(PassengerCompartment pc){
        System.out.println("Cleaner: " + name + " is working on " + pc.get_description());
        return true;
    }
    
    @Override
    public boolean workon(CargoBay cb){
         System.out.println("Cleaner: " + name + " is working on " + cb.get_description());
         return true;
    }
    
    public void report() {
       System.out.println("Cleaner report: Everything is OK!");
    }    
}
