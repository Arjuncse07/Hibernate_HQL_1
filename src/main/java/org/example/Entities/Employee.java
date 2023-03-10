package org.example.Entities;



import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name="employee_table")
public class Employee {

    @Id
    @Column(name="employee_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer employeeId;

    @Column(name="employee_name",length=60,nullable=false)
    private String employeeName;

    @Column(name="date_of_joining")
    private Date doj;

    @Column(name="salary")
    private Double salary;

    @Column(name="bonus")
    private BigDecimal bonus;

    @Column(name="designation",length=50)
    private String designation;

    @Column(name="email",unique=true,length=50)
    private String email;

    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public Date getDoj() {
        return doj;
    }
    public void setDoj(Date doj) {
        this.doj = doj;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public BigDecimal getBonus() {
        return bonus;
    }
    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", doj=" + doj + ", salary="
                + salary + ", bonus=" + bonus + ", designation=" + designation + ", email=" + email + "]";
    }

}
