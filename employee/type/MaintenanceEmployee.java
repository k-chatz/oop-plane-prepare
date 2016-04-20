package employee.type;

import employee.Employee;
import plane.planeComponent.compartment.PassengerCompartment;
import plane.planeComponent.compartment.privateCompartment.CargoBay;
import plane.planeComponent.compartment.privateCompartment.EquipmentCompartment;

public class MaintenanceEmployee extends Employee {
   
    public MaintenanceEmployee(String n) { super(n);
        System.out.println("I create a maintenance employee with name: " + name);
    }
 
    @Override
    public boolean workon(EquipmentCompartment ec){
         System.out.println("Maintenance: " + name + " is working on " + ec.get_description());
         return true; 
    }
    
    @Override
    public boolean workon(PassengerCompartment pc){
        System.out.println("Maintenance: " + name + " isn't authorized to work on " + pc.get_description());
        return false;
    }
    
    @Override
    public boolean workon(CargoBay cb){
         System.out.println("Maintenance: " + name + " is working on " + cb.get_description());
         return true;
    }    

    public void report() {
       System.out.println("Maintenance report: Everything is OK!");
    }
}
