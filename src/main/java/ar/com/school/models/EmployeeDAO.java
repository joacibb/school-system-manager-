package ar.com.school.models;
import ar.com.school.entities.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDAO extends CrudRepository<EmployeeEntity,Integer> {
}
