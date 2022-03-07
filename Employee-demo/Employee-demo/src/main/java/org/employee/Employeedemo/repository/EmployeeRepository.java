package org.employee.Employeedemo.repository;

import org.employee.Employeedemo.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 

 
@Repository
public interface EmployeeRepository 
            extends CrudRepository<EmployeeEntity, Long> {
 
}
