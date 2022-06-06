package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.CaseEntity;
import com.example.demo.repository.CaseEmRepository;
import com.example.demo.repository.CaseRepository;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:8080/")
@RestController
@RequestMapping(path = "paymenthub/api/v1")

public class CaseController {

	@Autowired
	CaseRepository repo;

	@Autowired
	private CaseEmRepository caseRepo;

	@GetMapping("/findAll")
	@PreAuthorize("hasRole('STUDENT')")
	public List<CaseEntity> hello() {
		List<CaseEntity> listResult = new ArrayList<>();
		try {
			listResult = caseRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listResult;
	}

	@GetMapping("/cm/getDataPaymentPagingForUser")
	public List<CaseEntity> findAll(@Param("userLogin") String userLogin, @Param("pmid") String pmid) {
		List<CaseEntity> result = new ArrayList<>();
		try {
			result = repo.findCaseCustomWithPaging(0, 50);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@PostMapping("/save")
	public void saveCase(@RequestBody CaseEntity caseEntity) {
		caseRepo.save(caseEntity);
	}
}
