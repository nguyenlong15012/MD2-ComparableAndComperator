import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("Long", 22, "HN");
        Student student2 = new Student("Huy", 22, "TB");
        Student student3 = new Student("Linh", 26, "HN");
        Student student4 = new Student("Hien", 13, "HT");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for (Student student : lists){
            System.out.println(student.toString());
        }

        System.out.println("\n--------Comperator");
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi");
        for (Student student : lists){
            System.out.println(student.toString());
        }
    }
}
