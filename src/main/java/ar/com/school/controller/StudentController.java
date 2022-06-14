package ar.com.school.controller;

import ar.com.school.entities.StudentEntity;
import ar.com.school.manager.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping(value = "/api/v1/student")
public class StudentController<Integer> {

    private StudentService studentService;
    @GetMapping(value = "api/v1/student/{id}")
    public StudentEntity getStudent(@PathVariable("id") Integer idStudent){
        return studentService.findById((java.lang.Integer) idStudent);
    }

    @GetMapping(value = "api/v1/students/{course}")
    public List<StudentEntity> getStudents(@PathVariable("course") Integer course){
        return studentService.findAll();
    }

    @PostMapping(value = "api/v1/student/")
    public StudentEntity postStudent(@RequestBody StudentEntity student){
        return studentService.save(student);
    }

    @PutMapping(value = "api/v1/student/{id}")
    public <Integer> StudentEntity updateStudent(@PathVariable("id") Integer idStudent, StudentEntity student){
        StudentEntity actuallyStudent = studentService.findById((java.lang.Integer) idStudent);
        actuallyStudent.setCurse(student.getCourse());
        actuallyStudent.setEmail(student.getEmail());
        actuallyStudent.setName(student.getName());
        actuallyStudent.setSurname(student.getSurname());
        actuallyStudent.setPhone(student.getPhone());

        return studentService.save(actuallyStudent);
    }

    @DeleteMapping(value = "api/v1/student/{id}")
    public void deleteStudent(@PathVariable("id") Integer id){
        studentService.delete((java.lang.Integer) id);
    }
}
