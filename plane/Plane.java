package plane;

import employee.Employee;
import plane.planeComponent.compartment.PassengerCompartment;
import plane.planeComponent.compartment.privateCompartment.CargoBay;
import plane.planeComponent.compartment.privateCompartment.EquipmentCompartment;

public class Plane {
    private String description;
    private String title;
    private int capacity;
    private int pc_size;
    private CargoBay cb;
    private EquipmentCompartment ec1;
    private EquipmentCompartment ec2;
    private EquipmentCompartment ec3;
    private PassengerCompartment pc[];
    
    public boolean ready_check(){
		ec1.ready_check();
        ec2.ready_check();
        ec3.ready_check();
        cb.ready_check();
        for(int i = 0; i < pc_size; i++)
            pc[i].ready_check();
		
       System.out.println(description + " "  + title + " is ready to take off!");
        return true;
    }
    
    public boolean process(Employee em){
        ec1.process(em);
        ec2.process(em);
        ec3.process(em);
        cb.process(em);
        for(int i = 0; i < pc_size; i++)
            pc[i].process(em);
        return true;
    }
    
    public Plane(String d, String t, int c){
       
        description = d;
        title = t;
        capacity = c;
        
		pc_size = capacity / 5;
		
        cb = new CargoBay("Cargo Bay");
        ec1 = new EquipmentCompartment("Equipment Compartment #1");
        ec2 = new EquipmentCompartment("Equipment Compartment #2");
        ec3 = new EquipmentCompartment("Equipment Compartment #3");
        
        pc = new PassengerCompartment[pc_size];
		
		if(pc_size == 0) 
			pc_size = 1;
		
        for(int i = 0; i < pc_size; i++)
            pc[i] = new PassengerCompartment("Passenger Compartment #" + (i + 1), i, 0);

        System.out.println("I create a plane with title: '" + title + "', description: '"
                + description + "' and capacity: " + capacity);
    }
    
    public String get_description(){ return description; }
    
}
