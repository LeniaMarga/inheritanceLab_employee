import Management.Director;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director ("Mary", "HJ7876", (double) 99000, "Human Resources", (double) 500000 );
    }

    @Test
    public void canGetBudget(){
        assertEquals(500000, director.getBudget (), 0.01);
    }

    @Test
    public void canPayBonus(){
        TestCase.assertEquals ( 1980, director.payBonus(), 0.01);
    }
}
