package com.er.model;

import javax.persistence.*;

/**
 * Created by sdrahnea
 */
@Entity
@Table(name = "employee_skill")
public class EmployeeSkill extends CoreEntity {

  @JoinColumn(name = "employee_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private Employee employee;

  @JoinColumn(name = "skill_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private Skill skill;

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public Skill getSkill() {
    return skill;
  }

  public void setSkill(Skill skill) {
    this.skill = skill;
  }
}
