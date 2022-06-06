//package com.example.demo.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.domain.PaymentMsg;
//
//@CrossOrigin(origins = "*")
//@RestController
//@RequestMapping(path = "paymenthub/rest")
//public class PaymentController {
//
//	@Autowired
//	PaymentMsgRepository repo;
//
//	@GetMapping("/cm/getDataPaymentPagingForUser")
//	public List<PaymentMsg> findAll(@Param("userLogin") String userLogin, @Param("pmid") String pmid) {
//		List<PaymentMsg> result = new ArrayList<>();
//		try {
//			if (StringUtils.isBlank(pmid)) {
//				result = repo.findListMyPayment("LTHLIEN");
//			} else {
//				result = repo.findListMyPaymentWithPmid("LTHLIEN", pmid);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return result;
//	}
//}
