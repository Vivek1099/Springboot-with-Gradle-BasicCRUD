package Spring_with_Gradle_Groovy_CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController
{
    @Autowired
    StudentRepository srepo;

    @GetMapping("/test")
    public String test()
    {
        return "This is demo gradle test CRUD";
    }

    @PostMapping("/save")
    public Student savedata(@RequestBody Student student)
    {
        srepo.save(student);
        return student;
    }

    @GetMapping("/show")
    public List<Student> showdata()
    {
        return srepo.findAll();
    }

    @GetMapping("/byid/{sid}")
    public Optional<Student> ById(@PathVariable int sid)
    {
        return srepo.findById(sid);
    }

    @GetMapping("byname/{fname}")
    public List<Student> Byname(@PathVariable String fname)
    {
        return srepo.findByFname(fname);
    }

    @GetMapping("bycity/{scity}")
    public List<Student> ByCity(@PathVariable String scity)
    {
        return srepo.findByScity(scity);
    }

    @PostMapping("/update/{sid}")
    public String update(@RequestBody Student student,@PathVariable int sid)
    {
        Student s = srepo.findById(sid).get();
        s.setFname(student.getFname());
        s.setLname(student.getLname());
        s.setScity(student.getScity());
        srepo.save(s);
        return "Data Updated";
    }

    @DeleteMapping("/delete/{sid}")
    public String delete(@PathVariable int sid)
    {
        srepo.deleteById(sid);
        return "Data deleted";
    }
}
