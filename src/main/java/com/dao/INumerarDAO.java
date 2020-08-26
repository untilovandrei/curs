package com.dao;

import java.sql.Date;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.entities.Numerar;

@Repository
public interface INumerarDAO extends CrudRepository<Numerar, Long>{

  Numerar findById(long id);

  Numerar findByUtilizatorAndCodValutaAndSumaAndData(String utilizator, String codValuta, Double suma, Date data);

  Numerar findByUtilizatorAndCodValutaAndData(String utilizator, String codValuta, Date data);
}
