package ar.com.school.models;

import ar.com.school.entities.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<StudentEntity,Integer> {
}
