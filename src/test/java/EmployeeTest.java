import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee ("Simon", "SS78356", (double) 30000);
    }

    @Test
    public void canGetName(){
        assertEquals("Simon", employee.getName());
    }

   @Test
    public void canSetName(){
        employee.setName ("Si");
        assertEquals ("Si", employee.getName ());
   }

    @Test
    public void cantSetNameNull(){
        employee.setName (null);
        assertEquals ("Cannot take in an empty String or null value", employee.getName ());
    }

   @Test
    public void canRaiseSalary(){
        employee.raiseSalary ((double) 1000);
        assertEquals (31000.0, employee.getSalary (), 0.01);
   }

   @Test
    public void canPayBonus(){
        assertEquals ( 300, employee.payBonus(), 0.01);
   }

    @Test
    public void cantNegativeRaiseSalary(){
        employee.raiseSalary ((double)-1000);
        assertEquals (30000, employee.getSalary (), 0.01);
    }


}
