package plane;

import employee.type.CleaningEmployee;
import employee.type.MaintenanceEmployee;
import employee.type.SecurityEmployee;

public class main {
    public static void main(String[] args) {
        
        Plane plane = new Plane("Plane","Aegean",100);
        
        SecurityEmployee s_e = new SecurityEmployee("Sandy");
        
        CleaningEmployee c_e = new CleaningEmployee("Spongebob");
        
        MaintenanceEmployee m_e = new MaintenanceEmployee("Mr. Crabs");
        
        plane.process(s_e);
        
        s_e.report();
        
        plane.process(c_e);
        
        c_e.report();
        
        plane.process(m_e);
        
        m_e.report();
        
        plane.ready_check();
        
    }
}
