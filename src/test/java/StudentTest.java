import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfStudentCanBeCreated() {
        Student nate = new Student(1L, "Nathan");
        Student nullStudent = null;
        assertNotNull(nate);
        assertNull(nullStudent);
    }

    @Test
    public void testFieldsAreSet(){
//        long
        Student nate = new Student(1L, "Nathan");
        assertEquals(1L, nate.getId());
        assertEquals("Nathan", nate.getName());
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
