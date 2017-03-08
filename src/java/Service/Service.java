/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import ConnectDB.ConnectDB;
import bean.LoginBean;
import bean.PatientBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author sukhpreet
 */
public class Service {
    int i=0;
    
    public boolean login(String userName, String password)
    {
       
        boolean flag=false;
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="select * from Login";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                String name=rs.getString("UserName");
                String pass=rs.getString("password");
                
                if(userName.equals(name) && password.equals(pass))
                {
                    
                    flag=true;
                    break;
                }
            }
        }
        catch(Exception e)
        {
                System.out.println("Exception in login - " + e);
        }
        return flag;
    }
    
    public int insertPatient(PatientBean obj)
    {
        String gid=null;
        int j=0,k=0;
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query1="insert into Patient(Name,Password,Age,Gender,Email,Address) values('"+obj.getName()+"','"+obj.getPassword()+"','"+obj.getAge()+"','"+obj.getGender()+"','"+obj.getEmail()+"','"+obj.getAddress()+"')";
            j=stmt.executeUpdate(query1);   
        }
        catch(Exception ex)
        {
            System.out.println("Exception found in 'inserting Patient info'"+ex);
        }
        
        if (j>0)
        {
            i=i+1;
        }
        else
        {
            System.out.println("NOT inserted in PATIENT table");
        }
        return i;
        
        
    }
    
    public int insertPatientLoginDetails(LoginBean obj)
    {
      
        int j=0;
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="insert into Login(UserName,password,type) values('"+obj.getUserName()+"','"+obj.getPassword()+"','"+obj.getType()+"')";
            j=stmt.executeUpdate(query);   
        }
        catch(Exception ex)
        {
            System.out.println("Exception found in 'inserting Patient Login Details'" + ex);
        }
        
        if (j>0)
        {
            i=i+1;
        }
        else
        {
            System.out.println("NOT inserted Patient's details in LOGIN table");
        }
        return i;
    }
    
    public LoginBean getUserType(String Username, String password)
    {
    
        LoginBean bean = new LoginBean();
        try 
        {
            Connection con=ConnectDB.connectToDB();
             Statement stmt=con.createStatement();
             String query="select * from Login where UserName='"+Username+"' and password='"+password+"'";
             ResultSet rs=stmt.executeQuery(query);
             while(rs.next())
             {
                 
                 int type=rs.getInt("type");
                 bean.setType(type);
             }
            
        } catch (Exception e) 
        {
            System.out.println("Exception in getting User type while logging in." + e);
        }
        return bean;
    }
    
}
