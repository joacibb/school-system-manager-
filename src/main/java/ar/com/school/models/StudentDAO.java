package ar.com.school.models;

import ar.com.school.entities.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends CrudRepository<StudentEntity,Integer> {
}
