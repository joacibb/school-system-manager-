package ar.com.school.manager;
import ar.com.school.entities.EmployeeEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeService {
     EmployeeEntity save(EmployeeEntity employee);

     List<EmployeeEntity> findAll();

    EmployeeEntity findByID(Integer id);

    @Transactional(readOnly = false)
     void delete(Integer id);

}
