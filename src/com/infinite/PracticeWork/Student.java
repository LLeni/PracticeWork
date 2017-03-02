package com.infinite.PracticeWork;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Student {
    final private DateFormat dateFormat =  DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.GERMAN);
    private String group;
    private String firstName;
    private String lastName;
    private Date date;

    public Student(String group, String firstName, String lastName, String dateS){
        this.group = group;
        this.firstName = firstName;
        this.lastName = lastName;
        setDate(dateS);


    }

    public Student(){

    }

    @Override
    public String toString(){
        return group + " " + firstName + " " + lastName + " " + dateFormat.format(date);
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(String dateS) {
        try {
            this.date = dateFormat.parse(dateS);
        } catch (ParseException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
