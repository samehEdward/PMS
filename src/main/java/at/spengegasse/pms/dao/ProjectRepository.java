package at.spengegasse.pms.dao;

import at.spengegasse.pms.entities.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
