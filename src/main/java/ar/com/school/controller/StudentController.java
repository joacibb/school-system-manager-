package ar.com.school.controller;

import ar.com.school.models.StudentDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/student")
public class StudentController {


    @GetMapping(value = "api/v1/student/{id}")
    public StudentDTO getStudent(@PathVariable("id") Long idStudent){
        return null;
    }

    @GetMapping(value = "api/v1/students/{curso}")
    public List<StudentDTO> getStudent(@PathVariable("curso") Integer curso){
        return null;
    }

    @PostMapping(value = "api/v1/student/")
    public void postStudent(StudentDTO input){
    }

    @PutMapping(value = "api/v1/student/")
    public List<StudentDTO> updateStudent(StudentDTO input){
        return null;
    }

    @DeleteMapping(value = "api/v1/student/{id}")
    public List<StudentDTO> deleteStudent(@PathVariable("id") Long id){
        return null;
    }
}
