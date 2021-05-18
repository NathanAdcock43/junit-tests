import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private List<Student> students;

    public Cohort() {
        this.students = new ArrayList<>();
    }

    public double getCohortAverage() {
        double avg = 0;
        for (Student student: this.getStudents()) {
            avg += student.getGradeAverage();
        }
        return avg / this.getStudents().size();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}

//scrapes names of movie files
// cd "File location"
//        while IFS= read -r -d $'\0' file; do
//        duration=`mdls -name kMDItemDurationSeconds "$file" | cut -d "=" -f 2 `
//        duration=`printf "%.2f" $duration;`
//        codec=`mdls -name kMDItemCodecs "$file" | cut -d "=" -f 2`
//        temp="$i) [$file] $duration"
//        metaDataOutput=$metaDataOutput"\n"$temp
//        i=$((i + 1))
//        done < <(find .  \( -iname \*.m4v -o -iname \*.mov -o -iname \*.m4r -o -iname \*.m4a \)  -print0 )
//
//        echo -e  "\n[Report]\n"$metaDataOutput