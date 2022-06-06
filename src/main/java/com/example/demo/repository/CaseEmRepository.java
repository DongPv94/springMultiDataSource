package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.CaseEntity;

@Repository
public class CaseEmRepository {
	@Autowired
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<CaseEntity> findAll() {
		final StringBuilder SQL = new StringBuilder().append("Select * from Cases where rownum <10\r\n");
		final Query nativeQuery = this.em.createNativeQuery(SQL.toString(), CaseEntity.class);
		return nativeQuery.getResultList();
	}

	@Transactional
	public void save(CaseEntity entity) {
		this.em.persist(entity);
	}
}
