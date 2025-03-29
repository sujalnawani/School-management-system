package org.example.service.impl;

import org.example.model.Management;
import org.example.model.Student;
import org.example.model.Teacher;

import java.util.List;

public interface TeacherServiceImpl {
    public String register(Student student);
   String createMultipleStudent(List<Student> students);
  Student readSingleStudent( int rollNo);
  List<Student> readMultipleStudent( List<Integer> rollNos);
  List<Student> readAllStudent();
  String updateSingleStudent(Student students);
    String updateMultipleStudent( List<Student> studentList);
  String deleteSingleStudent( int rollNo);
    String deleteMultipleStudent( List<Integer> rollNos);
    String deleteAllStudent();


}
