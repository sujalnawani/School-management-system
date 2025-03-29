package org.example.controller;

import org.example.model.Management;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.service.impl.ManagementServiceImpl;
import org.example.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    TeacherServiceImpl service;

    @RequestMapping("/register")
    @ResponseBody
    String register(@RequestBody Student student){
           return service.register(student);
    }
    @RequestMapping("/create-multiple-student")
    @ResponseBody
    String createMultipleStudent(@RequestBody List<Student> students){
        return service.createMultipleStudent(students);
    }
    @RequestMapping("/read-single-student")
    @ResponseBody
    Student readSingleStudent(@RequestParam int rollNo){
        return service.readSingleStudent(rollNo);
    }
    @RequestMapping("/read-multiple-student")
    @ResponseBody
    List<Student> readMultipleStudent(@RequestParam List<Integer> rollNos){
        return service.readMultipleStudent(rollNos);
    }
    @RequestMapping("/read-all-student")
    @ResponseBody
    List<Student> readAllStudent(){
        return service.readAllStudent();
    }
    @RequestMapping("/update-single-student")
    @ResponseBody
    String updateSingleStudent(@RequestBody Student students){
        return service.updateSingleStudent(students);
    }
    @RequestMapping("/update-multiple-student")
    @ResponseBody
    String updateMultipleStudent(@RequestBody List<Student> studentList){
        return service.updateMultipleStudent(studentList);
    }
    @RequestMapping("/delete-single-student")
    @ResponseBody
    String deleteSingleStudent(@RequestParam int rollNo){
        return service.deleteSingleStudent(rollNo);
    }
    @RequestMapping("/delete-multiple-student")
    @ResponseBody
    String deleteMultipleStudent(@RequestParam List<Integer> rollNos){
        return service.deleteMultipleStudent(rollNos);
    }
    @RequestMapping("/delete-all-student")
    @ResponseBody
    String deleteAllStudent(){
        return service.deleteAllStudent();
  }
    @Autowired
    ManagementServiceImpl service1;

    @RequestMapping("/update-single-teacher-self")
    @ResponseBody
    String updateSingleTeacherSelf(@RequestBody Teacher teacher){
        return service1.updateSingleTeacher(teacher);
    }
    @RequestMapping("/read-single-teacher-self")
    @ResponseBody
    Teacher readSingleTeacherSelf(@RequestParam int id){
        return service1.readSingleTeacher(id);
    }

} 
