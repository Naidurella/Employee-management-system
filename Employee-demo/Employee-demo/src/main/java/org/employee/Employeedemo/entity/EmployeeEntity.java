package org.employee.Employeedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="TBL_EMPLOYEES")
public class EmployeeEntity {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
    @Column(name="First_name")
    private String firstName;
     
    @Column(name="Last_name")
    private String lastName;
     
    @Column(name="Email", nullable=false, length=200)
    private String email;
    @Column(name="Designation")
    private String designation; 
    @Column(name="Salary")
    private String salary;
    
    @Column(name="Assigned_Project")
    private String assignedProject;
    //Setters and getters
 
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAssignedProject() {
		return assignedProject;
	}

	public void setAssignedProject(String assignedProject) {
		this.assignedProject = assignedProject;
	}

	@Override
    public String toString() {
        return "EmployeeEntity [id=" + id + ", firstName=" + firstName + 
                ", lastName=" + lastName + ", email=" + email   + ", designation=" + designation   + ", salary=" + salary   + ", assignedProject=" + assignedProject + "]";
    }
}
