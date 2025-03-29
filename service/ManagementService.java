package org.example.service;

//import org.example.model.Student;
import org.example.model.Management;
import org.example.model.Teacher;
import org.example.repository.impl.ManagementRepositoryImpl;
import org.example.repository.impl.TeacherRepositoryImpl;
import org.example.service.impl.ManagementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class ManagementService implements ManagementServiceImpl {
    @Autowired
    ManagementRepositoryImpl repository;
    @Override
    public String registerTeacher(Teacher teacher){
        return repository.registerTeacher(teacher);
    }

    @Override
    public String createMultipleTeacher(List<Teacher> teachers) {
        String[] results=new String[teachers.size()];
        for (int i=0;i<teachers.size();i++){
            results[i]=repository.registerTeacher(teachers.get(i));
        }
        String result=null;
        if (results.length>0){
            result="you have successfully register";
        }
        return result;
    }

    @Override
    public Teacher readSingleTeacher(int id)
    {
        return repository.readSingleTeacher(id);
    }

    @Override
    public List<Teacher> readMultipleTeacher(List<Integer> ids) {
        List<Teacher> teacherList=new ArrayList<>();
        for (int i=0;i<ids.size();i++){
            teacherList.add(repository.readSingleTeacher(ids.get(i)));
        }
        return teacherList;
    }

    @Override
    public List<Teacher> readAllTeacher() {
        return repository.readAllTeacher();
    }

    @Override
    public String updateSingleTeacher(Teacher teachers) {
        return repository.updateSingleTeacher(teachers);

    }

    @Override
    public String updateMultipleTeacher(List<Teacher> teacherList) {
        List<String> results=new ArrayList<>();
        for (int i=0;i<teacherList.size();i++){
            results.add(repository.updateSingleTeacher(teacherList.get(i)));
        }
        String result=null;
        if (results.size()>0){
            result="youn have successfully updated";
        }
        return result;
    }

    @Override
    public String deleteSingleTeacher(int id) {
        return repository.deleteSingleTeacher(id);
    }

    @Override
    public String deleteMultipleTeacher(List<Integer> ids) {
        List<String> results=new ArrayList<>();
        for (int i=0;i<ids.size();i++){
            results.add(repository.deleteSingleTeacher(ids.get(i)));
        }
        String result=null;
        if (results.size()>0){
            result="you have successfully deleted";
        }
        return result;
    }

    @Override
    public String deleteAllTeacher() {
        return repository.deleteAllTeacher();
    }
}


