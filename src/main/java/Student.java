import java.util.ArrayList;

public class Student {

    private Long id;

    private String name;

    private ArrayList<Integer> grades;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId(){
        return Student.id;
    }

    // returns the student's name
    public String getName(){
        return Student.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){

    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return ;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        return ;
    }

}
