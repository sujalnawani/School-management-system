package org.example.repository.impl;

import org.example.model.Admin;
import org.example.model.Management;
//import org.example.model.Teacher;

import java.util.List;

public interface AdminRepositoryImpl {
    String register(Management management);
    Management readSingleManagement( int id);
    List<Management> readAllManagement();
    String updateSingleManagement(Management management);
    public String deleteSingleManagement(int id) ;
    String deleteAllManagement();

    String register(Admin admin);
    Admin readSingleAdmin( int id);
    List<Admin> readAllAdmin();
    String updateSingleAdmin(Admin admin);
    public String deleteSingleAdmin(int id) ;
    String deleteAllAdmin();

}
