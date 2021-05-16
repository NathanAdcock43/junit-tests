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
    public void testIfAddGradeWorks() {
        Student nate = new Student(1L, "Nathan");
        assertEquals(0, nate.getGrades().size());
        nate.addGrade(82);
        assertEquals(1, nate.getGrades().size());
        nate.addGrade(89);
        assertEquals(2, nate.getGrades().size());
    }

    @Test
    public void testGetGradeWorks(){
       Student nate = new Student(1L, "Nathan");
        nate.addGrade(82);
        nate.addGrade(89);
        assertSame(82, nate.getGrades().get(0));
        assertSame(89, nate.getGrades().get(1));
    }

    @Test
    public void testGetGradeAverage(){
         Student nate = new Student(1L, "Nathan");
        nate.addGrade(82);
        nate.addGrade(89);
        assertEquals(85.5, nate.getGradeAverage(),0);
        nate.addGrade(78);
        nate.addGrade(67);
        assertEquals(81,nate.getGradeAverage(),0);
    }
    }

}
