
package plane.planeComponent;

import employee.Employee;

public abstract class PlaneComponent {
    
    protected String description;
    
    public PlaneComponent(String d){ description = d; }
    
    public boolean ready_check(){ return true; }
    
    public boolean process(Employee em){ return true; }
    
}
