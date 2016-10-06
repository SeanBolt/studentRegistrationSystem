import org.joda.time.LocalDate;
import org.joda.time.Years;

import java.util.ArrayList;

/**
 * Created by Sean Bolton on 24/09/2016.
 * This class manages the student model
 */


public class Student {

    private String firstName;
    private String surname;
    private String username;
    private int age;
    private String id;
    private LocalDate dob;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private CourseProgramme course;


    public Student(String firstName,String surname, String id, LocalDate dob) {
        this.firstName = firstName;
        this.surname = surname;
        this.id = id;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        String username = this.firstName + this.surname + this.getAge();
        return username.toLowerCase();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        Years age = Years.yearsBetween(this.dob, new LocalDate());
        return age.getYears();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void addModule(Module module) {
        this.modules.add(0, module);
    }

    public CourseProgramme getCourse() {
        return course;
    }

    public void setCourse(CourseProgramme course) {
        this.course = course;
    }
}
