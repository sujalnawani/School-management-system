package org.example.repository;

import org.example.model.Admin;
import org.example.model.Management;
import org.example.model.Student;
import org.example.repository.impl.AdminRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
@Repository

public class AdminRepository implements AdminRepositoryImpl {
    private static final String deleteMessage="You have successfully deleted ";
    private static final String deleteQuery="delete from management ";
    private static final String where_id="where id='";
    private static final String update_management_set="update management set ";
    private static final String updateMessage="You have successfully updated";
    private static final String readQuery="select * from management ";
    private static final String registerMessage="You have successfully registerd";
    private static final String registerQuery="insert into management values('";
    private Statement databaseCode(){
        Statement st=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/smartstart08";
            String user="root";
            String pass="ss08";
            Connection con= DriverManager.getConnection(url,user,pass);
            st= con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
        return st;
    }
    @Override
    public String register(Management management) {
        String result=null;
        try{
            Statement st=databaseCode();
            int count=st.executeUpdate(registerQuery+management.getId()+"','"+management.getName()+"','"+management.getEmail()+"')");
            if(count>0){
                result=registerMessage;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    } @Override
    public Management readSingleManagement(int id) {
        Management management=new Management();
        try{
            Statement st=databaseCode();
            ResultSet rs=st.executeQuery(readQuery+where_id+ id+"'");
            while (rs.next()){
                management.setId(rs.getInt(1));
                management.setName(rs.getString(2));
                management.setEmail(rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return management;
    }

    @Override
    public List<Management> readAllManagement() {
        List<Management> managementList=new ArrayList<>();
        try {
            Statement st=databaseCode();
            ResultSet rs = st.executeQuery(readQuery);
            while (rs.next()) {
                Management management=new Management();
                management.setId(rs.getInt(1));
                management.setName(rs.getString(2));
                management.setEmail(rs.getString(3));
                managementList.add(management);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return managementList;
    }

    @Override
    public String updateSingleManagement(Management managements) {
        String result=null;
        try{
            Statement st=databaseCode();
            int count=0;
            if(managements.getName()!=null&& managements.getEmail()!=null){
                count=st.executeUpdate(update_management_set+"name='"+managements.getName()+"',email='"+managements.getEmail()+"'"+where_id+managements.getId()+"'");
            }
            else {
                if(managements.getName()!=null){
                    count=st.executeUpdate(update_management_set+"name='"+managements.getName()+"'"+where_id+managements.getId()+"'");
                }
                else {
                    count=st.executeUpdate(managements+"email='"+managements.getEmail()+"'"+where_id+managements.getId()+"'");

                }
            }
            if(count>0){
                result=updateMessage;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

    @Override
    public String deleteSingleManagement(int id) {
        String result=null;
        try{
            Statement st=databaseCode();
            int count=st.executeUpdate(deleteQuery+where_id+id+"'");
            if(count>0){
                result="you have successfully deleted";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

    @Override
    public String deleteAllManagement() {
        String result=null;
        try{
            Statement st=databaseCode();
            int count=st.executeUpdate(deleteQuery);
            if(count>0){
                result=deleteMessage;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

    private static final String deleteMessageAdmin="You have successfully deleted ";
    private static final String deleteQueryAdmin="delete from admin ";
    private static final String where_id_admin="where id='";
    private static final String update_admin_set="update admin set ";
    private static final String updateMessageAdmin="You have successfully updated ";
    private static final String readQueryAdmin="select * from admin ";
    private static final String registerMessageAdmin="You have successfully registerd";
    private static final String registerQueryAdmin="insert into admin values('";
    private Statement databaseCodeAdmin(){
        Statement st=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/smartstart08";
            String user="root";
            String pass="ss08";
            Connection con= DriverManager.getConnection(url,user,pass);
            st= con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
        return st;
    }
    @Override
    public String register(Admin admin) {
        String result=null;
        try{
            Statement st=databaseCodeAdmin();
            int count=st.executeUpdate(registerQueryAdmin+admin.getId()+"','"+admin.getName()+"','"+admin.getEmail()+"')");
            if(count>0){
                result=registerMessageAdmin;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
    public Admin readSingleAdmin(int id) {
        Admin admin=new Admin();
        try{
            Statement st=databaseCodeAdmin();
            ResultSet rs=st.executeQuery(readQueryAdmin+where_id+ id+"'");
            while (rs.next()){
                admin.setId(rs.getInt(1));
                admin.setName(rs.getString(2));
                admin.setEmail(rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return admin;
    }

    @Override
    public List<Admin> readAllAdmin() {
        List<Admin> adminList=new ArrayList<>();
        try {
            Statement st=databaseCodeAdmin();
            ResultSet rs = st.executeQuery(readQueryAdmin);
            while (rs.next()) {
                Admin admin=new Admin();
                admin.setId(rs.getInt(1));
                admin.setName(rs.getString(2));
                admin.setEmail(rs.getString(3));
                adminList.add(admin);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return adminList;
    }

    @Override
    public String updateSingleAdmin(Admin admins) {
        String result=null;
        try{
            Statement st=databaseCodeAdmin();
            int count=0;
            if(admins.getName()!=null&& admins.getEmail()!=null){
                count=st.executeUpdate(update_admin_set+"name='"+admins.getName()+"',email='"+admins.getEmail()+"'"+where_id_admin+admins.getId()+"'");
            }
            else {
                if(admins.getName()!=null){
                    count=st.executeUpdate(update_admin_set+"name='"+admins.getName()+"'"+where_id_admin+admins.getId()+"'");
                }
                else {
                    count=st.executeUpdate(update_admin_set+"email='"+admins.getEmail()+"'"+where_id_admin+admins.getId()+"'");

                }
            }
            if(count>0){
                result=updateMessageAdmin;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

    @Override
    public String deleteSingleAdmin(int id) {
        String result=null;
        try{
            Statement st=databaseCodeAdmin();
            int count=st.executeUpdate(deleteQueryAdmin+where_id+id+"'");
            if(count>0){
                result="you have successfully deleted";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

    @Override
    public String deleteAllAdmin() {
        String result=null;
        try{
            Statement st=databaseCodeAdmin();
            int count=st.executeUpdate(deleteQueryAdmin);
            if(count>0){
                result=deleteMessageAdmin;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
}
