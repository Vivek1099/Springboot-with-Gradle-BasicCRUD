package Spring_with_Gradle_Groovy_CRUD;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student,Integer>
{
    List<Student> findByFname(String fname);
    List<Student> findByScity(String scity);
}
