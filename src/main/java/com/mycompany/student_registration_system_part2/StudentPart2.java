package com.mycompany.student_registration_system_part2;
import com.mycompany.studentregpart1.CourseProgramme;
import com.mycompany.studentregpart1.Module;
import com.mycompany.studentregpart1.Student;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neko
 */
public class StudentPart2 {
    
    public static void main (String args[]){
    Student s1 = new Student("Alice", 18, new DateTime("1998-06-21"));
    Student s2 = new Student("John", 18, new DateTime("1998-02-04"));
    Student s3 = new Student("Sean", 19, new DateTime("1997-09-18"));
  
    //ArrayList<Student> theList = new ArrayList<Student>();
    Module m = new Module ("Software Engineering III", 417 );
    m.registerNewStudent(s1);
    m.registerNewStudent(s2);
    m.registerNewStudent(s3);
    
    CourseProgramme c = new CourseProgramme("4BCT1", new DateTime(2016-02-01), new DateTime(2017-03-31));
    c.addModule(m); 
    
    
    List x = new ArrayList();
    x.add(s1);
    x.add(s2);
    x.add(s3);
    
    for(Iterator<Student> i = x.iterator(); i.hasNext(); ) {   
            Student item = i.next();
            System.out.println(item.getUsername());
            System.out.println(m.getModName());
            System.out.println(c.getCName());
        }
}
}
