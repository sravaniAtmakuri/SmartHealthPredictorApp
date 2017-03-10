/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author sukhpreet
 */
public class PatientBean {
    
    private String Name, Password, Address, Email, Gender;

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    private int Age;

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmail() {
        return Email;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAge(int Age) {
        int temp = Age;
        this.Age=temp;
    }
    
    
}
