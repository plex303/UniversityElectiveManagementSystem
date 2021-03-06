package za.ac.cput.elective.repository;

import za.ac.cput.elective.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Set;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
