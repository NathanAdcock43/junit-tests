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
        return this.id;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
            grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){

        int bucket = 0;
        for (int i = 0 ; i < grades.size(); i++){
            bucket = bucket + grades.get(i);
        }
        return bucket / grades.size();
    }

}
