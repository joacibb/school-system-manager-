package ar.com.school.manager;

import ar.com.school.entities.StudentEntity;

public interface StudentService {
    public StudentEntity save(StudentEntity student);
    public void delete(Integer id);
    public StudentEntity findById(Integer id);
    public List<StudentEntity> findAll();
}
