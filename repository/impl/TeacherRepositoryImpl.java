package org.example.repository.impl;

import org.example.model.Student;

import java.util.List;

public interface TeacherRepositoryImpl {
    String register(Student student);
    Student readSingleStudent( int rollNo);
    List<Student> readAllStudent();
    String updateSingleStudent(Student students);
    public String deleteSingleStudent(int rollNo) ;
    String deleteAllStudent();


    }
