package com.example.demo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.domain.CaseEntity;

public interface CaseRepository extends JpaRepository<CaseEntity, String> {
	@Query(value = "SELECT * FROM Cases u WHERE u.ID = :case_ref_id", nativeQuery = true)
	List<CaseEntity> findCaseCustom(@Param("case_ref_id") String case_ref_id);

	@Query(value = "Select * From (SELECT rownum as STT,cases.* FROM Cases cases) WHERE STT >:indexTo and STT <=:indexFrom", nativeQuery = true)
	List<CaseEntity> findCaseCustomWithPaging(@Param("indexTo") int indexTo, @Param("indexFrom") int indexFrom);
	
	public static void action() {
		
	}
}
