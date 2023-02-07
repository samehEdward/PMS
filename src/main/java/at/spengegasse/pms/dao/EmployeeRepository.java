package at.spengegasse.pms.dao;

import at.spengegasse.pms.entities.Employee;
import at.spengegasse.pms.entities.Project;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Override
    public List<Employee> findAll();

}
