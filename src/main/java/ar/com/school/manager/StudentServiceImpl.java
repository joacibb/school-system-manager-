package ar.com.school.manager;

import ar.com.school.entities.StudentEntity;
import ar.com.school.models.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{


    private StudentDAO studentDao;
    @Autowired
    public StudentServiceImpl(StudentDAO studentDao){
        this.studentDao = studentDao;
    }

    @Override
    @Transactional(readOnly = false)
    public StudentEntity save(StudentEntity student) {
        return studentDao.save(student);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        studentDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public StudentEntity findById(Integer id) {
        return studentDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<StudentEntity> findAll() {
        return (List<StudentEntity>) studentDao.findAll();
    }
}
