package com.dao;

import java.sql.Date;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.entities.Numerar;
import com.entities.SchimbValutar;

@Repository
public interface ISchimbValutarDAO extends CrudRepository<SchimbValutar, Long>{

  SchimbValutar findById(long id);
}
