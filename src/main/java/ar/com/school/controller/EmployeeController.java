package ar.com.school.controller;

import ar.com.school.*;
import ar.com.school.entities.EmployeeEntity;
import ar.com.school.manager.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping(value = "/api")
public class EmployeeController {
    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @GetMapping(value = "/employee/{id}")
    public EmployeeEntity getEmployee(@PathVariable("id") Integer idEmployee){
        return employeeService.findByID(idEmployee);
    }

    @GetMapping(value = "/employees")
    public List<EmployeeEntity> getStudents(){
        return employeeService.findAll();
    }

    @PostMapping(value = "/employee")
    public EmployeeEntity postStudent(@RequestBody EmployeeEntity student){
        return employeeService.save(student);
    }

    @PutMapping(value = "/employee/{id}")
    public EmployeeEntity updateStudent(@PathVariable("id") Integer idStudent, EmployeeEntity employee){
        EmployeeEntity actuallyEmployee = employeeService.findByID(idStudent);
        actuallyEmployee.setBirthday(employee.getBirthday());
        actuallyEmployee.setName(employee.getName());
        actuallyEmployee.setSurname(employee.getSurname());
        actuallyEmployee.setPhone(employee.getPhone());
        actuallyEmployee.setCourse(employee.getCourse());
        return employeeService.save(actuallyEmployee);
    }

    @DeleteMapping(value = "/employee/{id}")
    public void deleteStudent(@PathVariable("id") Integer id){
        employeeService.delete(id);
    }
}
