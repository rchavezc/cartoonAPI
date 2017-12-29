package api.cartoon.dao;

import api.cartoon.entity.Cartoon;
import org.springframework.data.repository.CrudRepository;

public interface CartoonDao extends CrudRepository<Cartoon, String> {
}
