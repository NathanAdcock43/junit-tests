import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testGetId(){
//        long
        assertEquals(0, Student.id);
        assertEquals(1, Student.id);
    }

    @Test
    public void testGetName(){
//        String
        assertEquals("Codeup", Student.name("Codeup"));
        assertEquals("Nate", Student.name("Nate"));
        assertNotEquals("sam", Student.name("Sam"));
        assertEquals("124", Student.name("124"));
    }

    @Test
    public void testGetGrades(){
//        assertEquals("Codeup", Student.name("Codeup"));
//        assertEquals("Nate", Student.name("Nate"));
//        assertNotEquals("sam", Student.name("Sam"));
//        assertEquals("124", Student.name("124"));
//    }
    }

    @Test
    public void testGetGradeAverage(){
//        assertEquals("Codeup", Student.name("Codeup"));
//        assertEquals("Nate", Student.name("Nate"));
//        assertNotEquals("sam", Student.name("Sam"));
//        assertEquals("124", Student.name("124"));
//    }
    }

}
