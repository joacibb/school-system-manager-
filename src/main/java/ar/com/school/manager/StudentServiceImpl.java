package ar.com.school.manager;

import ar.com.school.entities.StudentEntity;
import ar.com.school.models.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDAO studentDao;

    @Override
    public StudentEntity save(StudentEntity student) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public StudentEntity findById(Integer id) {
        return null;
    }

    @Override
    public List<StudentEntity> findAll() {
        return null;
    }
}
