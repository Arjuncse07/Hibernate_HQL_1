package org.example.Clieny;

import org.example.Entities.Employee;
import org.example.Utils.HibernateUtil;
import org.hibernate.Session;

import java.math.BigDecimal;
import java.util.Date;

public class SaveDataClientTest {
    public static void main(String[] args) {


        try(Session session= HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            Employee employee1= new Employee();
            employee1.setEmployeeName("Sumres Singh");
            employee1.setDesignation("IT Manager");
            employee1.setDoj(new Date());
            employee1.setEmail("sssds2002@yahoo.com");
            employee1.setBonus(new BigDecimal(20000));
            employee1.setSalary(6034343.33);

            Employee employee2= new Employee();
            employee2.setEmployeeName("Dolly Bingel");
            employee2.setDesignation("IT Developer");
            employee2.setDoj(new Date());
            employee2.setEmail("rsds231@gmail.com");
            employee2.setBonus(new BigDecimal(10000));
            employee2.setSalary(4000023.3);


            Employee employee3= new Employee();
            employee3.setEmployeeName("Colly Romi");
            employee3.setDesignation("IT Tester");
            employee3.setDoj(new Date());
            employee3.setEmail("rsfg231@gmail.com");
            employee3.setBonus(new BigDecimal(10000));
            employee3.setSalary(4000023.3);

            Employee employee4= new Employee();
            employee4.setEmployeeName("Romei Dolly");
            employee4.setDesignation("IT Developer");
            employee4.setDoj(new Date());
            employee4.setEmail("rsbbg231@gmail.com");
            employee4.setBonus(new BigDecimal(10000));
            employee4.setSalary(4000023.3);

            Employee employee5= new Employee();
            employee5.setEmployeeName("Simon sf");
            employee5.setDesignation("IT Developer");
            employee5.setDoj(new Date());
            employee5.setEmail("vxvsdse231@gmail.com");
            employee5.setBonus(new BigDecimal(10000));
            employee5.setSalary(4000023.3);


            Employee employee6= new Employee();
            employee6.setEmployeeName("Cathy ");
            employee6.setDesignation("IT Developer");
            employee6.setDoj(new Date());
            employee6.setEmail("rbgdse231@gmail.com");
            employee6.setBonus(new BigDecimal(10000));
            employee6.setSalary(4000023.3);


            Employee employee7= new Employee();
            employee7.setEmployeeName("Xith ");
            employee7.setDesignation("IT Developer");
            employee7.setDoj(new Date());
            employee7.setEmail("asfafa2323@gmail.com");
            employee7.setBonus(new BigDecimal(10000));
            employee7.setSalary(4000023.3);


            session.save(employee1);
            session.save(employee2);
            session.save(employee3);
            session.save(employee4);
            session.save(employee5);
            session.save(employee6);
            session.save(employee7);




            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
