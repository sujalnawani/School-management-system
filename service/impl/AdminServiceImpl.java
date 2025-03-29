package org.example.service.impl;

//import org.example.model.Teacher;

import org.example.model.Admin;
import org.example.model.Management;

import java.util.List;

public interface AdminServiceImpl {
    public String registerManagement(Management management);
    String createMultipleManagement(List<Management> managements);
    Management readSingleManagement( int id);
    List<Management> readMultipleManagement( List<Integer> ids);
    List<Management> readAllManagement();
    String updateSingleManagement(Management managements);
    String updateMultipleManagement( List<Management> List);
    String deleteSingleManagement( int id);
    String deleteMultipleManagement( List<Integer> ids);
    String deleteAllManagement();

    public String registerAdmin(Admin admin);
    String createMultipleAdmin(List<Admin> admins);
    Admin readSingleAdmin( int id);
    List<Admin> readMultipleAdmin( List<Integer> ids);
    List<Admin> readAllAdmin();
    String updateSingleAdmin(Admin admins);
    String updateMultipleAdmin( List<Admin> List);
    String deleteSingleAdmin( int id);
    String deleteMultipleAdmin( List<Integer> ids);
    String deleteAllAdmin();
}

