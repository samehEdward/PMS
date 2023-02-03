package at.spengegasse.pms.dao;

import at.spengegasse.pms.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
