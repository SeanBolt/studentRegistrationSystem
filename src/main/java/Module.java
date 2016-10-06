import java.util.ArrayList;

/**
 * Created by Sean Bolton on 24/09/2016.
 * This class manages the module model
 */

public class Module {

    private String name;
    private String id;
    private ArrayList<student> students;

    public module(String name, String id, ArrayList<student> students) {
        this.name = name;
        this.id = id;
        this.students = students;
    }

    public void addStudent(student student) {
        this.students.add(0, student);
    }

    public void removeStudent(student student) {
        int index = this.students.indexOf(student);
        this.students.remove(index);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<student> students) {
        this.students = students;
    }
}