package org.example.controller;

import org.example.model.Student;
import org.example.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class StudentController {
    @Autowired
    TeacherServiceImpl service;

    @RequestMapping("/update-single-student-self")
    @ResponseBody
    String updateSingleStudentSelf(@RequestBody Student students){
        return service.updateSingleStudent(students);
    }
    @RequestMapping("/read-single-student-self")
    @ResponseBody
    Student readSingleStudentSelf(@RequestParam int rollNo){
        return service.readSingleStudent(rollNo);
    }
}
