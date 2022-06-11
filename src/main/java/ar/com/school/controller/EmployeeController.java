package ar.com.school.controller;

import ar.com.school.models.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/employee/")
public class EmployeeController {

    @GetMapping(value = "api/v1/employee/{id}")
    public EmployeeDTO getEmployee(@PathVariable("id") Long idStudent){
        return null;
    }

    @GetMapping(value = "api/v1/employee/{employeeType}")
    public List<EmployeeDTO> getProfessor(@PathVariable("employeeType") String employeeType){
        return null;
    }

    @PostMapping(value = "api/v1/employee/")
    public void postEmployee(EmployeeDTO input){
    }

    @PutMapping(value = "api/v1/employee/")
    public List<EmployeeDTO> updateEmployee(EmployeeDTO input){
        return null;
    }

    @DeleteMapping(value = "api/v1/employee/{id}")
    public List<EmployeeDTO> deleteEmployee(@PathVariable("id") Long id){
        return null;
    }
}
