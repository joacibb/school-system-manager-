package ar.com.school.manager;

import ar.com.school.entities.StudentEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentService {
    public StudentEntity save(StudentEntity student);

    @Transactional(readOnly = false)
    void delete(Integer id);

    public StudentEntity findById(Integer id);
    public List<StudentEntity> findAll();
}
