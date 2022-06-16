package ar.com.school.manager;

import ar.com.school.entities.EmployeeEntity;
import ar.com.school.models.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDao){
        this.employeeDao = employeeDao;
    }

    @Override
    @Transactional(readOnly = false)
    public EmployeeEntity save(EmployeeEntity employee) {
        return employeeDao.save(employee);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeEntity> findAll() {
        return (List<EmployeeEntity>) employeeDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public EmployeeEntity findByID(Integer id) {
        return employeeDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        employeeDao.deleteById(id);
    }
}
