package com.api.rep.dao;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.rep.entity.UsuarioBio;

@Repository
@Transactional(value = TxType.NEVER)
public interface UsuarioBioRepository extends JpaRepository<UsuarioBio, Integer> {

	@Query(value = "SELECT u from UsuarioBio u where u.pis = :pis")
	UsuarioBio buscarPorPis(@Param("pis") String pis);

}
