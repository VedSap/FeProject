package FeProject;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DataRepository extends CrudRepository<DataEntity, Long> {

}
