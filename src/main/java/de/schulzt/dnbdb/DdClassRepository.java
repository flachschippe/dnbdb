package de.schulzt.dnbdb;

import java.util.UUID;

import org.springframework.data.domain.*;
import org.springframework.data.repository.*;

public interface DdClassRepository extends CrudRepository<DdClass, UUID>{
	

	Page<Author> findAll(Pageable pageable);

	DdClass findByTitleIgnoringCase(String name);	

}