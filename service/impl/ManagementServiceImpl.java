package org.example.service.impl;

import org.example.model.Teacher;

import java.util.List;

public interface ManagementServiceImpl {
    public String registerTeacher(Teacher teacher);
    String createMultipleTeacher(List<Teacher> teachers);
    Teacher readSingleTeacher( int id);
    List<Teacher> readMultipleTeacher( List<Integer> ids);
    List<Teacher> readAllTeacher();
    String updateSingleTeacher(Teacher teachers);
    String updateMultipleTeacher( List<Teacher> List);
    String deleteSingleTeacher( int id);
    String deleteMultipleTeacher( List<Integer> ids);
    String deleteAllTeacher();

}
