package employee;

import plane.planeComponent.compartment.PassengerCompartment;
import plane.planeComponent.compartment.privateCompartment.CargoBay;
import plane.planeComponent.compartment.privateCompartment.EquipmentCompartment;

public abstract class Employee {
  
    protected String name;
 
    public Employee(String n){ name = n; }

    public abstract boolean workon(EquipmentCompartment ec);
    public abstract boolean workon(PassengerCompartment pc);
    public abstract boolean workon(CargoBay cb);
}
