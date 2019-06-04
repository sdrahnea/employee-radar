package com.er.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import javax.persistence.*;
import java.util.*;

/**
 * Created by sdrahnea
 */
@Entity
@Table(name = "employee")
public class Employee extends CoreEntity {

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "hire_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date hireDate;

  @Column(name = "dismissal_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date dismissalDate;

  @Column(name = "birth_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date birthDate;

  @JoinColumn(name="employee_id")
  @OneToMany(cascade = CascadeType.ALL)
  @LazyCollection(LazyCollectionOption.FALSE)
  private List<EmployeeSkill> employeeSkills = new LinkedList<>();

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

  public Date getHireDate() {
    return hireDate;
  }

  public void setHireDate(Date hireDate) {
    this.hireDate = hireDate;
  }

  public Date getDismissalDate() {
    return dismissalDate;
  }

  public void setDismissalDate(Date dismissalDate) {
    this.dismissalDate = dismissalDate;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public List<EmployeeSkill> getEmployeeSkills() {
    return employeeSkills;
  }

  public void setEmployeeSkills(List<EmployeeSkill> employeeSkills) {
    this.employeeSkills = employeeSkills;
  }

}
