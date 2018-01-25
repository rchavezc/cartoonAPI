package api.cartoon.dao;

import api.cartoon.entity.Cartoon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface CartoonDao extends CrudRepository<Cartoon, String> {
    @Query("SELECT cartoon FROM Cartoon cartoon WHERE cartoon.birthDate = :date")
    Cartoon findByBirthDate(@Param("date") String date);
}
