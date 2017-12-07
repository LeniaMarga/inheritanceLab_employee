import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager ("Mike", "BB98470", (double) 600000, "Payroll");
    }

    @Test
    public void canGetDepName(){
        assertEquals("Payroll", manager.getDeptName ());
    }

}
