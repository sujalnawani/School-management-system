package org.example.controller;

import org.example.model.Admin;
import org.example.model.Management;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.service.impl.AdminServiceImpl;
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

public class AdminController<Student> {
    @Autowired
    TeacherServiceImpl service;

    @RequestMapping("/register-a")
    @ResponseBody
    String register(@RequestBody Student student) {
        return service.register(student);
    }

    @RequestMapping("/create-multiple-student-a")
    @ResponseBody
    String createMultipleStudent(@RequestBody List<Student> students) {
        return service.createMultipleStudent(students);
    }

    @RequestMapping("/read-single-student-a")
    @ResponseBody
    Student readSingleStudent(@RequestParam int rollNo) {
        return service.readSingleStudent(rollNo);
    }

    @RequestMapping("/read-multiple-student-a")
    @ResponseBody
    List<Student> readMultipleStudent(@RequestParam List<Integer> rollNos) {
        return service.readMultipleStudent(rollNos);
    }

    @RequestMapping("/read-all-student-a")
    @ResponseBody
    List<Student> readAllStudent() {
        return service.readAllStudent();
    }

    @RequestMapping("/update-single-student-a")
    @ResponseBody
    String updateSingleStudent(@RequestBody Student students) {
        return service.updateSingleStudent(students);
    }

    @RequestMapping("/update-multiple-student-a")
    @ResponseBody
    String updateMultipleStudent(@RequestBody List<Student> studentList) {
        return service.updateMultipleStudent(studentList);
    }

    @RequestMapping("/delete-single-student-a")
    @ResponseBody
    String deleteSingleStudent(@RequestParam int rollNo) {
        return service.deleteSingleStudent(rollNo);
    }

    @RequestMapping("/delete-multiple-student-a")
    @ResponseBody
    String deleteMultipleStudent(@RequestParam List<Integer> rollNos) {
        return service.deleteMultipleStudent(rollNos);
    }

    @RequestMapping("/delete-all-student-a")
    @ResponseBody
    String deleteAllStudent() {
        return service.deleteAllStudent();
    }


    @Autowired
    ManagementServiceImpl service1;

    @RequestMapping("/register-teacher-a")
    @ResponseBody
    String registerTeacher(@RequestBody Teacher teacher) {
        return service1.registerTeacher(teacher);
    }

    @RequestMapping("/create-multiple-teacher-a")
    @ResponseBody
    String createMultipleTeacher(@RequestBody List<Teacher> teachers) {
        return service1.createMultipleTeacher(teachers);
    }

    @RequestMapping("/read-single-teacher-a")
    @ResponseBody
    Teacher readSingleTeacher(@RequestParam int id) {
        return service1.readSingleTeacher(id);
    }

    @RequestMapping("/read-multiple-teacher-a")
    @ResponseBody
    List<Teacher> readMultipleTeacher(@RequestParam List<Integer> ids) {
        return service1.readMultipleTeacher(ids);
    }

    @RequestMapping("/read-all-teacher-a")
    @ResponseBody
    List<Teacher> readAllTeacher() {
        return service1.readAllTeacher();
    }

    @RequestMapping("/update-single-teacher-a")
    @ResponseBody
    String updateSingleTeacher(@RequestBody Teacher teachers) {
        return service1.updateSingleTeacher(teachers);
    }

    @RequestMapping("/update-multiple-teacher-a")
    @ResponseBody
    String updateMultipleTeacher(@RequestBody List<Teacher> teacherList) {
        return service1.updateMultipleTeacher(teacherList);
    }

    @RequestMapping("/delete-single-teacher-a")
    @ResponseBody
    String deleteSingleTeacher(@RequestParam int id) {
        return service1.deleteSingleTeacher(id);
    }

    @RequestMapping("/delete-multiple-teacher-a")
    @ResponseBody
    String deleteMultipleTeacher(@RequestParam List<Integer> ids) {

        return service1.deleteMultipleTeacher(ids);
    }

