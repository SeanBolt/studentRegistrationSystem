import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by sean bolton on 06/10/2016.
 *
 */
public class ModuleTest {
    @Test
    public void addStudent() throws Exception {
        Student student = new Student("Sean", "Bolton", "13382146", new LocalDate(1995, 5, 5));
        Module module = new Module("Programming", "CT123", new ArrayList<Student>());

        module.addStudent(student);
    }

}