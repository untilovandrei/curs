package com.dao;

import java.sql.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.entities.CursValutar;

@Repository
public interface ICursValutarDAO extends CrudRepository<CursValutar, Long>{

  CursValutar findById(long id);

  CursValutar findByCodValuta(String codValuta);

  CursValutar findByCodValutaAndData(String codValuta, Date data);
}
