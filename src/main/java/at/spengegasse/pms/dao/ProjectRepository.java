package at.spengegasse.pms.dao;

import at.spengegasse.pms.entities.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long>
{
    @Override
    public List<Project> findAll();
}