    @RequestMapping("/delete-all-teacher-a")
    @ResponseBody
    String deleteAllTeacher() {
        return service1.deleteAllTeacher();
    }

    @Autowired
    AdminServiceImpl service2;

    @RequestMapping("/register-management")
    @ResponseBody
    String registerManagement(@RequestBody Management management) {
        return service2.registerManagement(management);
    }

    @RequestMapping("/create-multiple-management")
    @ResponseBody
    String createMultipleManagement(@RequestBody List<Management> managements) {
        return service2.createMultipleManagement(managements);
    }

    @RequestMapping("/read-single-management")
    @ResponseBody
    Management readSingleManagement(@RequestParam int id) {
        return service2.readSingleManagement(id);
    }

    @RequestMapping("/read-multiple-management")
    @ResponseBody
    List<Management> readMultipleManagement(@RequestParam List<Integer> ids) {
        return service2.readMultipleManagement(ids);
    }

    @RequestMapping("/read-all-management")
    @ResponseBody
    List<Management> readAllManagement() {
        return service2.readAllManagement();
    }

    @RequestMapping("/update-single-management")
    @ResponseBody
    String updateSingleManagement(@RequestBody Management management) {
        return service2.updateSingleManagement(management);
    }

    @RequestMapping("/update-multiple-management")
    @ResponseBody
    String updateMultipleManagement(@RequestBody List<Management> managementList) {
        return service2.updateMultipleManagement(managementList);
    }

    @RequestMapping("/delete-single-management")
    @ResponseBody
    String deleteSingleManagement(@RequestParam int id) {
        return service2.deleteSingleManagement(id);
    }

    @RequestMapping("/delete-multiple-management")
    @ResponseBody
    String deleteMultipleManagement(@RequestParam List<Integer> ids) {

        return service2.deleteMultipleManagement(ids);
    }

    @RequestMapping("/delete-all-management-m")
    @ResponseBody
    String deleteAllManagement() {
        return service2.deleteAllManagement();
    }

    @Autowired
    AdminServiceImpl service3;

    @RequestMapping("/register-admin")
    @ResponseBody
    String registerAdmin(@RequestBody Admin admin) {
        return service3.registerAdmin(admin);
    }

    @RequestMapping("/create-multiple-admin")
    @ResponseBody
    String createMultipleAdmin(@RequestBody List<Admin> admins) {
        return service3.createMultipleAdmin(admins);
    }

    @RequestMapping("/read-single-admin")
    @ResponseBody
    Admin readSingleAdmin(@RequestParam int id) {
        return service3.readSingleAdmin(id);
    }

    @RequestMapping("/read-multiple-admin")
    @ResponseBody
    List<Admin> readMultipleAdmin(@RequestParam List<Integer> ids) {
        return service3.readMultipleAdmin(ids);
    }

    @RequestMapping("/read-all-admin")
    @ResponseBody
    List<Admin> readAllAdmin() {
        return service3.readAllAdmin();
    }

    @RequestMapping("/update-single-admin")
    @ResponseBody
    String updateSingleAdmin(@RequestBody Admin admin) {
        return service3.updateSingleAdmin(admin);
    }

    @RequestMapping("/update-multiple-admin")
    @ResponseBody
    String updateMultipleAdmin(@RequestBody List<Admin> adminList) {
        return service3.updateMultipleAdmin(adminList);
    }

    @RequestMapping("/delete-single-admin")
    @ResponseBody
    String deleteSingleAdmin(@RequestParam int id) {
        return service3.deleteSingleAdmin(id);
    }

    @RequestMapping("/delete-multiple-admin")
    @ResponseBody
    String deleteMultipleAdmin(@RequestParam List<Integer> ids) {

        return service3.deleteMultipleAdmin(ids);
    }

    @RequestMapping("/delete-all-admin")
    @ResponseBody
    String deleteAllAdmin() {
        return service3.deleteAllAdmin();
    }
}



