package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.CaseEntity;

@SpringBootApplication
@RestController
@RequestMapping(path = "login")
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@GetMapping
	public List<CaseEntity> hello() {
		List<CaseEntity> listResult = new ArrayList<>();
		try {
			CaseEntity cases = new CaseEntity();
			cases.setId("1");
			cases.setPMid("SW06800123456");
			cases.setBranch("06800");
			cases.setDepartment("00021");
			cases.setSubDepartment("04");
			cases.setUserHandle("noname");
			listResult.add(cases);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listResult;
	}
}
