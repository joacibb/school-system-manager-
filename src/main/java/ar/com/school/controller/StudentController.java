package ar.com.school.controller;

import ar.com.school.entities.StudentEntity;
import ar.com.school.manager.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping(value = "/api")
public class StudentController{
    @Autowired
    private StudentService studentService;
    @GetMapping(value = "/students/{id}")
    public StudentEntity getStudent(@PathVariable("id") Integer idStudent){
        return studentService.findById(idStudent);
    }

    @GetMapping(value = "/students")
    public List<StudentEntity> getStudents(){
        return studentService.findAll();
    }

    @PostMapping(value = "/student")
    public StudentEntity postStudent(@RequestBody StudentEntity student){
        return studentService.save(student);
    }

    @PutMapping(value = "/student/{id}")
    public <Integer> StudentEntity updateStudent(@PathVariable("id") Integer idStudent, StudentEntity student){
        StudentEntity actuallyStudent = studentService.findById((java.lang.Integer) idStudent);
        actuallyStudent.setCurse(student.getCourse());
        actuallyStudent.setEmail(student.getEmail());
        actuallyStudent.setName(student.getName());
        actuallyStudent.setSurname(student.getSurname());
        actuallyStudent.setPhone(student.getPhone());

        return studentService.save(actuallyStudent);
    }

    @DeleteMapping(value = "/student/{id}")
    public void deleteStudent(@PathVariable("id") Integer id){
        studentService.delete(id);
    }
}
