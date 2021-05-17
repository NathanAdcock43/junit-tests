import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWOne;
    Cohort cohortWMany;

    @Before
    public void init(){

        emptyCohort = new Cohort();
        cohortWOne = new Cohort();
        cohortWMany = new Cohort();

        Student nate = new Student(10L, "Nathan");
        Student tom = new Student(20L, "Tom");

        nate.addGrade(89);
        nate.addGrade(78);

        tom.addGrade(97);
        tom.addGrade(92);
        cohortWOne.addStudent(nate);
        cohortWMany.addStudent(nate);
        cohortWMany.addStudent(tom);

    }

    @Test
    public void testAddStudent(){
        assertEquals(1, cohortWOne.getStudents().size());
        assertEquals(2, cohortWMany.getStudents().size());
    }

    @Test
    public void testGetStudents(){
        assertEquals(10, cohortWMany.getStudents().get(0).getId());
        assertEquals(20, cohortWMany.getStudents().get(1).getId());
    }

    @Test
    public void testCohortAvg(){
        assertEquals(70, cohortWOne.getCohortAverage(), 0.5);
        assertEquals(77.5, cohortWMany.getCohortAverage(), 0.5);
    }

}
