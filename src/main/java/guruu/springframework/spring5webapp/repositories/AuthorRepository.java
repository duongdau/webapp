package guruu.springframework.spring5webapp.repositories;

import guruu.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepsitory extends CrudRepository<Author, Long> {
}
