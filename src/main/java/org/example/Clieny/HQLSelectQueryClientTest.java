package org.example.Clieny;

import org.example.Entities.Employee;
import org.example.Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class HQLSelectQueryClientTest {
    public static void main(String[] args) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        //getAllEmployees(sf);
        getEmployeeById(sf);
    }

    private static void getEmployeeById(SessionFactory sf) {
        int empId=4;
        try(Session session = sf.openSession() ) {
            String HQL = "FROM Employee WHERE employeeId=?0";
            Query<Employee> query = session.createQuery(HQL, Employee.class);
            query.setParameter(0, empId);

            Employee employee = query.uniqueResult();
            System.out.println(employee);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    private static void getAllEmployees(SessionFactory sf) {
//        try (Session session = sf.openSession()) {
//
//            String HQL = "FROM Employee";
//            //String HQL ="FROM com.infotech.entities.Employee";
//
//            Query<Employee> query = session.createQuery(HQL, Employee.class);
//
//            List<Employee> list = query.list();
//            list.forEach(System.out::println);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
