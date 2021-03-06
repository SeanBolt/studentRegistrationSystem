import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Sean Bolton on 24/09/2016.
 * JUnit4 tests for student class
 */
public class StudentTest {

    @Test
    public void getAge() throws Exception {
        LocalDate testDob = new LocalDate(1995, 8, 24);
        Student testStudent = new Student("Sean", "Bolton", "13382146", testDob);
        int generatedAge = testStudent.getAge();
        int expectedAge = 21;

        assertEquals(expectedAge, generatedAge);
    }

    @org.junit.Test
    public void getUsername() throws Exception {
        LocalDate testDob = new LocalDate(1995, 8, 24);
        Student testStudent = new Student("Sean", "Bolton", "13382146", testDob);
        String generatedUsername = testStudent.getUsername();
        String expectedUsername = "seanbolton21";

        assertEquals(expectedUsername, generatedUsername);
    }

    @Test
    public void addModule() throws Exception {
        Student student = new Student("Sean", "Bolton", "13382146", new LocalDate(1995, 5, 5));
        Module module = new Module("Programming", "CT123", new ArrayList<Student>());

        student.addModule(module);
    }

}