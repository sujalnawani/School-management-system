package org.example.repository;

//import org.example.model.Student;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.repository.impl.ManagementRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
@Repository


public class ManagementRepository implements ManagementRepositoryImpl {
    private static final String deleteMessage = "You have successfully deleted ";
    private static final String deleteQuery = "delete from teacher ";
    private static final String where_id = "where id='";
    private static final String update_teacher_set = "update teacher set ";
    private static final String updateMessage = "You have successfully updated ";
    private static final String readQuery = "select * from teacher ";
    private static final String registerMessage = "You have successfully registerd";
    private static final String registerQuery = "insert into teacher values('";

    private Statement databaseCode() {
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/smartstart08";
            String user = "root";
            String pass = "ss08";
            Connection con = DriverManager.getConnection(url, user, pass);
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
        return st;
    }

    @Override
    public String registerTeacher(Teacher teacher) {
        String result = null;
        try {
            Statement st = databaseCode();
            int count = st.executeUpdate(registerQuery + teacher.getId() + "','" + teacher.getName() + "','" + teacher.getEmail() + "')");
            if (count > 0) {
                result = registerMessage;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
    @Override
    public Teacher readSingleTeacher(int id) {
        Teacher teacher=new Teacher();
        try{
            Statement st=databaseCode();
            ResultSet rs=st.executeQuery(readQuery+where_id+ id+"'");
            while (rs.next()){
                teacher.setId(rs.getInt(1));
                teacher.setName(rs.getString(2));
                teacher.setEmail(rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return teacher;
    }

    @Override
    public List<Teacher> readAllTeacher() {
        List<Teacher> teacherList=new ArrayList<>();
        try {
            Statement st=databaseCode();
            ResultSet rs = st.executeQuery(readQuery);
            while (rs.next()) {
                Teacher teacher=new Teacher();
                teacher.setId(rs.getInt(1));
                teacher.setName(rs.getString(2));
                teacher.setEmail(rs.getString(3));
                teacherList.add(teacher);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return teacherList;
    }

    @Override
    public String updateSingleTeacher(Teacher teachers) {
        String result=null;
        try{
            Statement st=databaseCode();
            int count=0;
            if(teachers.getName()!=null&& teachers.getEmail()!=null){
                count=st.executeUpdate(update_teacher_set+"name='"+teachers.getName()+"',email='"+teachers.getEmail()+"'"+where_id+teachers.getId()+"'");
            }
            else {
                if(teachers.getName()!=null){
                    count=st.executeUpdate(update_teacher_set+"name='"+teachers.getName()+"'"+where_id+teachers.getId()+"'");
                }
                else {
                    count=st.executeUpdate(update_teacher_set+"email='"+teachers.getEmail()+"'"+where_id+teachers.getId()+"'");

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
    public String deleteSingleTeacher(int id) {
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
    public String deleteAllTeacher() {
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
}

