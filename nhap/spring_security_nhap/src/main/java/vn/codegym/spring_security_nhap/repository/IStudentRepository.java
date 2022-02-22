package vn.codegym.spring_security_nhap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.spring_security_nhap.model.Student;
@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {
}
